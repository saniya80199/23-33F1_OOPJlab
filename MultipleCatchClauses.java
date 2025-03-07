public class MultipleCatchClauses
{
	public static void main(String[] args)
	{
		try
		{
			int arr[]={2,0,3};
			int result=arr[0]/arr[1];
			System.out.println("result:"+result);
		}
		catch(ArithmeticException e)
		{	
			System.out.println("arithmeticExceotion caught"+e.getMessage());
		}
		try
		{ 
			int array[]={2,5,6};
			System.out.println(array[8]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of box "+e.getMessage());
		}
		finally
		{
			System.out.println("rest of code will execute");
		}
		
	}
}	