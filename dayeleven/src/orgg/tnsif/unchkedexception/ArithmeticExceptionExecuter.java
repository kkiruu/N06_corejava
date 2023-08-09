package orgg.tnsif.unchkedexception;

import java.util.Scanner;

public class ArithmeticExceptionExecuter {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			int y=s.nextInt();
			try {
				System.out.println(x/y);
				
			}
			catch(Exception e)
			{
				System.out.println("Exception Handelled:"+e);
			}
	}

}
