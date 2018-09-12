import java.util.Scanner;
import java.io.*;
public class input
{
	public static void main(String args[])
	{
		File f = new File("/home/ayan/Desktop/data.txt");
		try
		{

			FileInputStream fin = new FileInputStream(f);
			Scanner inFile = new Scanner(fin);
			int i;

			while(inFile.hasNextLine())
			{
				System.out.println(inFile.nextCharAt());
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(" "+e);
		}
	}
}
