# Method References

A method reference is a shorter form of a lambda when the lambda only calls an existing method

### Instead of : 

```
s -> s.toUpperCase()
```

### you can write:
```
String::toUpperCase
```

## Types of Method References

### 1. Static Method Reference

Syntax: 
```
ClassName::staticMethod
```

Example:
```
Function<String, Integer> parse = Integer::parseInt;
System.out.println("123"); // 123 
```

Equivalent to : 
```
s -> Integer.parseInt(s);
```

### 2. Instance method reference of a particular object

Syntax: 
```
instance::method
```

Example:
```
String text = "hello";
Supplier<String> sup = text::toUpperCase;
System.out.println(sup.get()); //HELLO
```

Equivalent to:
```
() -> toUpperCase()
```

### 3. Instance method reference of an arbitrary object of a type

Syntax:
```
ClassName::instanceMethod
```

Example:
```
Function<String, String> upper = String::toUpperCase;
System.out.println(upper.apply("java")); // JAVA
```

Equivalent to:
```
s -> s.toUpperCase()
```

### 4. Constructor reference

Syntax:
```
ClassName::new
```

Example:
``` 
Supplier<ArrayList<String>> listSupplier = ArrayList::new;
ArrayList<String> list = listSupplier.get();
```

Equivalent to:
```
() -> new ArrayList<>()
```
