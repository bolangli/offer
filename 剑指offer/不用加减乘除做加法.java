package ��ָoffer;

public class ���üӼ��˳����ӷ� {
	
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
		���üӼ��˳����ӷ� n = new ���üӼ��˳����ӷ�();
		System.out.println(n.Add(5, 7));
	}

}
