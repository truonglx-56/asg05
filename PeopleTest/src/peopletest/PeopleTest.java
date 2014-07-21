/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package peopletest;

//import static java.awt.PageAttributes.MediaType.B;
import java.util.Date;

/**
 *
 * @author TruongLX
 */
public class PeopleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Employee N = new Employee("Newbie", new Date(10,2,1989), 2000000);
                System.out.println("Employee new :\n"+N.toString());
        
                Manager B = new Manager("Boss", new Date(2,23,1979), 40000000);
                System.out.println("Manager B :\n"+B.toString());
        
                
                Manager D = new Manager(" D", new Date(3,12,1969), 100000000);
                System.out.println("Manager D :\n"+D.toString());
        
            
     
     
          
            
            Person []a=new Person[3];
            a[0]= new  Employee("A", new Date(10,12,1952), 2000000);
            a[1]=new Manager("B", new Date(2,25,1979), 40000000);
            a[2]= new Manager("C", new Date(3,9,1993), 100000000);
            for (Person a1 : a) {
            System.out.println(a1.toString());
        }
    }
                
    }
    

