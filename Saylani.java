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
public class Saylani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
       
        teacher[] tc = new teacher[10];
        student[] st = new student[10];
        int i=0;
        int tsearch;
        int choose;
        
        System.out.println("Enter 1 for ADD TEACHER \nEnter 2 for ADD STUDENT\n");
        int choice = sc.nextInt();
            
        if(choice==1){           
               do{
                tc[i] = new teacher();
                sc.nextLine(); 
          
            System.out.println("Enter Teacher ID");
            tc[i].ID = sc.nextInt();
                
            System.out.println("Enter Teacher name");
            tc[i].name = sc.next();
            System.out.println("Enter Teacher age");
            tc[i].age = sc.nextInt();
            System.out.println("Enter Teacher Experience");
            tc[i].exp = sc.nextInt();
            i++;
            
             System.out.println("Do you want to add Another Record?\nPress 1 for Yes\nPress 2 for No");
                 choose = sc.nextInt();               
                 if(choose==2){
                     break;
                 }
                        
        }while(choose==1);
            
               System.out.println("Enter Teacher ID to View Teacher Record");
                 tsearch = sc.nextInt();
                 
                 for (int j = 0; j < tc.length; j++) {
                if (tsearch==(tc[j].ID)) {
                    System.out.println("\t\t\t\t\t\t\t\t-------------------------------------------------\n\n\t\t\t\t\t\t\t\tName : "+tc[j].name + "\n\t\t\t\t\t\t\t\tAge : " + tc[j].age + "\n\t\t\t\t\t\t\t\tExperience : " + tc[j].exp + "\n\t\t\t\t\t\t\t\t-------------------------------------------------");
                }
                 }
                 System.out.println("No record Found");
        }
    
        
        
        
        
         if(choice==2){
            do{
                st[i] = new student();
                sc.nextLine(); 
          
            System.out.println("Enter Student ID");
            st[i].ID = sc.nextInt();
                
            System.out.println("Enter Student name");
            st[i].name = sc.next();
            System.out.println("Enter Student age");
            st[i].age = sc.nextInt();
            i++;
            
             System.out.println("Do you want to add Another Record?\nPress 1 for Yes\nPress 2 for No");
                 choose = sc.nextInt();               
                 if(choose==2){
                     break;
                 }
                        
        }while(choose==1);
            System.out.println("Enter Student ID to View Student Record");
                 tsearch = sc.nextInt();
                 
                 for (int j = 0; j < st.length; j++) {
                if (tsearch==(st[j].ID)) {
                    System.out.println("\t\t\t\t\t\t\t\t-------------------------------------------------\n\n\t\t\t\t\t\t\t\tName : "+st[j].name + "\n\t\t\t\t\t\t\t\tAge : " + st[j].age +"\n\t\t\t\t\t\t\t\t-------------------------------------------------");
                }else{
                    System.out.println("No record Found");
                }
                 }
                 
            }
        else{
            System.out.println("Wrong Number");
        }
    }
        }

