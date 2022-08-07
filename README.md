# novid19-grails
NOVID19 est un projet fait dans le cadre éducatif en tant que projet transversal (TPT) à l'ITUniversity.
Ce projet est le web service fait en Grails.

## API et lien
Base url https://pure-scrubland-05914.herokuapp.com/

### Personne

GET,POST,PUT: api/personne
Pour une personne spécifique: GET,DELETE: api/personne/:id

### Test

GET,POST,PUT: api/test
Pour un test spécifique: GET,DELETE: api/test/:id
Pour avoir les tests pour chaque personne: testPersonne/:idpersonne

### Carte de vaccination

GET,POST,PUT: api/cartev
Pour une carte spécifique: GET,DELETE: api/cartev/:id
Avoir la carte d'une personne: cartePersonne/:idpersonne


### Vaccin

GET,POST,PUT: api/vaccin
Pour un vaccin spécifique: GET,DELETE: api/vaccin/:id
Pour avoir les vaccins pour une carte: vaccinCarte/:idcarte

### Historique

GET,POST,PUT: api/historique
Pour une historique spécifique: GET,DELETE: api/historique/:id
Avoir l'historique de chaque personne: historiquePersonne/:id





### Lieux

GET,POST,PUT: api/lieu
Pour un lieu spécifique: GET,DELETE: api/lieu/:id

### Centre

GET,POST,PUT: api/centre
Pour un centre spécifique: GET,DELETE: api/centre/:id

### Message

GET,POST,PUT: api/message
Pour un message spécifique: GET,DELETE: api/message/:id





