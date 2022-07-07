package org.comit.class05;

/**
 * Homework from class 5
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	8 - Write a program in Java that prints the numbers 1 to 3 on the screen.
    	System.out.println("//8 - Write a program in Java that prints the numbers 1 to 3 on the screen.\n");
    	int a = 3;
    	int i;
    	for (i=1; i<=a; i++) {
    		System.out.print(i + " ");
    	}
    	
//    	9 - Write a program in Java that prints the numbers 1 to 9 on the screen.
    	System.out.println("\n\n//9 - Write a program in Java that prints the numbers 1 to 9 on the screen.\n");
    	int b = 9;
    	int z;
    	for (z=1; z<=b; z++) {
    		System.out.print(z + " ");
    	}
    	
//    	10 - Write a program in Java that prints on the screen the numbers from 1 to 10,000.
    	System.out.println("\n\n//10 - Write a program in Java that prints on the screen the numbers from 1 to 10,000.\n");
    	int c =10000;
    	int x;
    	for (x=1; x<=c; x++) {
    		System.out.print(x + " ");
    	}
    	
//    	11 - Write a program in Java that prints the numbers from 5 to 10 on the screen.
    	System.out.println("\n\n//11 - Write a program in Java that prints the numbers from 5 to 10 on the screen.\n");
    	
    	int d = 10;
    	int y;
    	for (y=5; y<=d; y++) {
    		System.out.print(y + " ");
    	}
    	
//    	12 - Write a program in Java that prints the numbers from 5 to 15 on the screen.
    	System.out.println("\n\n//12 - Write a program in Java that prints the numbers from 5 to 15 on the screen.\n");
    	
    	int e=15;
    	int w;
    	for (w=5; w<=e; w++) {
    		System.out.print(w + " ");
    	}
    	
//    	13 - Write a program in Java that prints on the screen the numbers from 5 to 15,000.
    	System.out.println("\n\n//13 - Write a program in Java that prints on the screen the numbers from 5 to 15,000.\n");
        
        int v = 5;
        while (v<=15000) {
        	System.out.print(v + " ");
        	v++;
        }
        
//    	14 - Write a program in Java that prints 200 times the word "hello". Note: in the source code that you write you must only enter once the word "hello".
    	System.out.println("\n\n//14 - Write a program in Java that prints 200 times the word \"hello\". Note: in the source code that you write you must only enter once the word \"hello\".\n");
    	
    	int h = 1;
    	while (h<=200) {
    		System.out.print(h+ "Hello ");
    		h++;
    	}
//    	15 - Exercise: Write a program in Java that prints the squares of the first 30 natural numbers on the screen.
    	System.out.println("\n\n//15 - Exercise: Write a program in Java that prints the squares of the first 30 natural numbers on the screen.\n");
    	
    	int n;
    	for (n=1;n<=30;n++)
    	{      
    		System.out.print(n*n + " ");
    		System.out.println(Math.pow(n, 2));
    	}
    }


}
