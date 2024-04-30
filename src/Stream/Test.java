package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<>();
		int i=1;
		for(i=1;i<=10;i++)
		{
			l1.add(i);
		}
		
		int sum=l1.stream().reduce(0, (a,b)->a+b);
		int min=l1.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(min);
		System.out.println("---------sum of all nos-------------"); 
		l1.stream().map(j->j*2).forEach(System.out::println);
		
		List l2=l1.stream().map(j->j*5).collect(Collectors.toList());
		l2.stream().forEach(System.out::println);
		
		List l3=l1.stream().filter(n->n%2==0).collect(Collectors.toList());
		l3.stream().forEach(s->System.out.println(s));
		
		long count=l1.stream().filter(n->n%2==0).count();
		System.out.println(count);
		System.out.println("-----------------");
		 
		List l4=l1.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		l4.stream().forEach(s->System.out.println(s));
		System.out.println("-----------------");
		
		
		List<String> sl=new ArrayList<>();
		sl.add("Satish");
		sl.add("Chandra");
		sl.add("Hi");
		sl.add("Munna");
		sl.add("Hum");
		sl.add("Bihar");
		sl.add("Se");
		sl.add("Hai");
		
		List<String> sl1=sl.stream().filter(s->s.length()>=3).collect(Collectors.toList());
		sl1.stream().forEach(s->System.out.println(s));
		
		System.out.println("------------------------");
		
		List<Integer> st=sl.stream().map(s->s.length()).collect(Collectors.toList());
		st.stream().forEach(s->System.out.println(s));
		
		System.out.println("------------------------");
		
		long c=sl.stream().filter(s->s.length()>=3).count();
		System.out.println(c);
		System.out.println("------------------------");
		
		List<String> sl2=sl.stream().sorted().collect(Collectors.toList());
		sl2.stream().forEach(s->System.out.println(s));
		System.out.println("------------------------");
		
		
		List<String> sl3=sl.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		sl3.stream().forEach(s->System.out.println(s));
		System.out.println("------------------------");
		
		
		int arr[]=new int[10];
		for(i=0;i<10;i++) {
			arr[i]=i;
		}
		List l5=Arrays.asList(arr);
		List<Integer> out=Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List l6=out.stream().map(j->j*8).collect(Collectors.toList());
		l6.stream().forEach(System.out::println);
		System.out.println("------------dh------------");
		
		Integer arr1[]=new Integer[10];
		for(i=0;i<10;i++) {
			arr1[i]=i;
		}
		List<Integer> l8=Arrays.asList(arr1);
		List l9=l8.stream().map(j->j*3).collect(Collectors.toList());
		l9.stream().forEach(System.out::println);
		System.out.println("------------------------");
	}
}
