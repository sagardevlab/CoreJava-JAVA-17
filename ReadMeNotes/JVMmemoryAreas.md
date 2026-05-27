# JVM Memory Areas

## 1. Heap

Objects , Instance Variables, GC managed


## 2. Stack

Method frames, local variables,


## 3. MetaSpace

Class Metadata (replaced permGen in Java 8)


## 4. Code Cache

JIT-compiled native code


## 5. PC Register

Current Instruction address per thread


## 6. Native Stack

For native(JNI) method calls
------------------------------------------------------------

### Detail Explanation below-

### - What JNI is -

Normally Java runs inside JVM

But sometimes Java need to -

- use OS-level features
- access hardware
- use high-performance native libraries
- reuse old C/C++ code

JNI allows Java to communicate with native programs


### - What is JIT Compiled Native Code -

Java ByteCode converted into machine code at runtime by the JIT Compiler


### - Instruction Address Per thread of PC register - 

JAVA program executes intructions one by one. JVM converts the java code into bytecode instructions, PC Register keeps track of which instruction JVM should execute next.

It is needed for -

- tracking execution flow
- loops
- method calls
- thread switching
- exception handling


### - What is GC Managed -

Memory is automatically managed by the garbage collector. Programmer does not manually free memory. GC automatically removes unused objects. So the memory is managed by GC, thats why it is called as GC Managed.
