# SER502-clove-Team10


A github repository for Team 10 for SER 502 project in Spring 2024. The team has developed the programming language: 'CLOVE'.

Team #10 Contributors:
1. Raajveer Khattar - rkhatta1
2. Jill Hansalia - jhansali
3. Sahil Parwani - sparwan1
4. Akshata Kulkarni - akulka89

# Clove 

Here, we have built lexer and parser using ANTLR and an evaluator in Java. Since, ANTLR generates lexer and parser files in Java, we have then integrated them with Evaluator written in Java.

Tools used : Antlr, Java, Intellij, Github

To install Clove langauge:

Java and Antlr are used to build the Clove language. Both need to be installed on your machine in order for you to use it. For additional details on configuring Antlr and Java (requiring JDK 15 or later), you can find [antlr here](https://www.antlr.org/), and [here](https://java.com/en/download/help/download_options.html) re options to download Java. If they aren't there already, you must add the Java and Antlr installs to your CLASSPATH environment variable. (Instructions for the Antlr installation can be found on their official website).

## Steps:

NOTE: Since Clove is an interpreted language, once the grammar is finalized and the parse tree is built, there is no need to rebuild it. Clove source code files can be run with just one command line script. 

1. Download the source code with Zip file for Clove language.
2. Unzip the file to the location of your choosing.
3. Open the data directory and add the file (`fileName.clove`, for example) that you want to run.
4. Open the command prompt in the src directory by navigating there.
5. On windows run the command : `java -jar <downloaded antlr jar file path> -no-listener -visitor -o . CloveGrammar.g4`
6. On Mac you can run the command : `antlr -visitor CloveGrammar.g4`
7. You can see the lexer and parser file generated.
8. Compile the Clove : `javac -cp "<downloaded antlr jar file path>" *.java`
9. Execute the Clove evaluator : `java -cp ".;<downloaded antlr jar file path>" CloveGrammar`
