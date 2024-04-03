/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingletonPart1;

/**
 *
 * @author Muhammad Saad
 */
public class Singleton {
    private static final Singleton instance = new Singleton();
    private int value;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton get() {
        // Singleton getInstance method
        return instance;
    }

    // Existing interface methods
    public int getValue() {
        return value;
    }

    public void setValue(int value_) {
        value = value_;
    }

    public static void main(String[] args) {
        Singleton.get().setValue(42);
        System.out.println("value=" + Singleton.get().getValue());
    }
}

