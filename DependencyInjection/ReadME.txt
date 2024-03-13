Dependency Injection

Dependencies :

1. Literals -> (String name) name is a dependency
2. Objects -> (Student stuRef) stuRef is a dependency
3. Collections -> (ArrayList<Integers> arr) arr is a dependency

Injection :

Here initializing the values to the dependencies is called injecting

Instead of creating an object and initializing the value using the object we do it using spring !
Setter Injection :

In order to achieve setter injection

<bean id="xyz" class="Student">
	<property name="studentName" value="Pranith" />
</bean>

**The field property itself tells the spring to search for the setter method

Here in property name="studentName" indicates the literal name ( Variable )
Here in value="Pranith" indicates the injection

The whole above process runs only when there is a setter method for the literal used in the property tag of name field

Spring uses setter method to inject the dependencies of type literals

Instead of creating an object and initializing using the constructor object
Constructor Injection :

<bean id="xyz" class="Student">
	<constructor-arg name="studentName" value="Sri Harsha" type="java.lang.String"/>
	<constructor-arg name="id" value="10" />
</bean>

Here in constructor-arg tag of name field the studentName is exactly same as the parameter or argument of the constructor

Mentioning the type decreases the execution time ( This is completely optional and spring itself checks for the type if not mentioned )


