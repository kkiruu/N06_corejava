package orgg.tnsif.unchkedexception;

public class ArrayBoundExceptionExecuter {
	static void display(int arr[]) {
		
	
	
	try {
		System.out.println(arr[3]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception handelled"+e);
	}
	finally {
		System.out.println("Finally block is always Executed");
	}
	System.out.println("Any statement out of the block is always "+"Executed");

}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,6,88};
		display(arr);
		
		

}
	}
