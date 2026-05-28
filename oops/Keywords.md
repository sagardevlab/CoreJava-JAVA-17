Static Keyword - 
- static means - belongs to class itself, not to objects
- if used on fields - it is shared by all objects, only one copy of that field is exists in memory, used for common data, counters, constants, configuration etc
- if used on Methods - it can be called directly using classname.methodname() , no object needed. Inside static method, this keyword is not allowed.
Main method is static - Because JVM calls it before creating any object.
- Static Block - Runs only once when class loads into JVM, used for static initialization, loading drivers and configuration setup
- Static import - allows direct use of static members without class name
for example - if we import static java.lang.Math.*; , we can use sqrt method like this sqrt(x) instead of Math.sqrt(x)

Important Point - static members live in Mehod Area/MetaSpace, not inside object heap memory, because they belong to class itself.




Final Keyword - 
- Final means - cannot be changed further
- Final Variable - value cannot be reassigned after initialization
- Final Method - cannot be overridden by subclass, used when behaviour should never change, for example - security methods, core logic, immutable behavior
- Final Class - Class cannot be extended, used to - prevent inheritance, increase security, make immutable classes
One example where its used is Java String Class - it is immutable and secure. no one can inherit that



Object Class Methods (Must Know) -
- equals(Object) - Logical equality
- hashCode() - hash bucket placement
- toString() - String representation
- clone() - shallow copy(Implement cloneable)
- finalize() - Called before GC
- getClass() - return runtime class
- wait() / notify() - Thread Communication (in synchronized block)

