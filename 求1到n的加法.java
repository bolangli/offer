package ��ָoffer;

public class ��1��n�ļӷ� {
	
	public int Sum_Solution(int n)
	{
		int sum = n;
		boolean flag = (sum>0)&&((sum+=Sum_Solution(--n))>0);
		return sum;
	}
	public static void main(String[] args)
	{
		��1��n�ļӷ� n = new ��1��n�ļӷ�();
		System.out.println(n.Sum_Solution(5));
	}

}
