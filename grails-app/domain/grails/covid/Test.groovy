package grails.covid

import java.sql.Timestamp
import grails.rest.*

@Resource(uri='/api/test', formats=['json', 'xml'])
class Test {
    Long id_test
    Date date_test
    int centre_id
    int personne_id
    int etat_test

    static mapping = {
        id column: 'id_test'
        id name: 'id_test'
        table 'Test'
        version false
    }

    static constraints = {
        date_test blank:false
        centre_id blank:false
        personne_id blank:false
        etat_test blank:false
    }
}
