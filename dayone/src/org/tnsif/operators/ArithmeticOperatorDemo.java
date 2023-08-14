package org.tnsif.operators;
import java.util.Scanner;
//program to demonstrate on arithmetic operators
public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("Addition:");
		System.out.println(num1+num2);
		System.out.println("Subtraction:");
		System.out.println( num1-num2);
		System.out.println("Multiplication");
		System.out.println(num1*num2);
		System.out.println("Division");
		System.out.println( num1/num2);
		System.out.println("Mod");
		System.out.println(num1%num2);
	

	}

}
