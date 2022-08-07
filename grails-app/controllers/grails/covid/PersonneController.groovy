package grails.covid


import grails.rest.*
import grails.converters.*

class PersonneController extends  RestfulController{
	static responseFormats = ['json', 'xml']
    PersonneController() {
        super(Personne)
    }



}
