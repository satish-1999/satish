package FileHand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public static void main(String args[]) throws IOException
	{
		File f=new File("D:\\abc.txt");
		f.createNewFile();
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write(100);
		bw.newLine();
		bw.write("Satish");
		bw.flush();
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("D:\\abc.txt"));
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		
	}
}
