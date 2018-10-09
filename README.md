# Programming-lang-Assignment

PL-Assignment:
    program explanation
PrintSomething.java:  Java Code

    • Language :  JAVA

Why Java?

    1. JAVA is easy to learn.
    2. JAVA is freely available.we can
    3. JAVA supports Object oriented Programming language.
    4. JAVA is platform independent. Means if you have java file then tou can run it on any machine.
    5. JAVA has large amount of libraries. JAVA provide networking, server programming, I/O,utilities, database connectivity, etc.
    6. Java has a lot of open source libraries, which can use in diffrent scenarios.
    7. A lot people uses java developement, thats why community of java developers is big.
    8. 


PROGRAM:


	class printStr{
  void printString(String str){
     	System.out.println("You passed a word\t" + str);
  }

}

class PrintSomething{
  	public static void main(String args[]){
      printStr print_str;
	print_str = new printStr();
		String[] words = new String[] {"Pune","Webonise","Jejurkar","lab","swapnil"};
		for(int i = 0 ; i < 5 ; i++)
    {
			if(words[i].length() >= 6)
      {
				System.out.println("\nWord is Bigger");
        print_str.printString(words[i]);
			}
			else
      {
				System.out.println("\nWord is Smaller");
        print_str.printString(words[i]);		
			}
		}	
	}
}

    • Java code saves in .java file, to compile a java code we use javac filename.java command on terminal.
    • JVM creates bytecode of java program, bytecode of a program stored in  .class file. 
    • JVM loads class file in to memory.
    • Class name in which main function is defined and file name should be the same, If class name and file name is different system will generate .class file in which 	main is defined. In our example class name is PrintSomething and file name is PrintSomething.java, so after complilation PrintSomething.class file will generate.
    • To compile java code we use command javac filename,java, 
      for Ex. javac PrintSomething.java
    • to execute java code we use,  java filename    for example, java PrintSomething


    • In our program we declare class named PrintSomething because our file name is PrintSomething too.
    • We declare a new class Printstr , class printStr
    • we defined new method printString.void printString(String str) it has return type as void.
      PrintString has argument string type .
    • Next line we have  public static void main(String args[]).	
      
    i. public = public is access modifier in java, in java main function is always public. So other program can able to access main function.
       	
    ii. Static = In java we call function by its object, but when program start execution for the first time there is no object. So main function should be static.
       	
    iii. void = In java it is mendatory to give return type to a function. So main has void return type.  Because after main executes completly there is no point in returning any value. If we change a return type of main it will give compilation error.

    iv. main =  main is entry function of java program and it is fixed. We cant change to anything other than main.
       
    v. String args[] = java accepts only String array argument. It is called as command line argument.
    •  In next line, 
      printStr string;
        ◦ here we create instance variable of class printStr.
    • string = new printStr();
        ◦ here we create  


    • Next line is, 
      String[] words = new String[] {"Pune","Webonise","Jejurkar","lab","swapnil"};

    i. declare string array with name words  and values  Pune, webonise, jejurkar, lab, swapnil.
    ii. String is type of variable, sqare brackets [] denotes that it is a arrayof string.
    iii. With  new  keyword we create array of object of type string. In curly braces values are provided from 0 index.





    • Next line is,
      for(int i = 0 ; i < 5 ; i++)
    i. for is control structure in java language. It is a loop which has three segements initialization, break condition, increment/decrement (post/pre).
    ii. In initialzation segement, value of index is assign, 
       In break condition, a condition of a loop for end.
       Increment, in loop execution should go forward, so in increment index value is increment or decrement by pre/post.
    iii. In our example index i  is start from 0 and break condition is i < 5 , and i is increment by 1
    • next line is 
      if(words[i].length() >= 6)
            1.  if statement is control structure of java, which checks whether condition is true or false.
            2. In above condition length of words[i]   is being checked with 6, where it is greater or equal to 6.
            3. words[i] means it checks index value of i in words array.
            4. length is String class function to calculate length of string. It is predefined function.
    • System.out.println("\nWord is Bigger");
        ◦ System is a final class from java.lang package.
        ◦ Out is static variable from printstream,
        ◦ println() is function to print the statements passed in brackets.


Memory Management in program-

Objects are stored in heap memory.
When we use new keyword , it means we create new object that object is stored in Heap memory.
For example, string = new printStr(); string 

Local methods , variables stored in stack, 
for example, int i, String str

