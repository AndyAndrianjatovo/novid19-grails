package grails.covid

import java.sql.Timestamp
import grails.rest.*

@Resource(uri='/api/vaccin', formats=['json', 'xml'])
class Vaccin {
    Long id_vaccin
    String nom_vaccin
    int centre_id
    Date date_vaccin
    int carte_id

    static mapping = {
        id column: 'id_vaccin'
        id name: 'id_vaccin'
        table 'Vaccin'
        version false
    }

    static constraints = {
        nom_vaccin blank:false
        centre_id blank:false
        date_vaccin blank:false
        carte_id blank:false
    }
}
