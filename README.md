## **Memory allocation**
---
In Java it is the JVM(Java virtual machine) that allocates memory and divides it into Stack and Heap memory.
We have the Method are first which is a sort of Heap memory storing al the neccessary superclass name, class structure, interface name and constructors.
### Heap Memory
Heap stores the actual object we initialize in our code. Ex. when we use the new keyword JVM creates an instance inside our heap memory and its reference varable is stored in the stack. A discrete runnning function like the Garbage collections dletes the heap instance when there is no more referencing to it from the stack.
When a heap gets full it returns a ` java.lang.OutOfMemoryError`
There is no automatic de allocations but we have to use a garbage colection function to delete our heap instance created by the JVM.
Heap objects are also not continuous as JAVA has no concept of pointers the memory allocation in the heap is solely dependent on the JVM and says in the documentation that it may not be continuous.
## **References**
---
## **String**
---
Some methods in the string datatype include:

- `length()` -> This gives us an integer depicting the length of our array

- `charAt(index)` -> This tells us the character present in the string at that index.

- `toCharArray()` -> This converts our string into an array of characters, it can be stored in a new char array using `char[] arr=new char[str.length()]`

## **Switch Statement**
---
The switch statement is made to compare a variable against a list of values/objects without having to use repetetive if statement blocks which decreases readability.
A typical switch statement consists of `case` and `default` arguments (optional) which all need to be terminated by a break;

**Some Rules for Switch statements are**
1. Variables inside Switch statements can only be integer/convertible to integer (float, double, byte) or of the type strings and enums
2. Cases have to be the same type as the expression inside our switch.
3. `break` is used to terminate the sequence
4. No duplicate Cases.
5. `default` is an optional argument which will execute when no other case is satisfied.
6. `default` is typically declared at the end but if we specify it in the middle then a `break` must be provided.
7. Not every `case` needs to contain a `break`. If no `break` appears, the flow of control will fall through to subsequent cases until a `break` is reached.

TODO enhanced switch defnitions

