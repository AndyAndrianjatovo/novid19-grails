package grails.covid


import grails.rest.*
import grails.converters.*

class TestController extends RestfulController{
	static responseFormats = ['json', 'xml']

    TestController(){
        super(Test)
    }



}
