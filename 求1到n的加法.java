package 剑指offer;

public class 求1到n的加法 {
	
	public int Sum_Solution(int n)
	{
		int sum = n;
		boolean flag = (sum>0)&&((sum+=Sum_Solution(--n))>0);
		return sum;
	}
	public static void main(String[] args)
	{
		求1到n的加法 n = new 求1到n的加法();
		System.out.println(n.Sum_Solution(5));
	}

}
