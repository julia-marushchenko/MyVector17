/**
 *  Java program to create a Vector and iterate through it.
 */

package com.mycollections;

import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create a Vector instance.
        Vector<Double> myVector = new Vector<>();

        // Add.
        myVector.add(2.0);
        myVector.add(1.8);
        myVector.add(9.7);
        myVector.add(5.6);
        myVector.add(12.4);
        myVector.add(3.4);
        myVector.add(2.3);

        // Printing each element of myVector collection.
        for (int index = 0; index < myVector.size(); index++) {
            System.out.println("Element with index " + index + " is " + myVector.get(index));
        }

    }
}