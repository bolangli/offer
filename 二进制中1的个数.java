package ��ָoffer;

public class ��������1�ĸ��� {
	
	public int NumberOf1(int n)
	{
		int count = 0;
		while(n!=0)
		{
			++count;
			n=(n-1)&n;
		}
		return count;
	}
	public static void main(String[] args)
	{
		��������1�ĸ��� n = new ��������1�ĸ���();
		System.out.println(n.NumberOf1(7));
	}

}
