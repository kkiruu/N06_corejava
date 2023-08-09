package orgg.tnsif.unchkedexception;
//program to demonstrate finally block

public class FinallyBlockNotExecutedExecutor {
	static void display(int arr[]) {
		
		
		
		try {
			System.out.println(arr[2]);
			//System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handelled"+e);
			/* if try and catch block contain system.exio(0);
			 * after the exception code line ,then finally block 
			 * does not execute */
			//System.exit(0);
		}
		finally {
			/* when finally block contain an exception code ,then
			 * finally block does not execute 
			 */
			System.out.println(13/0);
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
