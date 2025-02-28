import java.util.Scanner;
public class Strbuff
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer("javaprogram!");
		System.out.println("enter your choice");
		System.out.println("1.delete a substring");
		System.out.println("2.delete or remove a character");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			//sb.delete(4,10);
			System.out.println("enter starting index");
			int start=sc.nextInt();	
			System.out.println("enter ending index");
			int end=sc.nextInt();
			if(start>=0&&end<=sb.length()-1&&start<end)
			{
				sb.delete(start,end);
				System.out.println("after deleting a substring:"+sb);
			}
			else
			{
			System.out.println("invalid");
			}
			//System.out.println("after deleting a substring:"+sb);
			break;
			case 2:
			//sb.deleteCharAt(sb.length()-1);
			System.out.println("enter index");
			int index=sc.nextInt();
			if(index==-1)
			{
				System.out.println("invalid");
			}
			else
			{
				sb.deleteCharAt(index);
			System.out.println("after deleting a character:"+sb);
			}
			break;
			default:
			System.out.println("invalid index");
			break;
		}
	}
}
			