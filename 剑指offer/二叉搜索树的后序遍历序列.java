package 剑指offer;

public class 二叉搜索树的后序遍历序列 {
	
	public boolean VerifySequenceOfBST(int[] sequence)
	{
		if(sequence.length==0)
		{
			return false;
		}
		if(sequence.length==1)
		{
			return true;
		}
		return Judge(sequence,0,sequence.length-1);
	}
	private boolean Judge(int[] sequence, int i, int j) {
		if(i>=j)
		{
			return true;
		}
		int k = j;
		while(k>i&&sequence[k-1]>sequence[j])
		{
			k--;
		}
		for(int p=i;p<k-1;p++)
		{
			if(sequence[p]>sequence[j])
			{
				return false;
			}
		}
		return Judge(sequence, i, k-1) && Judge(sequence, k, j-1);
	}
	public static void main(String[] args)
	{
		二叉搜索树的后序遍历序列 n = new 二叉搜索树的后序遍历序列();
		int[] sequence = {5,7,6,9,11,10};
		int[] sequence1 = {7,4,6,5};
		System.out.println(n.VerifySequenceOfBST(sequence));
	}

}
