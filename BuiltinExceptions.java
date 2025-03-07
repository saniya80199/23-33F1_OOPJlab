public class BuiltinExceptions
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
		try
		{
			int num=Integer.parseInt("abc");
			System.out.println("parsed number"+num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format exception caugth "+e.getMessage());
		}
		try
		{
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException  e)
		{
			System.out.println("null pointer exception caught "+e.getMessage());
		}
	
	}
}