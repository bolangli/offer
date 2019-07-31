package 剑指offer;

import java.util.ArrayList;
import java.util.HashMap;

public class 字符流中第一个不重复的字符 {
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	ArrayList<Character> list = new ArrayList<Character>();
	public void Insert(char ch)
	{
		if(map.containsKey(ch))
		{
			map.put(ch, map.get(ch)+1);
		}else
			map.put(ch, 1);
		list.add(ch);
	}
	
	public char FirstAppearingOnce()
	{
		for(Character c:list)
		{
			if(map.get(c)==1)
			{
				return c;
			}
		}
		return '#';
	}
	
	public static void main(String[] args)
	{
		字符流中第一个不重复的字符 n = new 字符流中第一个不重复的字符();
		n.Insert('g');
		n.Insert('o');
		n.Insert('o');
		n.Insert('g');
		n.Insert('l');
		n.Insert('l');
		System.out.println(n.FirstAppearingOnce());
	}

}
