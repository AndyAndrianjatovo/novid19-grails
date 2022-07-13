package grails.covid

import grails.rest.*
@Resource(uri='/api/personne', formats=['json', 'xml'])
class Personne{
    Long id_personne
    String nom
    String prenom
    String mail
    Date date_naissance
    String adresse
    int sexe
    String cin

    static mapping = {
        id column: 'id_personne'
        id name: 'id_personne'

        version false
        table 'personne'
    }

    static constraints = {
        date_naissance blank:false
        sexe blank:false
    }
}
