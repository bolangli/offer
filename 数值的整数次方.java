package ��ָoffer;

public class ��ֵ�������η� {
	
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
		��ֵ�������η� n = new ��ֵ�������η�();
		System.out.println(n.Power(2.0, 3));
	}

}
