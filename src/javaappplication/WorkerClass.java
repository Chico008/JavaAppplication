/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappplication;

/**
 *
 * @author ishma
 */
public class WorkerClass implements Person, CarInterface{
    
    //overridding the methods in the interfaces
    @Override
    public void display() {
        System.out.println("I am a waiter");
   
    }

    @Override
    public void myCar() {
        System.out.println("I drive a Jeep");
    }
    
}
