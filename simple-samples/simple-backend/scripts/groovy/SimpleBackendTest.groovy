#!/usr/bin/env groovy

@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.6')
@GrabExclude('asm:*')

import groovyx.net.http.*
import groovy.json.JsonBuilder
/**
 * @author Tomáš Hudec
 *
 */
class SimpleBackendTest {

    static main(args) {

        def cli = new CliBuilder(usage:'groovy SimpleBackendTest.groovy',header:'Volby:',stopAtNonOption:false)
        cli.H(longOpt:'help', 'help')
        cli.S(longOpt:'server', args:1, argName:'server', 'host:port application server')
        cli.A(longOpt:'action', args:1, argName:'action', 'action')
        cli.M(longOpt:'method', args:1, argName:'method', 'method')
        cli.D(longOpt:'data', args:1, argName:'data', 'data')

        def options = cli.parse(args)
        if (options==null)
            return
        if (options.help) {
            cli.usage()
            return
        }

        def host = (options.server) ? options.server : 'localhost:8080/simple-backend/router'
        def action = (options.action) ? options.action : 'simpleService'
        def method = (options.method) ? options.method : 'loadPeople'
        def data = (options.data) ? options.data : '[{"firstName":"","lastName":"","dateOfBirthFrom":"","dateOfBirthTo":"","ssn":"","gender":"","page":1,"start":0,"limit":5,"sort":[{"property":"lastName","direction":"ASC"}]}]'

        def builder = new JsonBuilder()
        def request = [
            "action" : action,
            "method" : method,
            "data" : data,
            "type" : "rpc",
            "tid": 2
        ]
        builder.setContent(request)

        def http = new HTTPBuilder('http://' + host)

        println "Sending request:"
        println builder.toPrettyString()
        println ""

        http.request(Method.POST, ContentType.JSON) {
            body = request
            response.success = { resp, json ->
                builder.setContent(json)
                println "Receiving response:"
                println builder.toPrettyString()
            }

            // failure response handler
            response.failure = { resp ->
                println "Unexpected error: ${resp.statusLine.statusCode}"
                println ${resp.statusLine.reasonPhrase}
            }
        }
    }
}
