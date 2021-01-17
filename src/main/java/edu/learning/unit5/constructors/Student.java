package edu.learning.unit5.constructors;

public class Student {

  //instance variable
  String name;
  int yearOfBirth; //1990


  /**
   * This is the default constructor, it there by default
   * I have created multiple constructors via constructor overloading
   * Salient Points for overloading:
   * 1. The method name remains same
   * 2. The number of parameters or the dataType of the parameters needs to be different
   * 3. Method Overloading is not possible by changing the return type of method only
   */
  public Student() {
  }

  //String name is local varable / parameter
  public Student(String name){
    this.name = name;
  }

  public Student (int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public Student (String name, int yearOfBirth) {
    this.name = name;
    this.yearOfBirth = yearOfBirth;
  }

  /*public int getAge() {
    return 2021 - this.yearOfBirth;
  }*/

  public static int getAge (int yearOfBirt) {
    return 2021 - yearOfBirt; //2021 - 1991
  }

/*  public void methodName () {
    System.out.println("Methid is getting called");
  }

  public void methodName (String name) {
    System.out.println(name);
  }

  public void methodName (int age) {
    System.out.println(age);
  }

  public void methodName (String name, String yearofbirth) {
    System.out.println(name);
    System.out.println(yearofbirth);
  }*/





}
