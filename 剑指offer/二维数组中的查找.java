package ��ָoffer;

public class ��ά�����еĲ��� {
	
	public boolean Find(int target,int[][] array)
	{
		int m=array.length;
		int n = array[0].length;
		for(int i=0,j=n-1;i<m&&j>=0;)
		{
			if(target>array[i][j])
			{
				i=i+1;
			}else if(target<array[i][j])
			{
				j=j-1;
			}else
				return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		��ά�����еĲ��� n = new ��ά�����еĲ���();
		int[][] array= {{1,2,3},{2,3,4},{4,5,6},{5,6,7}};
		System.out.println(n.Find(5, array));
	}

}
