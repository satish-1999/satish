package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test 
{
	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("a+");
		Matcher m=p.matcher("abababababaaaabbabjsaabba");
		int c=0;
		while(m.find())
		{
			c++;
			System.out.println(m.start()+" "+ m.end()+ " "+ m.group());
		}
		
	}

}
