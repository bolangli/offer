package 剑指offer;

import java.util.Arrays;

public class 扑克牌顺子 {
	
	public boolean isContinuous(int[] numbers)
	{
		if(numbers==null||numbers.length<1)
		{
			return false;
		}
		Arrays.sort(numbers);
		int count = 0;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==0)
			{
				count++;
			}
		}
		int small = count;
		int big = small+1;
		int gra = 0;
		while(big<numbers.length)
		{
			if(numbers[small]==numbers[big])
			{
				return false;
			}
			gra += numbers[big]-numbers[small]-1;
			small = big;
			big++;
		}
		return (gra>count)?false:true;
	}
	
	public static void main(String[] args)
	{
		扑克牌顺子 n = new 扑克牌顺子();
		int[] numbers = {1,3,5,0,0};
		int[] number = {};
		System.out.println(n.isContinuous(number));
	}

}
