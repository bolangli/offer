package 剑指offer;

public class 变态跳台阶 {
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
		变态跳台阶 n= new 变态跳台阶();
		System.out.println(n.JumpFloorII(5));
	}

}
