package 剑指offer;

import java.util.Arrays;

public class 把数组排成最小的数 {
	
	public String PrintMinNumber(int[] numbers)
	{
		if(numbers==null||numbers.length==0)
		{
			return "";
		}
		Arrays.sort(numbers);
		String result = Integer.toString(numbers[0]) ;
		for(int i=1;i<numbers.length;i++)
		{
			String s = Integer.toString(numbers[i]);
			int flag = (result+s).compareTo(s+result);
			if(flag==0)
			{
				result = result+s;
			}else if(flag>0)
			{
				result = s+result;
			}else
				result = result+s;
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		把数组排成最小的数  n = new 把数组排成最小的数();
		int[] numbers = {3,32,321};
		int[] numbers1 = {3,5,1,4,2};
		int[] numbers2 = {};
		System.out.println(n.PrintMinNumber(numbers2));
	}

}
