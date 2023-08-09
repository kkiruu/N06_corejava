package orgg.tnsif.unchkedexception;
//program to Demonstrate throws keyword
public class CodeFor {
	static void isEligible(int age,int Weight) throws ArithmeticException {
		if(age>18&& Weight>50) 
		{
			System.out.println("person is eligible to donate the blood");
		}
		else
			//throws keyword is used to throw an exception explicitly
			throw new ArithmeticException("Criteria is not Satisfied");
		
	}

	public static void main(String[] args)throws ArithmeticException{
				isEligible(13,55);
		

	}


	
}
