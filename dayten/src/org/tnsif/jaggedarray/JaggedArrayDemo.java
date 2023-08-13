package org.tnsif.jaggedarray;

import java.util.Scanner;

//program to demonstrate on a jagged array
public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//declaration of a jagged array
		int arr[][]=new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the Element:");
				arr[i][j]=s.nextInt();
				
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print( arr[i][j]+"  ");
				
			}
			System.out.println();
		}
		
		
		

	}

}
