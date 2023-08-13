package org.tnsif.singledimentionalarray;
//program to demonstrate Array is maximum

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of array element");
		int n=s.nextInt();
		//Array Declaration
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			System.out.println(("Array Elements are"));
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+"");
		}
		int max=arr[0];
		for(int i=0;i<n;i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			
		}
		System.out.println("Largest element is :"+max);
		Arrays.sort(arr);
		System.out.println("Sorted Elements are:");
		for(int i:arr)
		{
			System.out.println(i+"");
		}
		
	}

}
