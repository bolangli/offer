package ��ָoffer;

import java.util.ArrayList;
import java.util.HashMap;

public class ������ֻ����һ�ε����� {
	
	public void FindNumsAppearOnce(int[] array,int[] num1,int[] num2)
	{
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++)
		{
			int num = array[i];
			if(hash.containsKey(num))
			{
				hash.put(num, hash.get(num)+1);
			}else
				hash.put(num, 1);
		}
		for(int i=0;i<array.length;i++)
		{
			if(hash.get(array[i])%2==1)
			{
				list.add(array[i]);
			}
		}
		num1[0]=list.get(0);
		num2[0]=list.get(1);
	}
	public static void main(String[] args)
	{
		������ֻ����һ�ε����� n = new ������ֻ����һ�ε�����();
		int[] array = {2,4,3,6,3,2,5,5};
		int[] num1= new int[1];
		int[] num2= new int[1];
		n.FindNumsAppearOnce(array, num1, num2);
		System.out.println(num1[0]+" "+num2[0]);
	}

}
