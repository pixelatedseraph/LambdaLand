package AdvancedJava.FP;
import java.util.*;
interface Flyable{
    void Fly();
}
interface Runnable{
    void Run();
}
abstract class Animal{  /* since lambda expressions work only with functional interfaces , you have to convert abstract class to functional interface */
    public abstract void sound();
}
@FunctionalInterface
interface AnimalInterface{
    void sound();
}
public class AnonClass {
    public static void main(String[] args) {
        Flyable f1 = new Flyable() { /* anonymous class */
            @Override
            public void Fly() {
                System.out.println("flying!"); /* implements the interface method */
            }
        };
        /*   Animal a1 = new Animal();
        a1.sound()-> System.out.println("Animal makes sound!"); this wont work */
        AnimalInterface ai = ()-> System.out.println("Animal makes sound!"); /* works just fine */
        /* now instead of making an anonymous class we can use lambda expression */
        /* syntax : (params) -> expression */
        /* lambda expressions works only with functional interfaces */
        Runnable r1 = () -> System.out.println("running!");  /* much cleaner */
        f1.Fly();
        r1.Run();
        ai.sound();
    }
}
