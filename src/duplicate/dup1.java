package duplicate;

public class dup1 
{	
	public static void main(String args[])
	{
		
	}

}

//
//List<Integer> list=new ArrayList<>();
//list.add(2);
//list.add(2);
//list.add(4);
//list.add(5);
//list.add(21);
//list.add(7);
//list.add(8);
//list.add(3);
//list.add(3);
//list.add(42);
//
//Set<Integer> st=new HashSet<>();
//for(int i=0;i<list.size();i++)
//{
//	st.add(list.get(i));
//}
//System.out.println(st);
//
//Set<Integer> st2=list.stream().filter(x->Collections.frequency(list, x)>1).collect(Collectors.toSet());
//System.out.println(st2);
//
//int sum=list.stream().reduce(0,(e1,e2)->e1+e2);
//System.out.println(sum);