import java.util.Scanner;
public class ExceptionHandlingExample
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter a number");
			int num=sc.nextInt();
			System.out.println("your entered number:"+num);
		}
		catch(Exception e)
		{
			System.err.println("error plz enter a valid integer");
		}
	}
}                                                             
