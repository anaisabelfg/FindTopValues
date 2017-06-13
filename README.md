# Java Test #

•	Create a class called FindTopValuesImpl which implements the Java interface below.
•	Modifications to the interface are permitted, but your reasoning must be documented.
•	The method findMaxValue should return the single highest integer and findTopNValues should return a list of the highest ’n’ values in the source list, ordered naturally, with the highest value at the start of the array.
•	You may assume that the array will never contain more than 50 elements.
•	Bear in mind, the implementation you provide will form the core computation for a very heavily used component, running a million times per second.  Obviously, computational efficiency is key to the success of the project. (Fulfilling this requirement is platform dependent, so failure will not automatically disqualify you, but you should aim to achieve it).
•	Any assumptions or design choices made during the implementation should be documented.
•	The source code file(s) delivered should be compilable once inserted into a project containing the interface defined in the same namespace (i.e. one we have waiting for the code already).


## The solution ##
 
For the method findMaxValue I have chosen to traverse anyOldOrderValues once,so the solution has a complexity O(n), because anyOldOrderValues is unsorted and is the most simple solution.
  
For the method findTopNValues I have chosen order anyOldOrderValues first and then take n elements. Using the method sorted from IntStream (TimSort O(n log(n))) and then creating an array with the n elements in reverse order. This way I avoid boxing Integers so no new objects are created, which is ideal for a long process running this program millions of times per second reducing garbage collection calls.

## How to run the tests? ##

* Check if you have Java 8 and Maven 3. 
* Run `mvn verify`


## Dependencies ##

There are no runtime dependencies, just for testing:

* junit:junit:jar:4.11:test