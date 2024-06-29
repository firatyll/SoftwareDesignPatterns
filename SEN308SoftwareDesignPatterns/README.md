
# Software Design Patterns

This project contains examples of various software design patterns. Each pattern is implemented in a separate directory and includes example code demonstrating its use. Below is a list of the patterns included in this project, along with brief descriptions and links to their respective directories.

## Creational Patterns

### [Builder Design Pattern](src/creational/builder/README.md)
The Builder Design Pattern is used to construct a complex object step by step. It separates the construction of a complex object from its representation, allowing the same construction process to create various representations.

### [Factory Design Pattern](src/creational/factory/README.md)
The Factory Design Pattern is used to define an interface for creating an object, but allows subclasses to alter the type of objects that will be created. It promotes loose coupling by eliminating the need to bind application-specific classes into the code.

## Structural Patterns

### [Bridge Design Pattern](src/structural/bridge/README.md)
The Bridge Design Pattern is used to decouple an abstraction from its implementation so that the two can vary independently. It involves an interface which acts as a bridge, making the functionality of concrete classes independent from interface implementer classes.

## Behavioral Patterns

### [Command Design Pattern](src/behavioral/Command/README.md)
The Command Design Pattern encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations. This pattern allows for the decoupling of the sender and receiver of a request.

### [Interpreter Design Pattern](src/behavioral/Interpreter/README.md)
The Interpreter Design Pattern defines a grammatical representation for a language and an interpreter to interpret the grammar. This pattern is used in SQL parsing, symbol processing engines, etc.

### [Iterator Design Pattern](src/behavioral/Iterator/README.md)
The Iterator Design Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It is commonly used for collections like lists, sets, etc.

### [Mediator Design Pattern](src/behavioral/Mediator/README.md)
The Mediator Design Pattern defines an object that encapsulates how a set of objects interact. This pattern promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

### [Memento Design Pattern](src/behavioral/Memento/README.md)
The Memento Design Pattern captures and externalizes an object's internal state so that the object can be restored to this state later. This pattern is commonly used for implementing undo mechanisms.

### [Observer Design Pattern](src/behavioral/Observer/README.md)
The Observer Design Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is often used in implementing distributed event-handling systems.

### [State Design Pattern](src/behavioral/State/README.md)
The State Design Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class. This pattern is used in scenarios where an object can have many different states and behavior depends on the state.

### [Strategy Design Pattern](src/behavioral/Strategy/README.md)
The Strategy Design Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern lets the algorithm vary independently from clients that use it.

### [Template Method Design Pattern](src/behavioral/TemplateMethod/README.md)
The Template Method Design Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

### [Visitor Design Pattern](src/behavioral/Visitor/README.md)
The Visitor Design Pattern allows adding new operations to a class hierarchy without changing the classes. This pattern is used to separate an algorithm from an object structure on which it operates.

## How to Run

Each pattern directory contains a Java implementation of the respective pattern. To run the examples:

1. Navigate to the pattern's directory.
2. Compile the Java files using `javac`.
3. Run the compiled Java files using `java`.

For example, to run the Builder pattern example:

```sh
cd src/creational/builder
javac *.java
java Main
```
