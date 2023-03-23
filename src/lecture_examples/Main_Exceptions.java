package lecture.examples;

public class Main 
{
  public Main() {}
  //- example 2
  static void checkAge(int age)
  {
    if(age < 18)
    {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else 
    {
      System.out.println("Access granted - You are old enough!");
    }
  }
  //- example 2
  
  public static void main(String[] args)
  {
    System.out.println("lecture: exceptions");
    
    System.out.println("There is an array below:");
    //- example 1
    try
    {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[20]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.err.println("The array is out of bound " + e.getMessage());
    }
    catch(Exception e)
    {
      System.err.println("A weird error happend..." + e.getMessage());
    }
    finally 
    {
      System.out.println("The 'try catch' is finished.");
    }
    //- example 1
    
    //- example 2
    checkAge(15); // Set age to 15 (which is below 18...)
    //- example 2
    
  }
  return;
}