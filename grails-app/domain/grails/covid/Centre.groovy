package grails.covid

import grails.rest.*

@Resource(uri='/api/centre', formats=['json', 'xml'])
class Centre {

    int idCentre
    String nomCentre
    String adresseCentre

    static mapping = {
        table 'Centre'
    }

    static constraints = {
    }
}
