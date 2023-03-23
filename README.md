# Java Review

This purpose of this repo is to have a minimalistic project to play with the java features and the behaviors they produce.

## Things to review

- [ ] Multible in heritance via Interfaces
- [ ] Calling super class constructors/methods from child classes
- [ ] Abstract classes
- [ ] Overiding vs Overloading
- [ ] reading/writing files, file class usage
- [ ] exception handling, try/catch
- [ ] inner class
- [ ] static classes (inner, ect..)

## Creating a package

```batch
rem build.bat
rem NOTE:
rem provide the path to the examples class files so the compiler can resolve the 
rem import statement `import com.examples.*;` in the main java
rem PROJ_DIR\build -> \com\expamles\*.class
```

---

## Files and I/O

* Text/Ascii based files
  * `FileReader` `FileWriter`
  * `PrintWriter`
  * `BufferedWriter` `BufferedReader`
* Raw Bytes based files (Video Audio Stream)
  * `FileInputStream``FileOutputStream`
  * 
* Dunno
  * `Files`
  * `Scanner`
  * `FileWriter`
  * `FileOutputStream`

**Resources**

[Java Read Files](https://www.w3schools.com/java/java_files_read.asp)    [Java Delete Files](https://www.w3schools.com/java/java_files_delete.asp)    [Java PrintWriter class - javatpoint](https://www.javatpoint.com/java-printwriter-class)    [Java - Files and I/O](https://www.tutorialspoint.com/java/java_files_io.htm)



---

# Classes

**inner**

* is a class nested in another class (outer classs)

**static (inner class)** 

* can access it without creating an object of the outer class

* **methods**
  
  * ...

**abstract**

* cannot be instantiated (used to create objects)

* must be inherited by another class to be accessed

* **members**
  
  * can only be accessed by inheriting class?

* **methods**
  
  * cannot have body/definition because it is mandated that inheriting class define the methods





**Resources**

[Java Abstraction](https://www.w3schools.com/java/java_abstract.asp)    [Files (Java Platform SE 7 )](https://docs.oracle.com/javase/7/docs/api/java/nio/file/Files.html)    [BufferedWriter (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html)    [BufferedReader (Java Platform SE 7 )](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html)



**mutiple inheritance**





**Resources**

[Java Inner Class (Nested Class)](https://www.w3schools.com/java/java_inner_classes.asp)

---

# Interfaces



---

# Exceptions

### Common Types

* Exception is an object
  
  * `ArithmeticException`
  
  * `IOException`
  
  * ect..
  
  * User defined exception that extends the `Exception` object

* use try block on possibly offending code and report error message using catch block

* **checked**
  
  * 

* **unchecked**
  
  * 

* 

**Resources**

[Exception (Java Platform SE 7 )](https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html)    [Java Exceptions (Try...Catch)](https://www.w3schools.com/java/java_try_catch.asp)    [Exceptions in Java - GeeksforGeeks](https://www.geeksforgeeks.org/exceptions-in-java/)
