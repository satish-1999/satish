package FileHand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test3 
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("D:\\file1.txt");
		File f2=new File("D:\\file2.txt");
		f1.createNewFile();
		f2.createNewFile();
		PrintWriter pw=new PrintWriter(f1);
		pw.println(100);
		pw.println(200);
		pw.println(300);
		pw.flush();
		pw.close();
		
		PrintWriter pw1=new PrintWriter(f2);
		pw1.println(400);
		pw1.println(500);
		pw1.println(600);
		pw1.flush();
		pw1.close();
		
		PrintWriter pw2=new PrintWriter("D:\\file3.txt");
		BufferedReader br=new BufferedReader(new FileReader(f1));
		String line1= br.readLine();
		while(line1!=null)
		{
			pw2.println(line1);
			line1=br.readLine();
		}
		
		br=new BufferedReader(new FileReader(f2));
		String line2= br.readLine();
		while(line2!=null)
		{
			pw2.println(line2);
			line2=br.readLine();
		}
		pw2.flush();
		br.close();
		
		pw2.close();
	}
}
