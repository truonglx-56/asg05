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
class Employee extends Person{
    protected double salary; 
   
   
    public Employee(){}
    public Employee (String n , Date d , double s) {
   //super(name,birthday);
        name = n;
        birthday = d;
        salary =s;
     }
  public double getSalary(){
        return salary;
    }

    @Override
        public String toString(){
        return String.format
                ("  Name person : %s \n  Date of Birth :%s\n  Salary :%.2f\n"
                        , getName(),birthday.toString(),salary);
    }
}

    

