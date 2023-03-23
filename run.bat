@echo off

set PROJ_DIR=%cd%
set FLAGS=--class-path %PROJ_DIR%\build

rem java %FLAGS% com.main.Main
java %FLAGS% com.midterm.Main

:eof