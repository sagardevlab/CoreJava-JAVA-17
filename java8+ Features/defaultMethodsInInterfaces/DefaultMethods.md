# Default Methods

Problem - with interfaces before Java 8, interface could only have abstract methods, suppose we want to add new method to interface, that breaks all existing classes. because every class must implement that new method which was added

### Java 8 introduced Default Methods to resolve this problem - 

Default methods are added inside interfaces
These methods already have implementation, So old classes do not break

Example - 
```
interface Animal{
    void Sound();

    default void sleep(){
        System.out.println("Sleeping...");
    }
}
```


### Why this is useful

There can be n number of classes that implement an interface.
If we add new method inside the interface, old code would break. Default methods allow adding new methods safely



# Static Methods in interface
Java 8 allow static methods in interface, that static method can be called using interface name

Example - 
```
interface MathUnit{
    static int square(int x){
        return x * x;
    }
}
```

Usage - 
```
System.out.println(MathUtil.square(x));
```

