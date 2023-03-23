@echo off

set PROJ_DIR=%cd%
set FLAGS=--class-path %PROJ_DIR%\build

rem java %FLAGS% com.main.Main
rem java %FLAGS% com.midterm.Main
java %FLAGS% com.lecture_examples.abstractclass_fileio_exceptions.Main_AbstractClassFileIOExceptions

:eof