#!/usr/bin/env groovy

import javax.management.remote.*
import javax.management.*
import groovy.jmx.builder.*
import groovy.util.CliBuilder

class SqlStatistika {
    
  static main(args) {

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z")
        
        def cli = new CliBuilder(usage:'sql-stats.groovy [options] [parameters]',header:'Options:',stopAtNonOption:false)
        cli.H(longOpt:'help', 'display this help')
        cli.F(longOpt:'stopwatch', args:1, argName:'stopwatch', 'stopwatch name')
     
        def options = cli.parse(args)
        if (options==null)
            return
        if (options.help) {
            cli.usage()
            return
        }

        def stopwatchName = (options.stopwatch) ? options.stopwatch : null

        // Setup JMX connection.
        def connection = new JmxBuilder().client(port: 8090, host: 'localhost')
        connection.connect()

        // Get the MBeanServer.
        def mbeans = connection.MBeanServerConnection

        //println "Total MBeans: ${mbeans.MBeanCount}\n"

        // Create GroovyMBean.
        def simon = new GroovyMBean(mbeans, 'sql-processor:type=Stopwatch,name=catalog.'+stopwatchName)
        //println mbean  // Outputs all attributes and operations.

        def sample = simon.sample()
        println ""
        println "Statistics for catalog."+stopwatchName
        println "  counter            : "+sample.counter
        println "  total              : "+nanos(sample.total)
        println "  mean               : "+nanos(sample.mean)
        println ""
        println "  max                : "+nanos(sample.max)
        println "  maxTimestamp       : "+sdf.format(sample.maxTimestamp)
        println "  min                : "+nanos(sample.min)
        println "  minTimestamp       : "+sdf.format(sample.minTimestamp)
        println "  last               : "+nanos(sample.last)
        println ""
        println "  active             : "+sample.active
        println "  maxActive          : "+sample.maxActive
        println "  maxActiveTimestamp : "+sdf.format(sample.maxActiveTimestamp)
        println ""
        println "  note               : "+sample.note
        println "  standardDeviation  : "+sample.standardDeviation
        println "  variance           : "+sample.variance
        println "  varianceN          : "+sample.varianceN
        println ""
    }


    static String nanos(Long val) {
        String res = ""
        if (val > 1000000000)
          res += ((int)(val / 1000000000))+"s "
        val %= 1000000000
        if (val > 1000000)
          res += dorovnejNanos((int)(val / 1000000))+"ms "
        val %= 1000000
        if (val > 1000)
          res += dorovnejNanos((int)(val / 1000))+"\u00B5s "
        val %= 1000
          res += dorovnejNanos((int)(val))+"ns"
        return res
    }
    
    static String nanos(Double val) {
        String res = ""
        if (val > 1000000000)
          res += ((int)(val / 1000000000))+"s "
        val %= 1000000000
        if (val > 1000000)
          res += dorovnejNanos((int)(val / 1000000))+"ms "
        val %= 1000000
        if (val > 1000)
          res += dorovnejNanos((int)(val / 1000))+"\u00B5s "
        val %= 1000
          res += dorovnejNanos((int)(val))+"ns"
        return res
    }

    static String dorovnejNanos(final int number) {
        if (number < 10) {
            return "  " + number;
        }
        if (number < 100) {
            return " " + number;
        }
        return number
    }

    // export MAVEN_OPTS="-Dcom.sun.management.jmxremote -Djava.rmi.server.hostname=localhost -Dcom.sun.management.jmxremote.port=8090 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false"
    // ./sql-stats.groovy --stopwatch INSERT_ITEM
}

