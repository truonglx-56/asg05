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
public class Person {
    protected
        String name;
        Date birthday;
                     
    public Person() {
        name="";
    }
    public String getName(){
        return name;
            }
    public Date getDate(){
        return birthday;
    }
    public String toString(){
        return String.format
                ("Name : %s /nDate of Birth :%s", getName(),birthday.toString());
    }
    
}

