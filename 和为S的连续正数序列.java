package 剑指offer;

import java.util.ArrayList;

public class 和为S的连续正数序列 {
	
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum)
	{
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int small = 1;
		int big = 2;
		int middle = (1+sum)/2;
		int result = small+big;
		while(small<middle)
		{
			if(result==sum)
			{
				ArrayList<Integer> array = new ArrayList<Integer>();
				array=Get(small, big);
				list.add(array);
			}
			while(result>sum&&small<middle)
			{
				result = result-small;
				small++;
				if(result==sum)
				{
					ArrayList<Integer> array = new ArrayList<Integer>();
					array=Get(small, big);
					list.add(array);
				}
			}
			big++;
			result = result+big;
		}
		return list;
	}
	/*public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum)
	{
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int small = 1,big = 2;
		while(big>small)
		{
			int result = (big+small)*(big-small+1)/2;
			if(result==sum)
			{
				ArrayList<Integer> array = new ArrayList<Integer>();
				array = Get(small, big);
				for(int i=small;i<=big;i++)
				{
					array.add(i);
				}
				list.add(array);
				small++;
			}else if(result<sum)
			{
				big++;
			}else
				small++;
		}
		return list;
	}*/
	public ArrayList<Integer> Get(int small,int big)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=small;i<=big;i++)
		{
			list.add(i);
		}
		return list;
	}
	public static void main(String[] args)
	{
		和为S的连续正数序列 n = new 和为S的连续正数序列();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		list = n.FindContinuousSequence(9);
		for(int i=0;i<list.size();i++)
		{
			ArrayList<Integer> a = new ArrayList<Integer>();
			a = list.get(i);
			for(int j=0;j<a.size();j++)
			{
				System.out.print(a.get(j)+" ");
			}
			System.out.println();
		}
	}

}
