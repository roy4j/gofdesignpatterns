## GoF Design Patterns
#### Creational Design Patterns
1. `Factory Method`
	> The Factory Method Pattern defines an interface for creating an object but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
	- **Product:** It defines an interface of the objects the Factory method creates.
	- **Concrete Product:** Implements Product interface.
	- **Creator:** Declares the Factory method.
	- **Concreate Creator:** Implements the Factory method to return an instance of a Concrete Product.
	- **Use Case:**
		- **Vehicle Factory:**  Where the products can be a two wheeler or four wheeler etc. The factory method will take an argument and based on the value of the argument it will return that type of object.
2. `Abstract Factory`
	> The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
	- **Use Cases**
		- Many factories produces computers - Lenovo, Dell, Hp.
3. `Builder`
	> The builder design pattern allows for the step-by-step creation of complex objects using the correct sequence of actions.
	- The construction is controlled by a director object that only needs to know the type of object it is to create.
	- Object has many properties - few are mandatory and many are optional.
		- Setters/ Constructors: Creating all possible combinations of Constructors can solve it but the code becomes - large, complex and difficult to maintain.
	- **Use Cases**
		- Computer Assembling Program with custom options
4. `Singleton`
	> It ensures a class has only one instance and provides a global point of access to it.
	- **Use Cases**
		- A simple logger is the most obvious example of a possibly-valid Singleton, but this can change with more complex logging schemes.
		- Reading configuration files that should only be read at startup time and encapsulating them in a Singleton.
5. `Prototype`
	> Prototype Pattern is used when creating an instance of a given class is either expensive or complicated.
	- It creates a new object from an existing object.
	- Based on the requirements it is decided whether to make a deep copy or a shallow copy.
	- **Use Cases**
		- When I open an account in a Bank then I need to submit many documents. Next time when I open another account then I don't need to submit the same documents again because Bank can clone the existing documents.

#### Structural Design Patterns
6. `Proxy`
7. `Adapter`
8. `Bridge`
9. `Composite`
10. `Decorator`
11. `Facade`
12. `Flyweight`

#### Behavior Design Patterns
13. `Chain of Responsibility`
14. `Command`
15. `Interpreter`
16. `Iterator`
17. `Mediator`
18. `Memento`
19. `Observer`
20. `State`
21. `Strategy`
22. `Template Method`
23. `Visitor`