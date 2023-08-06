# DesignPatterns
Practicing implementation of various Design Patterns which iare crucial to use to have a good software design. I will add here notes regarding SOLID principles and their usage

=================================================================================================================================
Singleton Design Pattern:
    Allows us to create a only/single object of the class. Singleton objects are immutable.
------------------------------------------------------------------------------------------------
Why Singleton?
    1. If the class having share resources
    2. When object creation is expensive. Ex: Creating Database connection

How to Implement Singleton?
--> Till the time we can call constructor, A class can't be a Singleton
--> For that we need to make a class constructor private, but issue here is if we made a constructor private,
we can't even create a single object
--> Hence, follow below steps:
1. Make a Constructor Private
2. Create a "public static <ClassName> getInstance()" method
3. create a private static reference of the class to hold the object and initialize to null

Issue: But this solution won't work in MULTI-THREADED environment
Solution: Use lock(), unlock() to handle the multithreading to ensure only single object would be created.

Refer: Singleton design pattern implementation for more understanding

=================================================================================================================================

Builder Design Pattern:
    We have a class with lot of attributes and we wan't to ensure the object should only be created only after the validation.
Ex:
Validate PhoneNo, Age , etc., before the object for the class having attributes is created
------------------------------------------------------------------------------------------------
We can do this by creating multiple constructors, but this will lead to 
    1. too many constructor creation
    2. Method creation with same signature NOT Possible

We can also do this by using Telescopic Constructors
Ex:
public class Student{
    String name;
    int age;
    double psp;

    Student(Sting name){
        this.name = name;
    }

    Student(Sting name, int age){
        this(name);
        this.age = age;
    }

    Student(Sting name, int age, double psp){
        this(name, age);
        this.psp = psp;
    }
}

Issue: but this is again not a preferred way, we may end-up with too many constructors again

So we need, 
    1. Something like a <Map> that can store value against keys,
    2. Allows Values of specific data-types.
    3. We should be able to perform a check on the name of Keys.

Refer: Builder design pattern for the solution
    
   
