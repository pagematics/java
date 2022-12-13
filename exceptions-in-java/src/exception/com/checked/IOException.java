package exception.com.checked;
import java.io.File;
import java.io.FileInputStream;
import java.lang.Exception;

public class IOException 
{
	public FileInputStream testMethod1(){
	File myfile = new File("mytest.txt");
	FileInputStream fileInputStream = null;
	try
	{
		fileInputStream = new FileInputStream(myfile);
		fileInputStream.read();
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	finally{
	try
	{
		if (fileInputStream != null){
		fileInputStream.close();
	}
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	}
	return fileInputStream;
	}
	public static void main(String[] args)
	{
		IOException instance11 = new IOException();
		instance11.testMethod1();
	}
}
