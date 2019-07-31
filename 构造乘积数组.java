package 剑指offer;

public class 构造乘积数组 {
	
	public int[] multiply(int[] A)
	{
		int[] B = new int[A.length];
		if(A.length==0)
		{
			return B;
		}
		B[0]=1;
		for(int i=1;i<A.length;i++)
		{
			B[i] = B[i-1]*A[i-1];
		}
		int temp = 1;
		for(int j=A.length-2;j>=0;j--)
		{
			temp = temp*A[j+1];
			B[j] = B[j] * temp;
		}
		return B;
	}
	
	public static void main(String[] args)
	{
		构造乘积数组 n = new 构造乘积数组();
		int[] A = {1,2,3,4};
		int[] B = new int[A.length];
		B = n.multiply(A);
		for(int i=0;i<A.length;i++)
		{
			System.out.print(B[i]+" ");
		}
	}

}
