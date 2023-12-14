/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappplication;

/**
 *
 * @author ishmael chikoo
 * Java code 
 * Base Abstract class with method to be overridden
 */

//--------------------------------Abstract Class with abstract in the signature-------------------------------------------------//
abstract class BaseAbstractClass {
    //abstract method that needs to be overridded
     abstract void printInfo();
     
     
     //if we uncomment the following code, this method needs to be implemented in
     //the class that is extends the base abstract class else there will be an error
    /* abstract void greet(); */
}
