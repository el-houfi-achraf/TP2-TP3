# TP2 TP3 - Application Java Spring

## Description
Ce projet est une application Java utilisant Spring pour illustrer l'injection de dépendances, la configuration par XML et par annotations, ainsi que la gestion de la couche DAO et métier. Il s'agit d'un TP académique visant à mettre en pratique les concepts de Spring Framework.

## Prérequis
- Java 8 ou supérieur
- Maven
- Un IDE compatible Java (IntelliJ IDEA, Eclipse, VS Code...)

## Installation
1. Clonez le dépôt ou téléchargez les sources.
2. Placez-vous dans le dossier du projet.
3. Compilez le projet avec Maven :
   ```cmd
   mvn clean install
   ```

## Structure du projet
```
pom.xml                # Fichier de configuration Maven
src/
  main/
    java/
      com/example/
        config/         # Configuration Spring (Java/Annotations)
        dao/            # Interfaces et implémentations DAO
        metier/         # Interfaces et implémentations métier
        presentation/   # Classes de présentation (main)
    resources/
      app.properties    # Fichier de propriétés
      applicationContext.xml # Configuration Spring XML
  test/
    java/              # Tests unitaires
      MetierImplTest.java
      OcpSelectionTest.java
```

## Exécution
Pour lancer l'application principale :
1. Compilez le projet (voir Installation).
2. Exécutez la classe de présentation souhaitée, par exemple :
   ```cmd
   mvn exec:java -Dexec.mainClass="com.example.presentation.Presentation2"
   ```
   ou
   ```cmd
   mvn exec:java -Dexec.mainClass="com.example.presentation.PresentationXML"
   ```

## Tests
Pour exécuter les tests unitaires :
```cmd
mvn test
```

## Auteur
- Achraf 


## Captures d'écran
<img width="1913" height="1074" alt="image" src="https://github.com/user-attachments/assets/ec6a49e8-16b5-46ee-a890-bcc8ff4cc24e" />
<img width="1919" height="1078" alt="image" src="https://github.com/user-attachments/assets/4b6f97e1-10a1-4723-9292-474f18b562f7" />
