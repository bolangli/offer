package ��ָoffer;

public class ��̬��̨�� {
	public int JumpFloorII(int target)
	{
		if(target==0||target==1)
		{
			return 1;
		}
		return 2*JumpFloorII(target-1);
	}
	
	public static void main(String[] args)
	{
		��̬��̨�� n= new ��̬��̨��();
		System.out.println(n.JumpFloorII(5));
	}

}
