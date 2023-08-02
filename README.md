# DesignPatterns
Practicing implementation of various Design Patterns which iare crucial to use to have a good software design. I will add here notes regarding SOLID principles and their usage

=================================================================================================================================
Singleton Design Pattern:
    Allows us to only create a single object of the class. Singleton objects are immutable.
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
