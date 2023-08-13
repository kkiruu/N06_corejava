package org.tnsif.multidimentionalarray;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			//2D array declaration
			int arr[][]=new int[3][2];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<2;j++) {
					System.out.println("Enter the elements:");
					arr[i][j]=sc.nextInt();
					
				}
			}
			//printing an array elements
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<2;j++) {
					System.out.print(arr[i][j]+" ");
					
				}
				System.out.println();
			}
	
	}

}
