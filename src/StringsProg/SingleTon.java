package StringsProg;

 class Test 
{
	private static Test t=null;
	private Test() {}
	
	public static Test getsingleTon()
	{
		if(t==null)
		{
			t=new Test();
		}
		return t;
	}
}

public  class SingleTon
{
	public static void main(String[] args) {
		System.out.println(Test.getsingleTon().hashCode());
		System.out.println(Test.getsingleTon().hashCode());
		System.out.println(Test.getsingleTon().hashCode());
	}
}