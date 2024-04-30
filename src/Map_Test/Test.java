package Map_Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class Test 
{
    public static void main(String[] args) {
    	String str="NAREN1223SCH244";

    	Map<Character, Integer> mp=new HashMap<>();
    	for(int i=0;i<str.length();i++)
    	{
    		char ch=str.charAt(i);
    		if(mp.containsKey(ch))
    		{
    			mp.put(ch, mp.get(ch)+1);
    		}
    		else
    		{
    			mp.put(ch, 1);
    		}
    		
    		System.out.println(mp);
    		//mp.put(ch, mp.getOrDefault(ch,0)+1);
    	}
    	System.out.println(mp);
    	Set st=mp.entrySet();
    	Iterator itr=st.iterator();
    	while(itr.hasNext())
    	{
    		Map.Entry m=(Map.Entry)itr.next();
    		char i=(char)m.getKey();
    		System.out.println(i+"--->"+ m.getValue());
    	}
	}

}
