package 剑指offer;

public class 不用加减乘除做加法 {
	
	public int Add(int num1,int num2)
	{
		while(num2!=0)
		{
			int temp = num1^num2;
			num2 = (num1&num2)<<1;
			num1 = temp;
		}
		return num1;
	}
	
	public static void main(String[] args)
	{
		不用加减乘除做加法 n = new 不用加减乘除做加法();
		System.out.println(n.Add(5, 7));
	}

}
