# Abstract Factory Design Pattern
This application is an example Java application of the Abstract Factory Design Pattern topic that we studied in the Software Design Patterns course.
## What is Factory Pattern?
The Factory Pattern is a creational design pattern. This pattern defines an interface or an abstract class and is used to create objects of different concrete classes that implement this interface or class. It abstracts the process of object creation from the client and restricts access to the concrete types of these objects.
## What is Abstract Factory Pattern?
The Abstract Factory Pattern is an extension of the Factory Pattern. This pattern defines an abstract factory class that contains an interface or an abstract class. This abstract factory class directs the creation of objects among its related subclasses. Each subclass implements a factory method for a specific object family. This pattern provides a structure that enables related objects to be used together and facilitates the creation of compatible groups of objects.
## Advantages of Abstract Factory Pattern over Factory Pattern:
1. **Flexibility and Extensibility:** The Abstract Factory Pattern is more flexible and extensible compared to the Factory Pattern. This is because the Abstract Factory Pattern defines the abstract factory class that manages related groups of objects. This makes it easier to add new objects and modify existing ones.

2. **Grouping of Related Objects:** The Abstract Factory Pattern provides a structure for defining related groups of objects and allows these groups to be used together. This increases the coherence between objects and makes the code more organized.

3. **Changing Object Families:** The Abstract Factory Pattern is used to create objects that belong to a specific family of objects that work together. This makes it easier to transition the code from one object family to another.

4. **Reduced Dependencies:** The Abstract Factory Pattern reduces the dependency of clients on specific types of objects. It allows clients to work with objects at a higher level of abstraction, making the code more flexible and easier to maintain.
