# Axopen - Power Benchmark

## Lancement du projet

Pouvoir lancer l'API vous devez modifier les fichiers de configuration pour que l'API pointe sur votre base de données.

Rendez-vous dans le fichier `./src/main/resources/application.properties`

Vous allez devoir modifier la section du haut du fichier en remplacent les éléments par vos informations. 

```properties
############################
# ---    DATASOURCE    --- #
############################
spring.datasource.url=jdbc:mysql://localhost:3306/DB_NAME
spring.datasource.username=DB_USERNAME
spring.datasource.password=DB_PASSWORD
```

Vous pouvez maintenant lancer l'application.

## Architecture du projet

Le code java qui va permettre à l'API de fonctionner se trouve dans le repertoire : `/src/main/java/fr/axopen/powerbenchmark`.

Nous allons détailler rapidement ce qui se trouve dans chaque dossier.

- `bo` contient les objets Java qui représentent la base de données.
- `config` contient toute la configuration.
- `dto` contient les classes Java utilisé lors des transactions avec l'utilisateur de l'API. DTO (Data Transfert Object).
- `exception` contient les exceptions de l'API.
- `mapper` Contient les classes qui permettent le mapping.
- `repository` contient les interfaces qui permettent d'interagir avec la base de données.
- `rest` contient les controllers qui sont les points d'entrés de l'API.
- `service` contient les services de l'application.

Le repertoire suivant va contenir les ressources de l'application : `/src/main/resources`.

- `application.properties` contient les propriétés liées à l'API, les paramètres de connexion à la base de données ...
- `db/migration` contient les scripts de migration qui permettent de construire automatiquement la base de données au lancement de l'API.
