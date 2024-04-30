package FileHand;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test1 
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("D:\\abc.txt");
		f.createNewFile();
		PrintWriter pw=new PrintWriter("D:\\abc.txt");
		pw.write(100);
		pw.write("Satish");
		pw.println();
		pw.write("Chandra");
		pw.println(200);
		pw.println(400);
		pw.flush();
		pw.close();
		
		
	}

}
