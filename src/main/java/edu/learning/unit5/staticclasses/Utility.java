package edu.learning.unit5.staticclasses;

public class Utility {

  //instance variable
  public    String name;

 //static variable
  public static int sum;


  /**
   * This is to explain the use of static variables
   *
   * Utility - class is getting loaded,
   * sum = 0   {memory - sum2131}
   * Utility.sum
   *
   Utility u1 = new Utility();
    // u1.name = null {memory - ace8yz}
    // u1.sum = 0   {memory - sum2131}

   Utility u2 = new Utility();
   // u2.name = null {memory -bce8yz}
   // u2.sum = 0 {memory - sum2131}


   /u1.name = "Ram"
   /u1.sum = 10;

   // print(u2.sum) -> 10

   //print(Utility.sum) -> 10
   */


  //default constructor
  public Utility() {

  }

  /**
   * This is a static method, the static method can be used by Class directly,
   * so we can use something like Utility.add(3,7) instead of
   * Utility u1 = new Utility()
   * u1.add(3,5)
   *
   * If you see the content of any static method, it will accept few input parameters
   * perform some operation with them, and then will return something back
   *
   * IT WILL NEVER TRY TO CHANGE THE STATE OF AN OBJECT
   * means it can never access instance variable
   * @return
   */
  public static int add (int a, int b) {
    int c = a + b;
    return c;
  }

  public static int substract(int a, int b) {
    return a - b;
    //you can not use //this inside this, because there is no current object here
  }
}
