package com.main;
import com.examples.*;


public class Main
{
    public static void main(String[] Args)
    {
        System.out.println("main: hello world");
        
        Examples ex      = new Examples();
        ExFiles  exFiles = new ExFiles();
        
        exFiles.File_Scanner_readFileAndPrint();
        exFiles.PrintWriter_writeToConsole();
        exFiles.PrintWriter_writeToFile();
        //exFiles.File_deleteFile();
        
        
        return;
    }
}