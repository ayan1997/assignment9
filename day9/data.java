import java.util.Scanner;
import java.io.*;
public class data
{
	public static void main(String args[])
	{
		File f = new File("/home/ayan/Desktop/data.txt");
		try
		{
			FileOutputStream fout = new FileOutputStream(f);
			String s = " C:/Users/Test/video.mp4\nC:/Users/Test/video2.mp4\nC:/Users/Test/video4.mp4\nC:/Users/Test/video3.mp4";

			char ch[] = s.toCharArray();
			for(int i = 0; i < s.length(); i++)
			{
				fout.write(ch[i]);
			}
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(" "+e);
		}

		try
		{

			FileInputStream fin = new FileInputStream(f);
			Scanner inFile = new Scanner(fin);
			int i;
			while(inFile.hasNextLine())
			{
				System.out.println(inFile.nextLine());
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(" "+e);
		}
	}
}
