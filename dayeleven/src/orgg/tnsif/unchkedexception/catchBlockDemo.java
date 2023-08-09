package orgg.tnsif.unchkedexception;
//program to demonstrate on catch block with multiple Exception class
public class catchBlockDemo {
	static void print (int arr[])
	{
		try {
			System.out.println(arr[3]);
		}
		//we can use multiple catch block in program
		catch(ArrayIndexOutOfBoundsException |NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Exception handelled:"+e);
		}
		/*catch(NullPointerException e) {
			System.out.println(e);
		}
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {12,3,14};
		print(arr1);
		}

	

}
