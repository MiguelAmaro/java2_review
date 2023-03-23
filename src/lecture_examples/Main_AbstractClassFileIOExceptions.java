package com.lecture_examples.abstractclass_fileio_exceptions;
//- Review Question 
// A) Hello World
// B) File already exists. Use the append method instead (correct)
// C) Compilation error due to incorrect syntax in the code
// D) Runtime error due to FileNotFoundException
// E) Runtime error due to OverwriteException
//- 
import java.io.*;
//import lecture_examples.abstractclass_fileio_exceptions.Main.OverwriteException;

interface Writer
{
  void write(String text) throws IOException;
}
abstract class Appender
{
  public void append(String text) throws IOException
  {
    PrintWriter writer = new PrintWriter(new FileOutputStream("lecture_examples_main_test.txt", true));
    writer.println(text);
    writer.close();
  }
}
public class Main_AbstractClassFileIOExceptions
{
  //-Inner Class
  static class OverwriteException extends IOException
  {
    public OverwriteException(String message)
    {
      super(message);
    }
  }
  //-Inner Class
  //error: write(String) in FileAppender cannot implement write(String) in Writer
  //       overridden method does not throw OverwriteException
  //fix  : changing OverwriteException to extend IOException instead of Exception
  static class FileAppender extends Appender implements Writer
  {
    public void write(String text) throws OverwriteException, IOException
    {
      File file  = new File("text.txt");
      if(file.exists())
      {
        throw new OverwriteException("File already exists. Use the append method in ...");
      }
      append(text);
    }
  }
  public static void main(String[] Args)
  {
    System.out.println("main: hello world");
    try {
      Writer writer = new FileAppender();
      writer.write("Hello");
      writer.write("World");
    }
    catch(IOException e) {
      e.printStackTrace();
    }
    try
    {
      FileInputStream in = new FileInputStream("test.txt");
      int data = in.read();
      while(data != -1)
      {
        System.out.print((char)data);
        data = in.read();
      }
    } catch(IOException e) {
      e.printStackTrace();
    }
    return;
  }
}