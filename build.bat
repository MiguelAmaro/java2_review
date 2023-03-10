@echo off

set PROJ_DIR=%cd%
set FLAGS=-d %PROJ_DIR%\build


echo build examples package..
javac %FLAGS% ^
%PROJ_DIR%\src\Examples.java

rem NOTE:
rem provide the path to the examples class files so the compiler can resolve the 
rem import statement `import com.examples.*;` in the main java
rem PROJ_DIR\build -> \com\expamles\*.class

echo build main package..
javac %FLAGS% --class-path %PROJ_DIR%\build ^
%PROJ_DIR%\src\Main.java

:eof