package oops.polymorphism;

import oops.inheritance.*;

public class Runtime {
    
    Animal a = new Dog(); // upcasting

    public void makeSound(){
        a.sound(); // calls Dog's sound() at runtime - dynamic dispatch
    }

    public static void main(String[] args) {
        Runtime r = new Runtime();
        r.makeSound(); // Output: Bhow Bhow
    }
}
