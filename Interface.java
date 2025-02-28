interface Interface1
{
	void method1();
}
interface Interface2
{
	void method2();
}
class MultipleIn implements Interface1,Interface2
{
	public void method1()
	{
		System.out.println("method from the interface1 is called");
	}
	public void method2()
	{
		System.out.println("method from the interface2 is called");
	}
	void method3()
	{
		System.out.println("method from the class that impplements two interfaces");
	}
}
public class Interface
{
	public static void main(String[] args)
	{
		Interface1 obj1=new MultipleIn();
		obj1.method1();
		Interface2 obj2=new MultipleIn();
		obj2.method2();
		MultipleIn obj3=new MultipleIn();
		obj3.method3();
		
	}
}