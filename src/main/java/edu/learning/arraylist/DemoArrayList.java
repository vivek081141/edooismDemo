package edu.learning.arraylist;

import java.util.ArrayList;

public class DemoArrayList {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    //insertion
    list.add("Student 1");
    list.add("Student 2");
    list.add("Student 3");

    WordPair customer = new WordPair("Student 1", "Student2");

    Integer[] students = new Integer[10];
    students[0] = 1;

   //transversing

    //for loop
    for (int i=0; i< list.size(); i++) {
      System.out.println(list.get(i));
      //students[i]
    }

    //for each loop
    for(String s: list){
      System.out.println(s);
    }

    //delete/remove
    list.remove(2);

    list.size(); //2

    list.clear();

    list.size(); //0


  }
}
