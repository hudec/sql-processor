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

        // FORM_POST Example:
        //groovy SimpleBackendTest.groovy -M createContact -extDirectMethod FORM_POST -D 'personId=108&ctype=HOME&countryCode=AT&address=aa&phoneNumber=aa'
        // STORE_READ Example:
        //groovy SimpleBackendTest.groovy

        def cli = new CliBuilder(usage:'groovy SimpleBackendTest.groovy',header:'Volby:',stopAtNonOption:false)
        cli.H(longOpt:'help', 'help')
        cli.S(longOpt:'server', args:1, argName:'server', 'host:port application server')
        cli.A(longOpt:'action', args:1, argName:'action', 'action')
        cli.M(longOpt:'method', args:1, argName:'method', 'method')
        cli.D(longOpt:'data', args:1, argName:'data', 'data')
        cli.E(longOpt:'extDirectMethod', args:1, argName:'extDirectMethod', '[STORE_READ|FORM_POST]')

        def options = cli.parse(args)
        if (options==null)
            return
        if (options.help) {
            cli.usage()
            return
        }

        def host = (options.server) ? options.server : 'simple-backend.cfapps.io/router'
        def action = (options.action) ? options.action : 'personWeb'
        def method = (options.method) ? options.method : 'loadPeople'
        def data = (options.data) ? options.data : '[{"firstName":"","lastName":"","dateOfBirthFrom":"","dateOfBirthTo":"","ssn":"","gender":"","page":1,"start":0,"limit":5,"sort":[{"property":"lastName","direction":"ASC"}]}]'
        def extDirectMethod = (options.extDirectMethod) ? options.extDirectMethod : 'STORE_READ'
        def builder =  new JsonBuilder()
        def request
        def contentType
        if (extDirectMethod == 'FORM_POST'){
            contentType = ContentType.URLENC
            request = "extTID=2&extAction="+ action + "&extMethod=" + method+ "&extType=rpc&extUpload=false&" + data
        } else if (extDirectMethod == 'STORE_READ'){
            contentType =  ContentType.JSON
            request = [
                "action" : action,
                "method" : method,
                "data" : data,
                "type" : "rpc",
                "tid": 2

            ]
        }

        builder.setContent(request)

        println "Sending request:"
        println builder.toPrettyString()
        println ""

        def http = new HTTPBuilder('http://' + host)

        http.request(Method.POST, contentType) {
            body = request
            response.success = { resp, responseData ->
                println "Receiving response:"
                println responseData
                builder.setContent(responseData)
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
