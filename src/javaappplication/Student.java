/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappplication;

/**
 *
 * @author ishma
 */
public class Student extends BaseAbstractClass{
    
    //----------------------------override printInfo method---------------------------//
    //override abstract base class method printInfo()
      void printInfo(){
        String name = "John";
        int age = 45;
        double salary = 100;
        
        System.out.println("Name \tAge \tSalary");
        System.out.print(name+"\t");
        System.out.print(age+"\t");
        System.out.print("R " +salary+" \n");
    }
     //-----------------------End-----------------------------------------------------
   
    
}
