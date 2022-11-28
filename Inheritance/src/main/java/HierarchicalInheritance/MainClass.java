package HierarchicalInheritance;

public class MainClass 
{
	public static void main(String args[])
	{  
		Cat c = new Cat();  
		Dog d = new Dog();
		c.play();  
		d.swim();
		c.eat(); 
		d.eat();
	}
}
