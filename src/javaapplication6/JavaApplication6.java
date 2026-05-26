
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
    
     static void Capture(){
         do{ 
        System.out.println("*******************************************");
        System.out.println("Welcome to EC Student Management System!");
        System.out.println("*******************************************");
        System.out.println("1. Add new Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search by Name");
        System.out.println("4. Update Student info");
        System.out.println("5.Remove Student");
        System.out.println("6. Display Average Grade of all students"); 
        System.out.print("Option: ");
        option = sc.nextInt();
        sc.nextLine();
          
        switch(option){
            case 1 -> Add(sc, ID, Name, Age, Grade, Course);
            case 2 -> View();
            /*case 3 -> Search();
             /*case 4 -> Update();
            case 5 -> Remove();
            case 6 -> Average();
            default -> System.out.println("Invalid Input!");*/
        }
         }while(true);
       
    }
     
    static void Add(Scanner sc, ArrayList ID, ArrayList Name, ArrayList Age, ArrayList Grade, ArrayList Course){
        System.out.print("Student ID: ");
        int idNum = sc.nextInt();
        sc.nextLine();
        ID.add(idNum);
        
        System.out.print("Student Name: ");
        String name = sc.nextLine();
        Name.add(name);
        
        System.out.print("Student Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        Age.add(age);
        
        System.out.print("Student Grade: ");
        double grade = sc.nextDouble();
        Grade.add(grade);
        sc.nextLine();
        
        System.out.print("Student Course: ");
        String StCourse = sc.nextLine();
        Course.add(StCourse);
        
    }
    
    static void View(){
        System.out.println("ID NUmbers: "+ ID);
        System.out.println("Names: "+ Name);
        System.out.println("Ages: "+ Age);
        System.out.println("Grades: "+ Grade);
        System.out.println("Courses: "+ Course);
    }
    
    static void Search(){
        
    }

    
    public static void main(String[] args) {
        Capture();
        
    }
    
}
