package orgg.tnsif.unchkedexception;

public class throwAndThrowsKeywordDemo {
	static void isEligible(int age,int Weight) {
		if(age>18&& Weight>50) 
		{
			System.out.println("person is eligible to donate the blood");
		}
		else
			//throws keyword is used to throw an exception explicitly
			throw new ArithmeticException("Criteria is not Satisfied");
		
	}

	public static void main(String[] args) {
		try {
		isEligible(13,55);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
