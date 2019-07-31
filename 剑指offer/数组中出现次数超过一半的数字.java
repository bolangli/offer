package 剑指offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class 数组中出现次数超过一半的数字 {
	
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
		数组中出现次数超过一半的数字 n = new 数组中出现次数超过一半的数字();
		int[] array = {1,2,3,2,2,2,5,4,2};
		System.out.println(n.MoreThanHalfNum_Solution(array));
	}

}
