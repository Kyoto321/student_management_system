package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
* Created by Ayo Bankole on 19/10/2022.
* Hardcoding testing
* 
 */

public class Main {
   public static void main(String[] args) {
      Teacher Jane = new Teacher(id:1, name:"Jane Doe", salary:3000);
      Teacher John = new Teacher(id:2, name:"John Doe", salary:5000);
      Teacher Janise = new Teacher(id:3, name:"Janise Doe", salary:3000);

      List<Teacher> teacherList = new ArrayList<>();
      teacherList.add(Jane);
      teacherList.add(John);
      teacherList.add(Janise;)

      Student Bill = new Student(id:1, name:"Bill Smith", grade:4);
      Student Chloe = new Student(id:2, name:"Chloe Johnson", grade:6);
      Student Phil = new Student(id:3, name:"Phil Anderson", grade:5);

      List<Student> studentList = new ArrayList<>();
      studentList.add(Bill);
      studentList.add(Chloe);
      studentList.add(Phil);


      School ghs = new School(teacherList, studentList);
      //system.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());


      /** To add a new teacher */
      Teacher megan = new Teacher(id:4, name:"Megan" salary:"900")
      ghs.addTeacher(megan);


      Bill.payFees(fees:5000)
      //system.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

      Phil.payFees(fees:6000)
      system.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
   
      System.out.println("-------- GHS Salary-------")
      Jane.receiveSalary(Jane.getSalary());
      System.out.println("GHS paid " + Jane.getName() + "$" + Jane.getSalary() ". Total available balance is $" + ghs.getTotalMoneyEarned);

      John.receiveSalary(John.getSalary());
      System.out.println("GHS paid " + John.getName() + "$" + John.getSalary() ". Total available balance is $" + ghs.getTotalMoneyEarned);

   
   
   }
 }