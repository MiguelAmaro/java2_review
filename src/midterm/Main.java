package com.midterm;

//- Question 2
class First
{
  public First()
  {
    System.out.println("a");
  }
  public String toString()
  {
    return "F";
  }
}
class Second extends First
{
  public Second()
  {
    System.out.println("b");
  }
  public String toString()
  {
    return super.toString() + "S";
  }
}
//- Question 2
public class Main
{
  public static void main(String[] Args)
  {
    System.out.println("midterm: hello world");
    
    //- Question 2
    First f = new Second();
    System.out.println(f.toString());
    //Answer: a\nb\nFS
    //- Question 2
    //- Question 3
    
    
    
    return;
  }
}