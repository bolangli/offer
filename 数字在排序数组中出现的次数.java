package 剑指offer;

import java.util.HashMap;

public class 数字在排序数组中出现的次数 {
	
	public int GetNumberOfK(int[] array,int k)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(map.containsKey(array[i]))
			{
				map.put(array[i], map.get(array[i])+1);
			}else
				map.put(array[i], 1);
		}
		if(map.containsKey(k))
		{
			return map.get(k);
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		数字在排序数组中出现的次数 n = new 数字在排序数组中出现的次数();
		int[] array = {1,2,3,3,3,3,4,5};
		System.out.println(n.GetNumberOfK(array, 2));
	}

}
