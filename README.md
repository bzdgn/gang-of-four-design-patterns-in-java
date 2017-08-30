# Gang Of Four Design Patterns In Java

*******
I'm uploading this project to git in order to self learning and recap my design patterns knowledge. Design patterns are needed to make good practice and generalized design solutions for the known programming design problems. This project is about famous Gang Of Four Design Patterns and their implementation examples in Java.
*******

## Creational Design Patterns

* [A - Creational Design Patterns](src/gof_design_patterns_a_creational)
	1. [Singleton Pattern](src/gof_design_patterns_a_creational/p01_singleton)
		1. [Singleton Everyday Demo](src/gof_design_patterns_a_creational/p01_singleton/SingletonEverydayDemo.java)
		2. [Static Db Singleton Class](src/gof_design_patterns_a_creational/p01_singleton/DbSingleton.java)
		3. [Static Db Singleton Demo](src/gof_design_patterns_a_creational/p01_singleton/DbSingletonDemo.java)
	2. [Builder Pattern](src/gof_design_patterns_a_creational/p02_builder/dum2.java)
	3. [Prototype Pattern](src/gof_design_patterns_a_creational/p03_prototype/dum3.java)
	4. [Factory Pattern](src/gof_design_patterns_a_creational/p04_factory/dum4.java)
	5. [Abstract Factory Pattern](src/gof_design_patterns_a_creational/p05_abstract_factory/dum5.java)

## Structural Design Patterns

* [B - Structural Design Patterns](src/gof_design_patterns_b_structural/dummy2.java)

## Behavioral Design Patterns

* [C - Behavioral Design Patterns](src/gof_design_patterns_c_behavioral/dummy3.java)

*******

# Design Patterns Notes

## A - Creational Design Patterns

### &nbsp;&nbsp;&nbsp;&nbsp;1. Singleton

#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Intro
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Singleton guarantees only one instance of the class is going to be created. It guarantees the control of a resource. Singleton is a creational design pattern thus the instantiation of the class is controlled by the implementation of this pattern. It is usually lazily loaded. Singleton is responsible for creating itself and managing its own lifecycle. It is static in nature but it is not implemented using a static class typically. Because in order to make the implementation thread-safe, it is not build-up with static class. The constructor of the singleton is private so that other than the class itself, no other class can call the constructor of the Singleton class. And the reference to the class instance, which can only be only unique per runtime environment, is also stored as private so that only the class itself can reach and control its lifecycle. Also notify that there are no parameters in the private constructor and if there should be, it violates the rules of Singleton. If you require parameters to create an instance of a class, you should prefer or you need a factory pattern.

#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Examples
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Java Runtime Environment, Logger, Spring Beans(they are Singleton's by default), Graphics Managers


#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pros and Cons
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;xxxxxxxxxxxx

#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dummy
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;xxxxxxxxxxxx

### &nbsp;&nbsp;&nbsp;&nbsp;2. Builder

### &nbsp;&nbsp;&nbsp;&nbsp;3. Prototype

### &nbsp;&nbsp;&nbsp;&nbsp;4. Factory

### &nbsp;&nbsp;&nbsp;&nbsp;5. Abstract Factory