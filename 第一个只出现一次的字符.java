package ��ָoffer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ��һ��ֻ����һ�ε��ַ� {
	
	public int FirstNotRepeatingChar(String str)
	{
		if(str==null)
		{
			return -1;
		}
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(map.containsKey(c))
			{
				map.replace(c, map.get(c)+1);
			}else
				map.put(c, 1);
		}
		/*Iterator it = map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry entry = (Map.Entry)it.next();
			Character c = (Character)entry.getKey();
			Integer i = (Integer)entry.getValue();
			if(i==1)
			{
				
			}
		}*/
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(map.get(c)==1)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		��һ��ֻ����һ�ε��ַ� n = new ��һ��ֻ����һ�ε��ַ�();
		String str ="ababaacddde";
		System.out.println(n.FirstNotRepeatingChar(str));
	}

}
