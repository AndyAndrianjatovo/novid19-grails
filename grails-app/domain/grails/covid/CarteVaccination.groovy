package grails.covid

import grails.rest.*

@Resource(uri='/api/cartev', formats=['json', 'xml'])
class CarteVaccination {
    Long id_carte
    int personne_id

    static mapping = {
        table 'CarteVaccination'
        version false
        id column: 'id_carte'
        id name: 'id_carte'
    }

    static constraints = {
        personne_id blank:false
    }
}
