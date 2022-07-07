package org.comit.class04;

/**
 * Homework from class 4
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	1 - Write a program in Java that prints the phrase "Hi, I already print sentences."
    	System.out.println("//1 - Write a program in Java that prints the phrase \"Hi, I already print sentences.\"\n");
    	String str = "Hi, I already print sentences.";
    	System.out.println(str);
    	
    	System.out.println("Hi, I already print sentences.\n");
    	
//    	2 - Write a program in Java that prints an int number, for example, 273 or 597.
    	System.out.println("//2 - Write a program in Java that prints an int number, for example, 273 or 597.\n");
    	int a = 273;
    	int b = 597;
    	
    	System.out.printf("%d and %d%n%n", a, b);
    	
    	
//    	3 - Write a program in Java that prints a float number, for example, the 5.3 or the 7.5.
    	System.out.println("//3 - Write a program in Java that prints a float number, for example, the 5.3 or the 7.5.\n");
    	double c = 5.3;
    	double d = 7.5;
    	
    	System.out.println(c + " and " + d);
    	
//    	4 - Write a program in Java that prints on the screen the sum of 1234 and 532.
    	System.out.println("\n//4 - Write a program in Java that prints on the screen the sum of 1234 and 532.\n");
    	int e = 1234;
    	int f = 532;
    	int sum = e+f;
    	System.out.printf("%d + %d = %d\n\n", e, f, sum);
    	
//    	5 - Write a program in Java that prints the subtraction of 1234 and 532.
    	System.out.println("//5 - Write a program in Java that prints the subtraction of 1234 and 532.\n");
    	
    	int g = 1234;
    	int h = 532;
    	int sub = g-h;
    	System.out.printf("%d - %d = %d\n\n", g, h, sub);
    	
//    	6 - Write a program in Java that prints the multiplication of 1234 and 532 on the screen.
    	System.out.println("//6 - Write a program in Java that prints the multiplication of 1234 and 532 on the screen.\n");
    	
    	int i = 1234;
    	int j = 532;
    	int mult = i*j;
    	System.out.printf("%d * %d = %d\n\n", i, j, mult);
//    	7 - Write a program in Java that prints the division of 1234 between 532.
    	System.out.println("//7 - Write a program in Java that prints the division of 1234 between 532.\n");
    	
    	int k = 1234;
    	int l = 532;
    	double div = i/j;
    	System.out.printf("%d / %d = %.1f\n\n", k, l, div);
    }
}
