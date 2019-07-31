package 剑指offer;

import java.util.ArrayList;

public class 和为S的两个数字 {
	
	public ArrayList<Integer> FindNumbersWithSum(int[] array,int sum)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int small = 0 ; 
		int big = array.length-1;
		while(big>small)
		{
			int result = array[small]+array[big];
			if(result==sum)
			{
				list.add(array[small]);
				list.add(array[big]);
				return list;
			}else if(result<sum)
			{
				small++;
			}else
				big--;
		}
		return list;
	}
	public static void main(String[] args)
	{
		和为S的两个数字 n = new 和为S的两个数字();
		int[] array = {1,2,3,4,5,6,7};
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = n.FindNumbersWithSum(array, 8);
		System.out.println(list);
	}

}
