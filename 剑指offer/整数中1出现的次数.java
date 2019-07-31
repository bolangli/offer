package 剑指offer;

public class 整数中1出现的次数 {
	
	public int NumberOf1Between1AndN_Solution(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		int count=0;
		for(int i=1;i<=n;i*=10)
		{
			int x = i*10;
			int y = 0;
			int k = n%x;
			if(k>i*2-1)
			{
				y = i;
			}else if(k<i)
			{
				y = 0;
			}else
				y = k-i+1;
			count += (n/x)*i+y;
		}
		return count;
	}
	public static void main(String[] args)
	{
		整数中1出现的次数 n = new 整数中1出现的次数();
		System.out.println(n.NumberOf1Between1AndN_Solution(199));
	}

}
