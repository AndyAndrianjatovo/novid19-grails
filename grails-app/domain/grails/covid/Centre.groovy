package grails.covid

import grails.rest.*

@Resource(uri='/api/centre', formats=['json', 'xml'])
class Centre {

    Long id_centre
    String nom_centre
    String adresse_centre
    String coordonnees_centre

    static mapping = {
        table 'Centre'
        version false
        id column: 'id_centre'
        id name: 'id_centre'
    }

    static constraints = {
        nom_centre blank: false
        adresse_centre blank: false
        coordonnees_centre blank: false
    }
}
