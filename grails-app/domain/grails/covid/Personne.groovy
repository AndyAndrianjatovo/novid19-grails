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

    static constraints = {
    }
}
