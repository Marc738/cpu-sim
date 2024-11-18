# Guidelines für Code

## Programmierprinzipien
* SOLID (Schreibt sauberen, wartbaren Code):
	1.	Single Responsibility Principle (SRP): Jede Klasse hat genau eine Aufgabe.
	2.	Open/Closed Principle (OCP): Code soll erweiterbar sein, ohne Bestehendes zu ändern.
	3.	Liskov Substitution Principle (LSP): Subtypen sollen wie ihre Basistypen funktionieren.
	4.	Interface Segregation Principle (ISP): Vermeide große, ungenutzte Interfaces.
	5.	Dependency Inversion Principle (DIP): Abhängigkeiten von Abstraktionen statt konkreten Implementierungen.

* GRASP (Strukturierte Objektverantwortung):
	1.	Information Expert: Verantwortung liegt bei der Klasse mit dem Wissen.
	2.	Creator: Eine Klasse erstellt Objekte, die sie nutzt.
	3.	Controller: Koordiniert Abläufe in einer Anwendung.
	4.	Low Coupling: Wenig Abhängigkeit zwischen Klassen.
	5.	High Cohesion: Klassen sind fokussiert und spezialisiert.
	6.	Polymorphism: Verhalten wird über Polymorphie verteilt.
	7.	Indirection: Vermittlerklassen reduzieren direkte Abhängigkeiten.
	8.	Protected Variations: Änderungen an einer Klasse sollen andere nicht betreffen.

* DRY: Dont Repeat Yourself

## Entwurfsmuster
* Ein oder mehr Entwurfsmuster einsetzen und begründen
* UML-Diagramm vorher und nachher

## DDD
* Analyse der Ubiquitous Language
* Analyse und Begründung für Repositories
  * Repositories
  * Aggregates
  * Entities
  * Value Objects

## Architektur
* Schichtenarchitektur planen und begründen
* Zwei oder mehr Schichten erstellen

## Unit Tests
* Mehr als 9 Unit Tests
* ATRIP-Regel
* Code Coverage über 80%
* Mocks verwenden

## Refactoring
* Code Smells identifizieren
* Zwei oder mehr Refactorings verwenden und begründen

