package ��ָoffer;

import java.util.ArrayList;
import java.util.HashMap;

public class �ַ����е�һ�����ظ����ַ� {
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
		�ַ����е�һ�����ظ����ַ� n = new �ַ����е�һ�����ظ����ַ�();
		n.Insert('g');
		n.Insert('o');
		n.Insert('o');
		n.Insert('g');
		n.Insert('l');
		n.Insert('l');
		System.out.println(n.FirstAppearingOnce());
	}

}
