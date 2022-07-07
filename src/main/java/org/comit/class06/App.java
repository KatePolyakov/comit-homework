package org.comit.class06;

import java.util.Scanner;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;

/**
 * Homework from class 6
 *
 */
public class App 
{
    public static void main( String[] args )
    {
////    	16 - Write a program in Java that reads an integer from the keyboard and makes the sum of the next 100 numbers, 
////    	showing the result on screen.
//    	System.out.println("//16 - Write a program in Java that reads an integer from the keyboard and makes the sum of the next 100 numbers, \r\n"
//    			+ "//    	showing the result on screen.\n");
//    	
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Please enter a number: ");
//    	int num = input.nextInt();
//    	int acc = 0;
//    	
//    	for (int i=num; i<=num+100; i++) {
//    		acc = acc + i;
//    	}
//    	System.out.print(acc + " ");
//    	
//    	//input.close();
//    	
// 	
////    	17 - Write a program in Java that converts from Canadian dollars to US dollars. 
////		You will receive a decimal number corresponding to the amount in CAD and will answer with the corresponding amount in US dollars.
////    	Take the quotation of the dollar today.
//    	System.out.println("\n\n//17 - Write a program in Java that converts from Canadian dollars to US dollars. \r\n"
//    			+ "//		You will receive a decimal number corresponding to the amount in CAD and will answer with the corresponding amount in US dollars.\r\n"
//    			+ "//    	Take the quotation of the dollar today.\n");
//    	
//    	//Scanner input = new Scanner(System.in);
//    	
//    	System.out.print("Please enter amount for convert: CAD $");
//    	double amountCad = input.nextDouble();
//    	double usd = 0.77;
//    	LocalDateTime date = LocalDateTime.now();
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");  
//        
//        String formattedDate = date.format(myFormatObj);  
//    	System.out.println("The CROSS-course for today " +formattedDate + " is: USA $1 = CAD $" + usd);
//    	System.out.println("Your convertible amount is: USA $" + (amountCad*usd));
//    	
//    	//input.close();
//
////    18 - Write a program in Java that reads two numbers on the keyboard and says which is the largest and which is the smallest.
    	
//    	System.out.println("\n//18 - Write a program in Java that reads two numbers on the keyboard and says which is the largest and which is the smallest.\n");
//    	
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Please enter the first number: ");
//    	double first = input.nextDouble();
//    	System.out.print("Please enter the second number: ");
//    	double second = input.nextDouble();
//    	
//    	if (first > second) {
//    		System.out.println(first + " is the largest\n" + second + " is the smallest.");
//    	} else if (first < second) {
//    		System.out.println(second + " is the largest\n" + first + " is the smallest.");
//    	} else {
//    		System.out.println("The numbers " + first + " and " + second + " are equals.");
//    	}
//    	
//    	input.close();
//    	
	
//    	19 - Write a Java program that does the following: declare a variable N of type int, a variable A of type double and a variable 
//    	C of type char and assign to each one a value. The following screen displays:
//    	The value of each variable. The sum of N + A. And A - N
//    	System.out.println("\n//19 - Write a Java program that does the following: declare a variable N of type int, a variable A of type double and a variable \r\n"
//    			+ "//    	C of type char and assign to each one a value. The following screen displays:\r\n"
//    			+ "//    	The value of each variable. The sum of N + A. And A - N\n");
//    	
//    	int N = 1;
//    	double A = 1;
//    	char C = 1;
//    	
//    	System.out.print("The value of each variable. The sum of N + A = " + (N+A) + ". And A - N = " + (A-N) +".");
    	
//    	20 - Write a java program that declares an integer variable B and assigns it a value. It then displays a message indicating 
//    	whether the value of B is positive or negative. We will consider 0 as positive.
//    	If for example B = 1 the output will be 1 is positive. If for example B = -1 the output will be: -1 is negative.
    	
//    	System.out.println("\n//20 - Write a java program that declares an integer variable B and assigns it a value. It then displays a message indicating \r\n"
//    			+ "//    	whether the value of B is positive or negative. We will consider 0 as positive.\r\n"
//    			+ "//    	If for example B = 1 the output will be 1 is positive. If for example B = -1 the output will be: -1 is negative.\n");
//    	
//    	
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Please enter a number: ");
//    	int B = input.nextInt();
//    	
//    	if (B>=0) {
//    		System.out.println("\n" + B + " is positive");
//    	} else {
//    		System.out.println("\n" + B + " is negative");
//    	}
//    	
//    	input.close();
    	 	
//    	21 - Make a program in JAVA such that given as data the enrollment and 5 grades of a student; Print the enrollment, 
//    	the average and the word "approved" if the student has an average greater than or equal to 6, and the word "not approved"
//    	otherwise. Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: MAT is an integer variable that represents the student's enrollment. 
//    	CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables representing the student's 5 grades.
//    	System.out.println("\n//21 - Make a program in JAVA such that given as data the enrollment and 5 grades of a student; Print the enrollment, \r\n"
//    			+ "//    	the average and the word \"approved\" if the student has an average greater than or equal to 6, and the word \"not approved\"\r\n"
//    			+ "//    	otherwise. Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: MAT is an integer variable that represents the student's enrollment. \r\n"
//    			+ "//    	CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables representing the student's 5 grades.\n");
//    	
//    	String studentName = "Anna A.";
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("\nPlease enter grade 1: ");
//    	int CAL1 = input.nextInt();
//    	System.out.print("Please enter grade 2: ");
//    	int CAL2 = input.nextInt();
//    	System.out.print("Please enter grade 3: ");
//    	int CAL3 = input.nextInt();
//    	System.out.print("Please enter grade 4: ");
//    	int CAL4 = input.nextInt();
//    	System.out.print("Please enter grade 5: ");
//    	int CAL5 = input.nextInt();
//    	
//    	double Ave = (CAL1+CAL2+CAL3+CAL4+CAL5)/5;
//    	String MAT;
//    	
//    	
//    	if (Ave >=6 ) {
//    		MAT="approved"; 
//    	} else {
//    		MAT = "not approved";
//    	}
//    	
//    	System.out.print("\n===========================\nStudent name: " + studentName + "\nGrades:\n\tGrade 1: " + CAL1 + "\n\tGrade 2: " + CAL2 + "\n\tGrade 3: " + CAL3 + "\n\tGrade 4: " + CAL4+ "\n\tGrade 5: " + CAL5 + "\n===========================\nAverage grade: " + Ave + "\nStudent " + MAT + " to the next course.");
//    	
//    	input.close();
    	
//    	22 - Make the program in JAVA such that given as a worker's salary, apply a 15% increase if your salary is less than 
//    	$ 1000 and 12% otherwise. Print the new salary of the worker. Fact: SUE (variable of a real type that represents the salary of the worker).
//    	System.out.println("\n//22 - Make the program in JAVA such that given as a worker's salary, apply a 15% increase if your salary is less than \r\n"
//    			+ "//    	$ 1000 and 12% otherwise. Print the new salary of the worker. Fact: SUE (variable of a real type that represents the salary of the worker).\n");
//    	
//    	String workerName = "Anna A.";
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("\nPlease enter salary wage: ");
//    	double wage = input.nextDouble();
//    	double add = (wage<=1000) ? (wage*.15) : (wage*.12);
//    	System.out.print("\n===========================\nWorker name: " + workerName + "\n===========================\n\tSalary wage: $" + wage + "\n\tIncrease:     $" + add + "\n===========================\nTotal:\t\t     $" + (wage+add));
//    	
//    	input.close();  	
    	
//    	23 - Make a program that prints the 10 multiplication tables.
//    	System.out.println("\n//23 - Make a program that prints the 10 multiplication tables.\n");
//        int n = 10;
//        int l = 10;
//        for (int i = 1; i < n + 1; i++) {
//            for (int k = 1; k < l + 1; k++) {
//                System.out.printf("%5d", (k * i));}
//            System.out.println("");
//        }
   	
//    	24 - Make a calculator.
//    	System.out.println("\n//24 - Make a calculator.");
//    	double num1, num2, res;
//    	
//    	
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("Enter first integer: ");
//    	num1 = input.nextDouble();
//    	System.out.print("Enter operator: ");
//    	Scanner sc = new Scanner(System.in);
//    	char oper = sc.next().charAt(0);
//    	System.out.print("Enter secont integer: ");
//    	num2 = input.nextDouble();
//    	
//    	switch (oper) {
//    	case '+': res=num1+num2;
//    		break;
//    	case '-': res=num1-num2;
//    		break;
//    	case '*': res=num1*num2;
//    		break;
//    	case '/': res=num1/num2;
//    		break;
//    	default:
//    		System.out.println("ERROR!");
//    	return;
//
//    	}
//    	System.out.print("The result of operation: " + num1 + " " + oper + " " + num2 + " = " + res );
//    	
//    	input.close();
//    	sc.close();
    	
//    	25 - Calculate the salary increase for a group of employees of a company considering the following criteria: 
//    	If the salary is less than $ 1,000.00: Increase 15% If the salary is greater than or equal to $ 1,000.00: Increase 12% 
//    	The program must do The following: - Save the new salaries in the arrangement - Calculate the payroll - 
//    	Print the salaries from the settlement
    	System.out.println("\n//25 - Calculate the salary increase for a group of employees of a company considering the following criteria: \r\n"
    			+ "//    	If the salary is less than $ 1,000.00: Increase 15% If the salary is greater than or equal to $ 1,000.00: Increase 12% \r\n"
    			+ "//    	The program must do The following: - Save the new salaries in the arrangement - Calculate the payroll - \r\n"
    			+ "//    	Print the salaries from the settlement");
    	
    	int [] employees = {1000, 750, 566, 2500, 850, 125};
    	int extra; 
    	
        
    }
    
    


}
