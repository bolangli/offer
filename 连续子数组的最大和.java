package 剑指offer;

public class 连续子数组的最大和 {
	
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
		连续子数组的最大和 n = new 连续子数组的最大和();
		int[] array = {1,-2,3,10,-4,7,2,-5};
		int[] arrays= {2,8,1,5,9};
		System.out.println(n.FindGreatestSumOfSubArray(arrays));
	}

}
