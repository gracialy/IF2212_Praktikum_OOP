@echo off
set filename=MinOp

rem Compile the Java program
javac %filename%.java

rem Run the compiled program
java %filename%
