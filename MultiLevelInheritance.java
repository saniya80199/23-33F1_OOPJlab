class Animal
{
	String name;
	Animal(String name)
	{
		this.name=name;
	}
	void eat()
	{
		System.out.println(name+" eats food");
	}
}
class Mammal extends Animal
{
	int legs;
	Mammal(String name,int legs)		
	{
		super(name);
		this.legs=legs;
	}
	void walk()
	{
		System.out.println(name+"  has "+legs+" legs");
	}
}
class Dog extends Mammal
{
	String breed;
	Dog(String name,int legs,String breed)
	{
		super(name,legs);
		this.breed=breed;
	}
	void bark()
	{
		System.out.println(name+" of breed "+breed+" breed");
	}
}
public class MultiLevelInheritance
{
	public static void main(String[] args)
	{
		Dog myDog=new Dog("buddy",4,"labrador");
		myDog.eat();
		myDog.walk();
		myDog.bark();
	}
}
	
		