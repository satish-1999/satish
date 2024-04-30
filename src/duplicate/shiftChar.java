package duplicate;

public class shiftChar {
	
	public static void main(String[] args) {
		String s="zabcd fgi mno fgjkghf ghfgkfk fghfkgk fgfkfk ffkgkfgk fghffgddfst ftrdtrdtvhmvhkg fgfgdtdt";
		int l=2;
		String ans="";
		int t=13;
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isWhitespace(s.charAt(i)))
			{
				char ch=s.charAt(i);
				//ch=(char)(ch+l);
				int p=ch-'a';
				p+=l*t;
				p=p%26;
				p=p+97;
				char ch1=(char)p;
				ans=ans+ch1;
				//t++;
			}
			else
			{
				ans+=" ";
			}
		}
		System.out.println(ans);
		
		System.out.println((int)'z');
	}
}
