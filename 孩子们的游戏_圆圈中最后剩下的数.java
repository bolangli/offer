package ��ָoffer;

import java.util.ArrayList;

public class �����ǵ���Ϸ_ԲȦ�����ʣ�µ��� {
	
	/*public int LastRemaining_Solution(int n,int m)
	{
		if(n<1||m<1)
		{
			return -1;
		}
		int last = 0;
		for(int i=2;i<=n;i++)
		{
			last = (last+m)%i;
		}
		return last;
	}*/
	public int LastRemaining_Solution(int n,int m)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(i);
		}
		int s=0;
		while(list.size()>1)
		{
			s = (s+m-1)%(list.size());
		//	System.out.print(s+" ");
			list.remove(s);
		}
		return list.size()==1?list.get(0):-1;
	}
	public static void main(String[] args)
	{
		�����ǵ���Ϸ_ԲȦ�����ʣ�µ��� n = new �����ǵ���Ϸ_ԲȦ�����ʣ�µ���();
		System.out.println(n.LastRemaining_Solution(5, 2));
	}

}
