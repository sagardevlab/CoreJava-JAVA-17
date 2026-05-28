package oops.polymorphism;

public class Calculator {
    
    //1st type of polymorphism
    //Compile time polymorphism also known as Method Overloading - Same method name (such as add), different parameters

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){ //Overloaded
        return a+b;
    }
}
