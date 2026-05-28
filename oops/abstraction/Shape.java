package oops.abstraction;

abstract class Shape {
    abstract double area();
    
    void print(){
        System.out.println("Area: " + area());
    }
}
