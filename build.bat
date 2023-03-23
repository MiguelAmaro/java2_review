@echo off

set PROJ_DIR=%cd%
set FLAGS=-d %PROJ_DIR%\build


echo building examples package..
javac %FLAGS% ^
%PROJ_DIR%\src\Examples.java ^
%PROJ_DIR%\src\ExFiles.java

echo building main package..
javac %FLAGS% --class-path %PROJ_DIR%\build ^
%PROJ_DIR%\src\Main.java

rem ==================================================
echo building midterm package..
javac %FLAGS% --class-path %PROJ_DIR%\build ^
%PROJ_DIR%\src\midterm\Main.java

echo building lecture_example package..
javac %FLAGS% --class-path %PROJ_DIR%\build ^
%PROJ_DIR%\src\lecture_examples\Main_AbstractClassFileIOExceptions.java

:eof