package edu.learning.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoCustomerList {

  private static ArrayList<WordPair> allPair;

  public static void main(String[] args) {
    allPair = new ArrayList<>();

  //IST BLOCK
   //1st iteration
    //i = 0,
      // j= 1
    //HI, THERE

    //2nd Iteration
    //i=0,
    // j =2
    //HI, TYLER

    //3rd Iteration
    //i=0,
    // j =3
    //HI, SAM


    //2nd BLOCK
    //1st iteration
    //i = 1,
    // j= 2
    //THERE, TYLER

    //2nd Iteration
    //i=1,
    // j =3
    //THERE, SAM

    //3rd BLOCK
    //1st iteration
    //i = 2,
    // j= 3
    //TYLER, SAM

    //4rth BLOCK
    //i=3, //WE DONT NEED
    // j =4
    //SAM,

    //HI, THERE, TYLER, SAM
    for (int i = 0; i < allPair.size()-1 ; i++) {
      String x = "HI";



      for (int j = i+1; j < allPair.size() ; j++) {
        String y = "THERE";
        WordPair wordPair = new WordPair(x, y); //HI, THERE
        wordPair.getName1(); //x
        wordPair.getName2(); //y


         wordPair = new WordPair("HEllo", "World"); //HI, THERE
        wordPair.setName1("Hello");


        wordPair.getName1(); //HEllo
        wordPair.getName2(); //World

        allPair.add(wordPair);
      }
    }







    List<Integer> numbers = Arrays.asList(60,89,99);


    //numbers [60,89,99]
    int index = 0;
    for (Integer number: numbers) {
      System.out.println(number);
      System.out.println(numbers.get(index));
      index++;
      //I DONT DEAL IN INDEX
      //NO INDEX INFO HERE
    }

    //0, 1, 2
    for (int i = 0; i < numbers.size() ; i++) {
      System.out.println(numbers.get(i));

    }



  }
}
