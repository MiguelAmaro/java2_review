package com.examples;
import java.io.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ExFiles
{
  public static void File_Scanner_readFileAndPrint()
  {
    File myFile = new File("filename.txt");
    try {
      Scanner myReader = new Scanner(myFile);
      while (myReader.hasNextLine())
      {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e)
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return;
  }
  public static void File_deleteFile()
  {
    File myFile = new File("filename.txt");
    if (myFile.delete()) { 
      System.out.println("Deleted the file: " + myFile.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
    return;
  }
  public static void PrintWriter_writeToConsole()
  {
    PrintWriter writer = new PrintWriter(System.out);    
    writer.write("Javatpoint provides tutorials of all technology.\n");        
    writer.flush();  
    //Data to write in File using PrintWriter       
    writer.close();  
    return;
  }
  public static void PrintWriter_writeToFile()
  {
    PrintWriter writer1 =null;      
    try{
      writer1 = new PrintWriter(new File("testout.txt"));  
    } catch  (FileNotFoundException e)
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
    writer1.flush();  
    writer1.close();
  }
  public ExFiles()
  {
    System.out.println("examples read files: hello world");
    
  }
}