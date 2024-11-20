/*Data Type
 * 
 * 1. byte - 1byte
 * 2. short - 2byte
 * 3. int - 4byte
 * 4. long - 8byte
 * 5. float - 4byte
 * 6. double - 8byte
 * 7. char - 1byte
 * 8. boolean - true/false
 * 
 * ASCII : American Standard Code For Information Interchange
 * 
 * A-Z : 65 to 90
 * a-z : 97 to 122
 * 
 * */


package com.core;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition : "+c);
		c=a-b;
		System.out.println("Subtraction : "+c);
		c=a*b;
		System.out.println("Multiplication : "+c);
		c=a/b;
		System.out.println("Division : "+c);
	}
}
