package list;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) 
	{
        ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
 
        x.add(new ArrayList<Integer>());
        x.get(0).add(0, 3);
//        x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
//        x.get(1).add(0, 366);
//        x.get(1).add(4, 576);
//        x.add(2, new ArrayList<>(Arrays.asList(3, 84)));
//        x.add(new ArrayList<Integer>(Arrays.asList(83, 6684, 776)));
//        x.add(new ArrayList<>(Arrays.asList(8)));
//        x.get(4).addAll(Arrays.asList(9, 10, 11));
//        x.get(1).addAll(3, Arrays.asList(22, 1000));
        System.out.println(x);
        System.out.println(x.size()+" "+ x.get(0).size());
        for(int i=0;i<x.size();i++)
        {
        	for(int j=0;j<x.get(i).size();j++)
        	{
        		
        	}
        }
	}
}
