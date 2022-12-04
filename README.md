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
	> The Proxy Pattern provides a surrogate or placeholder for another object.
	- Proxy object controls the access to the original object.
	- It reduces the cost and complexity of object creation.
	- **Use Cases**
		- **Lazy Loading:** It recommends postponing an object creation until it is needed. It is used when creating an object is expensive in terms of memory usage or processing involved.
7. `Adapter`
	> The Adapter Pattern converts the interface of a class into another interface as per the client's expectation. Adapter makes classes work together that are not able to work together because of incompatible interfaces. It is also known as Wrapper.
8. `Bridge`
	> Bridge Pattern is used to vary not only the implementations but also the abstractions. It decouples an abstraction so that the abstraction and the implementation can vary independently.
	- The bridge pattern allows the Abstraction and the Implementation to be developed independently and the client code can access only the Abstraction part without being concerned about the Implementation part.
	- The Abstraction is an interface or abstract class and the Implementer is also an interface or abstract class.
	- The Abstraction contains a reference to the Implementer.
	- Children of the Abstraction are referred to as Refined Abstractions and children of the Implementer are Concrete Implementers.
	- Since we can change the reference to the Implementer in the Abstraction, we are able to change the Abstraction's Implementer at run-time.
	- Changes to the Implementer do not affect client code.
	- It increases the loose coupling between class Abstraction and it's Implementation.
9. `Composite`
	> The Composite Pattern allows to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.
	- **Use Cases**
		- Employee - Manager
		- File - Folder
10. `Decorator`
	> The Decorator Pattern attaches additional responsibilities to an object dynamically at run time. It provides a flexible alternative to subclassing for extending functionality.
	- **Component:** The Component defines the interface for objects that can have responsibilities added dynamically.
	- **Concrete Component:** It is simply an implementation of Component interface.
	- **Decorator:** The Decorator has a reference to a Component and also conforms to the Component interface. Decorator is essentially wrapping the Component.
	- **Concrete Decorator:** The Concrete Decorator just adds responsibilities to the original Component.
11. `Facade`
	> The Facade Pattern provides a simpler interface to a set of more complex underlying interfaces in a subsystem. It defines a higher-level interface that makes the subsystem easier to use.
	- **Use Cases**
		- Employee release system from Library, Cafeteria, Admin.
12. `Flyweight`
	> Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.
	- Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.
	- Since the same flyweight object can be used in different contexts it needs to immutable.
	- A flyweight should initialize its states just once via constructor parameters.
	- It should not expose any setters for the states.

#### Behavior Design Patterns
13. `Chain of Responsibility`
	> Chain of Responsibility Pattern is used to give more than one object a chance to handle a request.
	- Execution of the request isn’t guaranteed; it may fall off the end of the chain if no object handles it (this can be an advantage or a disadvantage).
	- Each object in the chain acts as a handler and has a successor object. If it can handle the request, it does; otherwise, it forwards the request to its successor.
	- **Use Case**
		- In an organization the Manager can approve bill amount upto 10K, the Director can approve bill amount upto 20K and the President can approve bill amount upto 30K. Bill amount more than 30K is not approved. Bills first go to Manager, if the Manager cannot approve it then it goes to the Director and if the Director cannot approve it then it goes to the President.
14. `Command`
	> The Command Pattern encapsulates a request as a Command object and then passes it to the Invoker to execute the Command. The Invoker is configurable with appropriate objects that can handle this type of request. Thus the request and the request invoker code is decoupled.
	- **Command**
		- A command object knows about receiver and invokes a method of the receiver.
		- Values for parameters of the receiver method are stored in the command.
	- **Receiver**
		- The receiver object to execute these methods is also stored in the command object by aggregation.
		- The receiver then does the work when the `execute()` method in command is called.
	- **Invoker**
		- An invoker object knows how to execute a command and optionally does bookkeeping about the command execution.
		- The invoker does not know anything about a concrete command.
		- It knows only about the command interface.
	- **Client**
		- Invoker object(s), command objects and receiver objects are held by a client object.
		- The client decides which receiver objects it assigns to the command objects and which commands it assigns to the invoker.
		- The client decides which commands to execute at which points.
		- To execute a command it passes the command object to the invoker object.
	- **Use Cases**
		- Wizards
			- Often a wizard presents several pages of configuration for a single action that happens only when the user clicks the "Finish" button on the last page.
			- In these cases, a natural way to separate user interface code from application code is to implement the wizard using a command object.
			- The command object is created when the wizard is first displayed.
			- Each wizard page stores its GUI changes in the command object, so the object is populated as the user progresses.
			- "Finish" simply triggers a call to execute().
			- This way, the command class will work.
