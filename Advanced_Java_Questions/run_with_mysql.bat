@echo off
REM Helper script to compile and run Java programs with MySQL Connector

if "%1"=="" (
    echo Usage: run_with_mysql.bat ProgramName
    echo Example: run_with_mysql.bat LabEighteen
    exit /b 1
)

set PROGRAM_NAME=%1
set MYSQL_JAR=mysql-connector-j-9.4.0.jar

echo Compiling %PROGRAM_NAME%.java with MySQL connector...
javac -cp ".;%MYSQL_JAR%" %PROGRAM_NAME%.java

if %ERRORLEVEL% EQU 0 (
    echo Compilation successful! Running %PROGRAM_NAME%...
    echo ==========================================
    java -cp ".;%MYSQL_JAR%" %PROGRAM_NAME%
    echo ==========================================
) else (
    echo Compilation failed!
)

pause
