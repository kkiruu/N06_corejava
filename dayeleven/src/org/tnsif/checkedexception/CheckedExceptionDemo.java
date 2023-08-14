//program to demonstrate on checked Exception

package org.tnsif.checkedexception;
import java.io.FileInputStream;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
		FileInputStream f= new FileInputStream("C:\\Users\\dell\\OneDrive\\Documents\\pharmacyon.txt\"");
		System.out.println("file is Exist!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
		}

	}

}
