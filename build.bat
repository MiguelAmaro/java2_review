@echo off

set PROJ_DIR=%cd%
set FLAGS=-d %PROJ_DIR%\build


echo build examples package..
javac %FLAGS% ^
%PROJ_DIR%\src\Examples.java ^
%PROJ_DIR%\src\ExFiles.java


echo build main package..
javac %FLAGS% --class-path %PROJ_DIR%\build ^
%PROJ_DIR%\src\Main.java

:eof