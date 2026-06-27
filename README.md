# FoodDelivery

## Projektbeschreibung

Bei meinem Projekt handelt es sich um eine einfache FoodDelivery-Anwendung, die ich in **Java** mit **Eclipse** umgesetzt habe.

Im Projekt habe ich verschiedene Testmethoden angewendet:

- Unit-Tests mit JUnit
- Test Driven Development (TDD)
- Mocking mit Mockito

---

## A1 – Unit-Tests

Für die wichtigsten Klassen habe ich Unit-Tests erstellt.

Dabei habe ich normale Testfälle sowie mindestens ein Test implementiert, der eine Exception überprüft. Dadurch wird sichergestellt, dass die Anwendung auch bei fehlerhaften Eingaben korrekt reagiert.

---

## A2 – TDD (FoodDelivery)

Die Funktionen der FoodDelivery-Anwendung habe ich nach dem TDD-Prinzip entwickelt.

Für jede neue Funktion habe ich folgenden Ablauf verwendet:

1. Red – Test schreiben
2. Green – Test erfolgreich machen
3. Refactor – Code verbessern

Die einzelnen Schritte sind in der Git-History dokumentiert.

---
## A3 – Mocking

Für den Mocking-Teil habe ich Mockito verwendet.

Dabei wurde der PaymentProvider gemockt, damit der CheckoutService unabhängig von einem echten Bezahldienst getestet werden kann.

Dadurch können die Tests schneller, reproduzierbar und ohne externe Abhängigkeiten ausgeführt werden.

---

## Verwendete Technologien

- Java
- Eclipse IDE
- Maven
- JUnit 5
- Mockito
- Git
- GitHub
