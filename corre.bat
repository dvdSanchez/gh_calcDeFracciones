@echo off

rem Cambiar el code page, para que se vean los acentos
chcp 65001
echo Se verifica que exista la carpeta classes
if not exist ".\classes\" mkdir ".\classes"

echo --- Compilando proyecto. 

javac  .\src\com\abstrae\calculadora\model\*.java -d .\classes
javac -cp .\classes .\src\com\abstrae\calculadora\vista\FraccionGui.java -d .\classes
javac -cp .\classes .\src\com\abstrae\calculadora\control\*.java -d .\classes
javac -cp .\classes .\src\com\abstrae\calculadora\Calculadora.java -d .\classes

echo --- Ejecutando proyecto
echo.
java -cp .\classes com.abstrae.calculadora.Calculadora
echo.
echo --- Fin de ejecución 

echo --- Limpiando proyecto 
rd .\classes /s /q 