package 剑指offer;

public class 二进制中1的个数 {
	
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
		二进制中1的个数 n = new 二进制中1的个数();
		System.out.println(n.NumberOf1(7));
	}

}
