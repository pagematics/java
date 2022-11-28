package HybridInheritance;

public class MainClass
{
	public static void main(String[] args) 
	{
		// Son object
		Son s = new Son();
		s.land();
		s.Vehicle();
		s.home();
		s.computer();

		// Daughter object
		Daughter d = new Daughter();
		d.land();
		d.Vehicle(); 
		d.home();
		d.mobile();
	}
}




