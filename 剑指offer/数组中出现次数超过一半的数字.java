package ��ָoffer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class �����г��ִ�������һ������� {
	
	public int MoreThanHalfNum_Solution(int[] array)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(!map.containsKey(array[i]))
			{
				map.put(array[i], 1);
			}else
			{
				map.replace(array[i], map.get(array[i])+1);
			}
		}
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry entry = (Map.Entry)iter.next();
			Integer key = (Integer)entry.getKey();
			Integer value = (Integer)entry.getValue();
			if(value>array.length/2)
			{
				return key;
			}
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		�����г��ִ�������һ������� n = new �����г��ִ�������һ�������();
		int[] array = {1,2,3,2,2,2,5,4,2};
		System.out.println(n.MoreThanHalfNum_Solution(array));
	}

}
