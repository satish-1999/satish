package StringsProg;

 final class Tester 
{
	private int i;
	Tester(int i){
		this.i=i;
	}
	public Tester modify(int i)
	{
		if(this.i==i)
			return this;
		else
			return new Tester( i);
		
	}
}

public class Immutables
{
	public static void main(String[] args) {
		Tester t1=new Tester(10);
		Tester t2=t1.modify(100);
		Tester t3=t1.modify(10);
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
	}
}