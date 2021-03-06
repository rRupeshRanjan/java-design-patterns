# More to follow

## Table of Contents

- [Creational patterns](#creational-patterns)
    - [Singleton](#singleton)
    - [Builder](#builder)
    - [Factory](#factory)

---

## Creational patterns
Creational design patterns abstract the instantiation process. They help make a system independent of how its objects
are created, composed, and represented.

### Singleton
The singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance.
This is useful when exactly one object is needed to coordinate actions across the system.
This pattern ensures that a class only has one instance, and provide a global point of access to it.

### Builder
The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in
object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex
object from its representation, so that the same construction process can create different representations.

### Factory
In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object
using a common interface. It defines an interface for creating an object, but let subclasses decide which class to 
instantiate. Factory Method lets a class defer instantiation to subclasses.