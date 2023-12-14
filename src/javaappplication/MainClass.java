/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaappplication;

/**
 *
 * @author ishma
 */
public class MainClass {

    /**
     * @param args the command line arguments
     * The main method to test the code
     */
    public static void main(String[] args) {
    
//-------------------------------------Abstract class Testing----------------------------------//
        
        //Instantiating Student class
        Student aStudent = new Student();
        //Calling the printInfo method
        aStudent.printInfo();
    
        /* You can not instatiate an abstract class    
           The following does not work and gives an error
        */
          // BaseAbstractClass baseClass = new BaseAbstractClass();
  
    
//-------------------------------------END-------------------------------------------------------//
  
//---------------------------------- interfaces---------------------------------------------------------//
    System.out.println("-------------------------Working with interfaces--------------------------------");
    WorkerClass aWorker =  new WorkerClass();
    aWorker.display();
    aWorker.myCar();
    
    
//-------------------------------------END-------------------------------------------------------//
     
    }
    
}
