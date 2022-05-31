package grails.covid

import java.sql.Timestamp
import grails.rest.*

@Resource(uri='/api/vaccin', formats=['json', 'xml'])
class Vaccin {

    int idVaccin
    String nomVaccin
    int centreId
    Timestamp dateVaccin
    int carteId

    static mapping = {
        table 'Vaccin'
    }

    static constraints = {
    }
}
