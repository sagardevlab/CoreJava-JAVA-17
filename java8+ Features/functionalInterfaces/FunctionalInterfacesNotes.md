# Functional Interface

Interface with one abstract method

This is important because lambdas can only be assigned to functional interfaces

```
@FunctionalInterface
interface MyPrinter{
    void print();
}
```

myPrinter is functional interface as it only has one abstract method print()

### We can use a lambda here:

```
MyPrinter p = () -> System.out.println("Printing....");
p.print();
```

## Why to use Functional Interface

It tells the compiler that : 
- This interface must have exactly one abstract method
- If more abstract methods are added later, compilation fails

It helps prevent mistakes.

## Built-in functional interfaces in java.util.function

Java provides many ready made functional interfaces. 

### 1. Predicate<T>

Represents a condition that returns true or false

``` 
boolean test(T t)
```
Example - 
```
Predicate<Integer> isEven = n -> n%2 == 0;
System.out.println(isEven.test(10)); // true
System.out.println(isEven.test(7)); // false
```

Use when you want to test something

### 2. Function<T, R>

Represents a transformation from type T to type R

```
R apply(T t)
```

Example - 
```
Function<String, Integer> lengthFn = s -> s.length();
System.out.println(lengthFn.apply("Java")); // 4
```
Input - String
Output - Integer

### 3. Consumer<T>

It consumes a value and returns nothing

```
void accept(T t)
```

Example -
```
Consumer<Integer> printer = s -> System.out.println(s);
printer.accept("Hello");

```

Use it when you want to do something with a value, but not reutrn anything

### 4. Supplier<T>

Supplies a value, takes no input

```
T get()
```

Example - 
```
Supplier<String> supplier = () -> "Generated Value";
System.out.println(supplier.get());
```

Use when you want lazy creation or deferred computation

### 5. BiFunction<T, U, R>

Takes two inputs and returns one output

Method - 
```
R apply(T t, U u)
```

Example - 
```
BiFunction<Integer, Integer, Integer> add = (a,b) -> a + b;
System.out.println(add.apply(3,5)); //0
```

### 6. UnaryOperator<T>

A special case of Function<T, T>

Input and Output are same type

```
UnaryOperator<Integer> square = n -> n * n;
System.out.println(square.apply(4));
```

### 7. BinaryOperator<T>

A special case of BiFunction<T, T, T>

Both inputs and output are same type

Example 
```
BinaryOperator<Integer> max = (a,b) -> Math.max(a, b);
System.out.println(max.apply(10,20));
```
