package Lambda;

interface TestInt{
	int add(int a, int b);
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInt t1=(a,b)->(a+b);
		System.out.println(t1.add(10, 20));
		  
		
		
		
		TestInt t2=(a,b)->{
			return a+b;
		};
		System.out.println(t2.add(90, 10));
	}
}

//class P{
//	public void m1()
//	{
//		System.out.println("p class");
//	}
//}
//class Test extends P{
//	public void m2()
//	{
//		System.out.println("q class");
//	}
//	public static void main(String[] args) {
//		Test t=new Test();
//		t.m1();
//		
//		P t1=new Test();
//		t1.m1();
//	}
//}

//interface interf{
//	default void m1() {
//		System.out.println("Interface default method");
//	}
//}
// class Test implements interf{
//	public void m2()
//	{ 
//		interf.super.m1();
//	}
//	 public static void main(String[] args) {
//		Test t=new Test();
//		t.m2();
//		//t.m1();
//	} 
// }
