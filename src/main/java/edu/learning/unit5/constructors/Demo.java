package edu.learning.unit5.constructors;

import edu.learning.unit5.constructors.Student;
import edu.learning.unit5.staticclasses.Utility;

public class Demo {

  //print the age of a student
  public static void main(String[] args) {

   /* Student firstStudent = new Student();
    Student secondStudent = new Student("Ram");
    Student thirdStundent = new Student(2020);*/
    Student fourthStudent = new Student("Vivek", 1991);
    fourthStudent.getAge(1991);
    Student.getAge(1991);


    Utility utility = new Utility();
    utility.add(2, 5);






  }
}
