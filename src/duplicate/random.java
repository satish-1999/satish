package duplicate;

import java.util.Random;
import java.util.Scanner;

public class random 
{
	public static void main(String[] args) {
		Random rn = new Random();
		int answer = rn.nextInt(100) + 1;
		int num=-1;
		int count=0;
		while(num!=answer)
		{
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			if(num>100)
			{
				System.out.println("Entered number is out of scope , Enter number between 1 to 100");
				continue;
			}
			if(num==answer)
			{
				
				System.out.println("Match found in"+ count +" iteration");
				break;
			}
			else if(num<answer)
			{
				System.out.println("Enter greater number");
			}
			else
			{
				System.out.println("Enter lesser number");
			}
			count++;
		}
		
	}

}
