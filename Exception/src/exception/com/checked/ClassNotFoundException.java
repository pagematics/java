package exception.com.checked;

public class ClassNotFoundException 
{
	public static class ClassNotFoundException_Demo
	{
		public static void main(String[] args) {
			try{
				Class.forName("MyClass"); // Class1 is not defined
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
