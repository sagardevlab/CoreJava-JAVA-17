# Lambda Expressions

Lambda expression is a compacy way to write a function without creating a separate class

It is mainly used when you need to pass behavior as an argument, such as sorting, filtering, or handling events.

## Before Java 8  
if you wanted to pass behavior, you usually had to write:
- an anonymous inner class, or
- a full class implementing an interface

### Example - 

```
Runnable r = new Runnable(){
    @Override
    public void run(){
        Systen.out.println("Running");
    }
}
```

### With Lambda - 

```
Runnable r = () -> System.out.println("Running");
```

### Another Example - 

```
Comparator<String> c = (a,b) -> a.compareTo(b);
System.out.println(c.compare("apple","banana"));
```

here - 
- Comparator<String> compares two strings
- a and b are the two inputs
- a.compareTo(b) returns:
    - negative if a<b
    - zero if equals
    - positive if a>b

### Lambda with Block Body

If logic is more than one statement, use braces:

```
Comparator<String> c = (a,b) -> {
    int result = a.compareTo(b);
    return result;
}

```

- If body has one expressoin, return can be omitted
- If body has multiple statements, use {} and return if needed

### Lambda with one parameter

If there is only one parameter, parentheses are optional:

```
n -> n%2 == 0
```

### Lambda with no parameter

```
() -> System.out.println("Hello Sagar")

```