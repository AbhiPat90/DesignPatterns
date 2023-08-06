# DesignPatterns
Practicing implementation of various Design Patterns which iare crucial to use to have a good software design. I will add here notes regarding SOLID principles and their usage

------------------------------------------------------------------------------------------------

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

------------------------------------------------------------------------------------------------

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
    
------------------------------------------------------------------------------------------------

**_Prototype Design Pattern:_**

Problem Statement: Given an object of a class, we need to create a copy of this given object.

Q: We want to Print 100K notebooks of 1 type with 120 pages of A4 size having same front and back page.

Definition: Often there are scenarios where we don't want to create an object from scratch, rather we prefer creating a copy using existing attributes and 
setting some specific attributes.


We can create a copy of the object by:
Approach 1: 
    Student st = new Student();
    Student stCopy =  new Student();
    stCopy.name = st.name;
    stCopy.age = st.age;

Issues here are:
1. Client Needs to know all the internal details of Student and st object reacted for which we are creating copy of the object.
2. Each time while creating copy we need to do this.
3. Private attributes can't b e access outside the class, If age is private attribute then we wouldn't be able to create  copy of the st object. 
(We may have getter setter method to set it, but its not an obligation to write the getter setter for every private attribute)

Approach 2: Using Copy Constructor
    
    public class Student{
        private name;
        private age;
        
        Student(){}
        Student(Student origin){
            this.name = origin.name;
            this.age = origin.age;
        }
    }

    class Client{
        Student st = new Student();
        Student stCopy = new Student(st); // Copy of st will be created
    }

Issue here is:
1. If Student is a parent class which has copy constructor but it has child class which doesn't have child class. So if there is a case that 'st' is object of child class and we want to create copy of 'st'. What should we do?

That means, all the child classes should also have a copy constructor.

Solution is: **_Prototype Design pattern_**
-------------------------------------
(Prototype meaning Model/Template)
1. If a client wants to copy an object then having the logic of copy object in the client code is prone to error. So ideally, client should out-source the work of creating copy to object itself.

    public class Student{
        Student copy(){
        }
    }
    Student st = new Student();
    Student stCopy = st.copy();  // copy() --> will return a new object

Pros to use Prototype:
1. NO Open Closed principle violation
2. Client needs not to know the internal details of the class for which he is creating copy

Compulsion is: All the child classes should also override copy method otherwise it lead to unexpected results.

------------------------------------------------------------------------------------------------

