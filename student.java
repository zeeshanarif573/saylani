/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saylani;

import java.util.Scanner;

/**
 *
 * @author zeeshan
 */
public class student {
    
    Scanner sc= new Scanner(System.in);
    String name;
    int ID;
    int age;
    
    
    public student(int ID,String name, int age){
        this.name=name;
        this.ID=ID;
        this.age=age;
        
    }
     student() {
        }

     public void setName(){
        name=sc.next();
    }
    public void setAge(){
        age=sc.nextInt();
    }
    public void setId(){
        ID =sc.nextInt();
    }
    
    public String getName(){
        return name;
    }
    public int getId(){
        return ID;
    }
    public int getAge(){
        return age;
    }
    
}
