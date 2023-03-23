package lecture_examples.filesandio;
//- example; File
import java.io.File;        // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
//- example; File

//- example; FileWriter
import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
//- example; FileWriter

public class MainFilesAndIO
{
  public static void main(String[] args) 
  {
    //- example; File
    try
    {
      File myObj = new File("FileName.txt");
      if (myObj.createNewFile())
      {
        System.out.println("File created: " + myObj.getName());
      } 
      else
      {
        System.out.println("File already exists.");
      }
    } catch (IOException e)
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    //- example; File
    
    //- example; FileWriter
    try {
      
      FileWriter myWriter = new FileWriter("FileName.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
      
    }
    catch (IOException e)
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    //- example; FileWriter
    
  }
}

