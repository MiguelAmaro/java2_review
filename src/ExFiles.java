package com.examples;
import java.io.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//- In class 
/*
A) Hello World
B) File already exists. Use the append method instead (correct)
C) Compilation error due to incorrect syntax in the code
D) Runtime error due to FileNotFoundException
E) Runtime error due to OverwriteException
*/
import java.io.PrintWriter;
import java.io.;
interface Writer {
    void write(String text) throws IOException, OverwriteException;
}
abstract class Appender{
    public void append(String text) throws IOException{
        PrintWriter writer = new PrintWriter(new FileOutputStream("test.txt", true));
        writer.println(text);
        writer.close();
    }
}
//- In class

public class ExFiles
{
    //-Inner Class
    static class OverwriteException extends Exception{
        public OverwriteException(String message){
            super(message);
        }
    }
    static class FileAppend extends Appender implements Writer{
        public void write()
        {
            File file  = new File("text.txt");
            if(file.exists())
            {
                throw new OverwriteException("File already exists. Use the append method in ...");
            }
            file.append(text);
        }
    }
    public static void File_Scanner_readFileAndPrint()
    {
        File myFile = new File("filename.txt");
        try {
            Scanner myReader = new Scanner(myFile);
            
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
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
        try{
            
        } catch {
            
        } catch{
            
        }
        try{
            FileInputStream in = new FileInputStream("test.txt");
            int data = in.read();
            while(data != -1) {
                System.out.print((char)data);
                data = in.read();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}