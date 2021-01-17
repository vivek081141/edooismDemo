package edu.learning.arraylist;

public class WordPair {

  //instance variables
  private String name1;
  private String name2;

  //a constructor is a method
  public WordPair(String word1, String word2) {
    this.name1 = word1;
    this.name2 = word2;
  }

  public String getName1() {
    if (this.name1 == null){
      return "";
    }
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }

  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  @Override
  public String toString() {
    return "WordPair{" + "name1='" + name1 + '\'' + ", name2='" + name2 + '\'' + '}';
  }
}

