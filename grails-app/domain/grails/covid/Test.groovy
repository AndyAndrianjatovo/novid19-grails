package grails.covid

import java.sql.Timestamp
import grails.rest.*

@Resource(uri='/api/test', formats=['json', 'xml'])
class Test {

    int idTest
    Timestamp dateTest
    int centreId
    int personneId
    int etatTest

    static mapping = {
        table 'Test'
    }

    static constraints = {
    }
}
