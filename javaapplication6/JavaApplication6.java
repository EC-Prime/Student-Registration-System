
package javaapplication6;

import java.util.ArrayList;
import java.util.Scanner;


public class JavaApplication6 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> ID = new ArrayList<>();
    static ArrayList<String> Name = new ArrayList<>();
    static ArrayList<Integer> Age = new ArrayList<>();
    static ArrayList<Double> Grade = new ArrayList<>();
    static ArrayList<String> Course = new ArrayList<>();
    static int option;
    static double average;
    
     static void Capture(){
         do{ 
        System.out.println("*******************************************");
        System.out.println("Welcome to EC Student Management System!");
        System.out.println("*******************************************");
        System.out.println("1. Add new Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search by Name");
        System.out.println("4. Update Student info");
        System.out.println("5. Remove Student");
        System.out.println("6. Display Average Grade of all students"); 
        System.out.print("Option: ");
        option = sc.nextInt();
        sc.nextLine();
          
        switch(option){
            case 1 -> Add();
            case 2 -> View();
            case 3 -> Search();
            case 4 -> Update();
            case 5 -> Remove();
            case 6 -> Average();
            case 7 -> 
            default -> System.out.println("Invalid Input!");
        }
         }while(true);
       
    }
     
    static void Add(){
        
        int idNum = ID.size()+1;
        ID.add(idNum);
        System.out.println("Auto-assigned ID: " + idNum);
        
        System.out.print("Student Name: ");
        String name = sc.nextLine();
        Name.add(name);
        
        System.out.print("Student Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        Age.add(age);
        
        System.out.print("Student Grade: ");
        double grade=0;
        if(grade>0 && grade<=100){
           grade = sc.nextDouble(); 
        }else{
            System.out.println("Grades must be between 0 and 100!");
        }
        
        Grade.add(grade);
        sc.nextLine();
        
        System.out.print("Student Course: ");
        String StCourse = sc.nextLine();
        Course.add(StCourse);
        
        System.out.println("Succcessfully added a new student!");
        
    }
    
    static void View(){
         System.out.println("ID\tName\t\tAge\tGrade\tCourse");
         System.out.println("---------------------------------------------------------");
        for(int i =0; i<ID.size(); i++){
            System.out.println(ID.get(i)+ "\t"+ Name.get(i)+ "\t"+ Age.get(i) + "\t"+ Grade.get(i) + "\t"+ Course.get(i));
        }
    }
    
    static void Search(){
        System.out.print("Enter a student name to search for: "); 
        String name= sc.nextLine();
        for(int i=0; i<Name.size(); i++){
           if(Name.get(i).equals(name)){
                System.out.println(name + " was found at index no. "+i);
                System.out.println("ID number: "+ID.get(i));
                System.out.println("Full name: "+Name.get(i));
                System.out.println("Age: "+Age.get(i));
                System.out.println("Grade: "+Grade.get(i));
                System.out.println("Course: "+Course.get(i));
           }else{
               System.out.println("Student name not found!");
           } 
        
        }    
    }
    
    static void Update(){
        System.out.print("Enter the student ID of the student you want to apply an update to: ");
        int IDNum = sc.nextInt();
        
        for(int i=0; i<ID.size(); i++){
            if(ID.get(i).equals(IDNum)){
                System.out.println("ID number: "+IDNum+ " was found at index no. "+i);
                
                System.out.print("Update student's full name: ");
                String name = sc.nextLine();
                sc.nextLine();
                Name.set(i, name);
                System.out.println("New name is: "+ name);
                
                
                System.out.print("Update student's age: ");
                int age = sc.nextInt();
                sc.nextLine();
                Age.set(i, age);
                System.out.println("New age is: "+ age);
                
                System.out.print("Update student's grade(mark): ");
                double grade = sc.nextDouble();
                sc.nextLine();
                Grade.set(i, grade);
                System.out.println("New grade is: "+ grade);
                
                System.out.print("Update student's course name: ");
                String CourseName = sc.nextLine();
                Course.set(i, CourseName);
                System.out.println("New course is: "+ CourseName);
                
                System.out.println("""
                                   New details: 
                                   name """+name +" " +"age: "+age+" "+ "grade: "+grade+ " "+ "course: "+CourseName);
                System.out.println("Succesfully updated student details!");
                
            }else{
                System.out.println("ID number not found!");
            }
        }
    }

    static void Remove(){
        System.out.print("Enter the ID number of a student you want to remove: ");
        int IdNum = sc.nextInt();
       
        boolean found= false;
    for(int i =0; i<ID.size(); i++){
       if(ID.get(i).equals(IdNum)){
           found = true;
        System.out.println("Student ID was found at index no. "+ i);
        
        System.out.println("Removed student:  "+Name.get(i)+" " + ID.get(i)+" " + Age.get(i)+" "+ Grade.get(i)+ Course.get(i));
         ID.remove(i);
         Name.remove(i);
         Age.remove(i);
         Grade.remove(i);
         Course.remove(i);
            }
            }if(!found){
            System.out.println("Student not found!");
            }
        }
    
    
    static void Average(){
        System.out.println("Average Grade for ALL students");
        System.out.println("*******************************");
        double total=0;
        
        for(int i =0; i<Grade.size(); i++){
            total += Grade.get(i);
        }
        average = total/Grade.size();
        System.out.println("Grade average: "+ average);
    }

    public static void main(String[] args) {
        Capture();
        
    }
    
}



