package 剑指offer;

public class 斐波那契数列 {
	/*第一种：递归方法
	public int Fibonacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}*/
	
	//第二种：非递归
	public int Fibonacci(int n)
	{
		int[] result= {0,1};
		if(n<=1)
		{
			return result[n];
		}
		int f1=0;
		int f2=1;
		int fn=0;
		for(int i=2;i<=n;i++)
		{
			fn=f1+f2;
			f1=f2;
			f2=fn;
		}
		return fn;
	}
	public static void main(String[] args)
	{
		斐波那契数列 n = new 斐波那契数列();
		System.out.println(n.Fibonacci(4));
	}

}
