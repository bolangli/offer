package ��ָoffer;

public class ��������������� {
	
	public int FindGreatestSumOfSubArray(int[] array)
	{
		int result = array[0];
		int max = array[0];
		for(int i=1;i<array.length;i++)
		{
			max = Math.max(array[i], array[i]+max);
			result = Math.max(max, result);
		}
		return result;
	}
	public static void main(String[] args)
	{
		��������������� n = new ���������������();
		int[] array = {1,-2,3,10,-4,7,2,-5};
		int[] arrays= {2,8,1,5,9};
		System.out.println(n.FindGreatestSumOfSubArray(arrays));
	}

}
