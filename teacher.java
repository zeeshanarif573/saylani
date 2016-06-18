/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saylani;

public class teacher {
    
    
    String name;
    int ID;
    int age;
    int exp;
    int tcount=0;
   
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setId(int ID){
        this.ID=ID;
    }
    public void setExperience(int exp){
        this.exp=exp;
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
    public int getExp(){
        return exp;
    }
}
