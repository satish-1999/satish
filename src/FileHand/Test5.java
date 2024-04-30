package FileHand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test5 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("D:\\File");
		String []s=f.list();
		for(int i=0;i<s.length;i++)
		{
			String s1=s[i];
			File f1=new File(s1);
			BufferedReader br=new BufferedReader(new FileReader(f1));
			System.out.println(s1);
		}
		
	}

}
