package ��ָoffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class �������ڵ����ֵ {
	
	public ArrayList<Integer> maxInWindows(int[] num,int size)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(num.length==0||size<=0||num.length<size)
		{
			return list;
		}
		LinkedList<Integer> max = new LinkedList<>();
		for(int i=0;i<num.length;i++)
		{
			while(!max.isEmpty()&&num[max.peekLast()]<num[i])
			{
				max.pollLast();
			}
			max.addLast(i);
			if(max.peekFirst()==i-size)
			{
				max.pollFirst();
			}
			if(i>=size-1)
			{
				list.add(num[max.peekFirst()]);
			}
		}
		return list;
	}
	public static void main(String[] args)
	{
		�������ڵ����ֵ n = new �������ڵ����ֵ();
		int[] num = {2,3,4,2,6,2,5,1};
		ArrayList<Integer> result = n.maxInWindows(num, 3);
		System.out.println(result);
	}

}
