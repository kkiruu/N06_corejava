package org.tnsif.customexception;

import java.util.Scanner;

public class CustomeExceptionExecutor {
	

	public static void main(String[] args) {
		System.out.println("enter userid: & password:");
		Scanner s=new Scanner(System.in);
		String userid=s.nextLine();
		String password=s.nextLine();
		
		try
		{
			
			if(userid.equals("kiran@gmail.com")&&
			password.equals("pass@123"))
			{
				System.out.println("credentials are matched!!!");
			}else
			{
				throw new LoginCredentials("Invalid Credentials!!");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception handelled:"+e);
		}

	}

}