15. `Interpreter`
	> Interpreter Pattern is used to build an interpreter for a language.
	- **Use Cases**
		- Roman to Integer
		- Integer to Roman
		- Binary to Hexadecimal
		- Inch to Centimeter
16. `Iterator`
	> The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
	- It also defines the task of traversal **on the iterator object** and **not on the aggregate object** which simplifies the aggregate interface and its implementation.
17. `Mediator`
	> Mediator Pattern is used to centralize complex communications and control between related objects.
	- **Use Cases**
		- A collection of Landlords want to give Rooms on rent and a collection of Tenants want to take rooms on rent. Mediator manages how many Landlords are there, how many rooms are available, what are rents of those rooms, how many Tenants want to take room on rent and what are their budgets. Mediator makes communication between Landlords and Tenants easy.
18. `Memento`
	> Memento Pattern is used to be able to return an object to one of its previous states. For example - if the user requests an "undo" operation.
	- **originator :** the object for which the state is to be saved. It creates the memento and uses it in future to undo.
	- **memento :** the object that is going to maintain the state of originator. Its just a POJO.
	- **caretaker :** the object that keeps track of multiple memento. Like maintaining savepoints.
	- **Use Cases**
		- Support the "undo" operation.
19. `Observer`
	> The Observer Pattern defines a one-to-many dependency between objects so that when one object changes its state then all of its dependents are notified and updated automatically.
	- It is useful when you are interested in the state of an object and want to get notified whenever there is any change.
	- **Observer:** The object that watch on the state of another object are called Observer.
	- **Subject:** The object that is being watched by many other objects is called Subject.
	- **Use Cases**
		- One publisher and many subscribers.
20. `State`
	> The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
	- **Use Cases**
		- Who is to move in a two player Chess game or in a 4 player Ludo game etc.
21. `Strategy`
	> The Strategy Pattern defines a family of algorithms, encapsulates each one and makes them interchangeable.
	- Strategy lets the algorithm vary independently on-the-fly at run-time from the clients that use it.
	- Instead of implementing a single algorithm directly in the code it receives run-time instruction that which algorithm to use from a family of algorithms.
	- **Use Cases**
		- In a game of chess Bishops move diagonally, Rooks moves horizontally or vertically, Queen can move both like the Bishop and Rook, Night moves two and half squares, etc.
		- Navigation from one place to another place. There can be driving route, walking route, cycling route, public transport route, etc.
22. `Template Method`
	> The Template Method Pattern defines the skeleton of an algorithm as an abstract class deferring some steps to subclasses.
	- It lets subclasses provide concrete behavior to certain steps of an algorithm without changing the algorithm’s structure.
	- The template method is a concrete final method in the superclass that defines a sequence of high-level steps.
	- These steps are abstract or non-final concrete methods in the superclass.
	- So the implementors can implement any step but it is not allowed to alter the sequence of the steps.
	- **Use Cases**
		- Tea Making Machine - the sequence of boiling water, adding milk, adding sugar and adding tea leaves must not be altered but the implementors are free to choose their preferable types of water, milk, sugar and tea leaves.
23. `Visitor`
	> Visitor Pattern is a way of separating an algorithm from an object structure on which it operates.
	- A practical result of this separation is the ability to add new operations to existing object structures without modifying the structures.
	- It is one way to follow the open/closed principle.
	- It allows adding new virtual functions to a family of classes without modifying the classes.
	- Instead a Visitor class is created that implements all of the appropriate specializations of the virtual function.
	- The Visitor takes the instance reference as input and performs the operation on that instance.
