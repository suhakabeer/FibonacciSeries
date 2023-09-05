package com.canddella.utility;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
    	int ch;
    
    	do {
    		      
        System.out.print("Enter the first term (a) of the Fibonacci series: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second term (b) of the Fibonacci series: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third term (c) of the Fibonacci series: ");
        int c = scanner.nextInt();
        System.out.print("Enter the number of terms of the Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.print("Fibonacci Series: " + a + ", " + b + ", " + c);

     
        for (int i = 0; i < n; i++) { 
            int nextTerm =  b + c;
      
      System.out.print(", " + nextTerm);
            
            a = b;
            b = c;
            c = nextTerm;
        }

        System.out.println(); 
        System.out.println("Do you want to continue the update");	
        scanner.nextLine();
        ch = scanner.nextLine().charAt(0);
      } while (ch == 'y'|| ch == 'Y');	
    }
}

