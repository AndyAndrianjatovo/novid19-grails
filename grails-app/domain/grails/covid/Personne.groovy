package grails.covid

import grails.rest.*
@Resource(uri='/api/personne', formats=['json', 'xml'])
class Personne {

    int idPersonne
    String nom
    String prenom
    String mail
    Date dateNaissance
    String adresse
    int sexe
    String cin

    static mapping = {
//        version false
        table 'personne'
//        id column: 'id', generator:'native', params:[sequence:'order_seq']
    }

    static constraints = {
    }
}
