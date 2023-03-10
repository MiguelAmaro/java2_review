@echo off

set PROJ_DIR=%cd%
set FLAGS=--class-path %PROJ_DIR%\build

java %FLAGS% com.main.Main

:eof