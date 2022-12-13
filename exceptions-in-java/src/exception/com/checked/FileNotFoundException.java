package exception.com.checked;
import java.io.File;
import java.io.FileReader;

public class FileNotFoundException 
{
	static class File_notFound_Demo {

		public static void main(String args[]) {
			try {

				File file1 = new File("E://myfile.txt");
				FileReader fr = new FileReader(file1);
			} 
			catch (Exception e)
			{
				System.out.println(e);
				System.out.println("File not exist");
			
			}
		}
	}
}
