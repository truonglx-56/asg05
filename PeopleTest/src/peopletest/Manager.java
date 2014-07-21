/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package peopletest;

import java.util.Date;

/**
 *
 * @author TruongLX
 */
class Manager extends Employee{
    
  
   protected  Employee Assistant;
  
   public Manager (String n , Date d , double s) {
        name = n;
        birthday = d;
        salary =s;

    }
    
   public void setAssistant(Employee a){
        
        salary=a.getSalary();
        name =a.getName();
        birthday=a.getDate();   
   }
} 

