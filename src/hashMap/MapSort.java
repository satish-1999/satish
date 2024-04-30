package hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSort 
{
	public static void main(String[] args) {
		String s="attttbcajjjnhhcd";
		int n=s.length();
		Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(s.charAt(i)))
            {
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
            else
                mp.put(s.charAt(i), 1);
        }
        System.out.println(mp);

        List<Map.Entry<Character, Integer>> list=new ArrayList<>();
        for(Map.Entry<Character, Integer> entry: mp.entrySet())
        {
            list.add(entry);
        }
        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() {
            public int compare(Map.Entry<Character,Integer> o1,
             Map.Entry<Character,Integer> o2)
            {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(list);
        String ans="";
         for(Map.Entry<Character, Integer> entry: list)
        {
            ans=ans+entry.getKey();
        }
        System.out.println(ans);
	}
}
