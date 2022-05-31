package grails.covid

import grails.rest.*

@Resource(uri='/api/cartev', formats=['json', 'xml'])
class CarteVaccination {

    int idCarte
    int personneId

    static mapping = {
        table 'CarteVaccination'
    }

    static constraints = {
    }
}
