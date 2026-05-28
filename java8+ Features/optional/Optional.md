# Optional<T>

It is a container object that may or may not contain a value.

It helps reduce null checks and avoid NullPointerException

### Why Optional was introduced

Before Java 8, Code often looked like this - 
```
if(name != null){
    System.out.println(name.toUpperCase());
}
```

If you forget the null check:
```
System.out.println(name.toUpperCase());
```

You may get NullPointerException
Optional makes the intent clearer

This of optional like a box, A box that may contain a String like 
```
Optional("Java")
```
or 
```
Optional.empty
```

### 1. Creating Optional

Use when value is definitely NOT null
```
Optional<String> name = Optional.of("Sagar");
```

Now the optional contains:
Optional["Sagar"]

#### What if null is passed instead of Sagar
```
Optional<String> name = Optional.of(null); 
```
This throws :
```
NullPointerException
```

Because of() excepts non-null value

### 2. Optional.ofNullable()

Use when value MAY be null
```
String data = null;
Optional<String> name = Optional.ofNullable(data);
```
Now instead of exception we will get:
```
Optional.empty
```

This is safer

### 3. Optional.empty()

Creates an empty Optional

```
Optional<String> empty = Optional.empty();
```

Means : no value inside

### 4. Checking Value

Checks whether value exists or not and return true or false

```
Optional<String> name = Optional.of("Sagar");
System.out.println(name.isPresent());
```
Output:
```
true
```

### Other methods to explore
 
name.isPresent()      Checks whether value exists
name.get()            returns the actual value, but if value not exists, it return NoSuchElementException
name.orElse()         If value exists, returns it. Else, returns default value
name.ifPresent()      Runs code only if value exists
