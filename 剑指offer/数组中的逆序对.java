package ��ָoffer;

public class �����е������ {
	
	public int InversePairs(int[] array)
	{
		int count = 0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					count++;
				}
			}
		}
		
		return count%1000000007;
	}
	public static void main(String[] args)
	{
		�����е������ n = new �����е������();
		int[] array = {7,5,6,4};
		int[] array1 = {1,2,3,4,5,6,7,0};
		System.out.println(n.InversePairs(array1));
	}

}
