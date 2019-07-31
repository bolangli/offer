package 剑指offer;

public class 数值的整数次方 {
	
	public double Power(double base,int exponent)
	{
		if(exponent==0)
		{
			return 1;
		}
		if(exponent==1)
		{
			return base;
		}
		double result = base*Power(base, Math.abs(exponent)-1);
		if(exponent<0)
		{
			result = 1/result;
		}
		return result;
	}
	public static void main(String[] args)
	{
		数值的整数次方 n = new 数值的整数次方();
		System.out.println(n.Power(2.0, 3));
	}

}
