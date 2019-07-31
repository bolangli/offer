package 剑指offer;

public class 旋转数组的最小数字 {
	
	public int minNumberInRotateArray(int[] array)
	{
		if(array.length==0)
		{
			return 0;
		}
		int left = 0;
		int right = array.length-1;
		int mid = -1;
		while(array[left]>=array[right])
		{
			if(right-left==1)
			{
				mid=right;
				break;
			}
			mid = left + (right-left)/2;
			if(array[mid]>=array[left])
			{
				left=mid;
			}else if(array[mid]<=array[right])
			{
				right=mid;
			}
		}
		return array[mid];
	}
	
	public static void main(String[] args)
	{
		旋转数组的最小数字 n = new 旋转数组的最小数字();
		int[] array= {3,4,5,1,2};
		System.out.println(n.minNumberInRotateArray(array));
	}

}
