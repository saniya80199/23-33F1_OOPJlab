class Bank
{
	double getinterest()
	{
		return 0.0;
	}
}
class Sbi extends Bank
{
	double getinterest()
	{
		return 2.0;
	}
}
class Hdfc extends Bank
{
	double getinterest()
	{
		return 3.5;
	}
}
class Icici extends Bank
{
	double getinterest()
	{
		return 5.5;
	}
}
public class Runtimepoly
{
	public static void main(String[] args)
	{
		Bank bank=new Bank();
		System.out.println("bank interest"+bank.getinterest());
		bank=new Sbi();
		System.out.println("sbi bank interest:"+bank.getinterest());
		bank=new Hdfc();
		System.out.println("hdfc bank interest:"+bank.getinterest());
		bank=new Icici();
		System.out.println("icici bank interest:"+bank.getinterest());
	}
}