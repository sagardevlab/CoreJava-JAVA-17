package oops.abstraction;

public interface Drawable {
    void draw(); // implicitly public and abstract

    default void show(){
        System.out.println("Drawing...");
    }

    static Drawable noOp(){
        return () -> System.out.println("No operation");
    }
}
