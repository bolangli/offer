package ½£Ö¸offer;

import java.util.ArrayList;
import java.util.Arrays;

public class ×Ö·û´®µÄÅÅÁÐ {
	
	public ArrayList<String> Permutation(String str)
	{
		ArrayList<String> list  = new ArrayList<String>();
		if(str==null||str.length()==0)
		{
			return list;
		}
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		list.add(String.valueOf(chars));
		int len = chars.length;
		while(true)
		{
			int lIndex=len-1;
			int rIndex;
			while(lIndex>=1&&chars[lIndex-1]>=chars[lIndex])
			{
				lIndex--;
			}
			if(lIndex==0)
			{
				break;
			}
			rIndex = lIndex;
			while(rIndex<len&&chars[rIndex]>chars[lIndex-1])
			{
				rIndex++;
			}
			swap(chars,lIndex-1,rIndex-1);
			reverse(chars,lIndex);
			list.add(String.valueOf(chars));
		}
		return list;
		
	}
	
	private void reverse(char[] chars, int lIndex) {
		if(chars==null||chars.length<=lIndex)
		{
			return;
		}
		int len = chars.length;
		for(int i=0;i<(len-lIndex)/2;i++)
		{
			int m = lIndex+i;
			int n= len-i-1;
			if(m<=n)
			{
				swap(chars,m,n);
			}
		}
		
	}

	private void swap(char[] chars, int i, int j) {
		char temp =chars[i];
		chars[i]=chars[j];
		chars[j]=temp;
		
	}

	public static void main(String[] args)
	{
		×Ö·û´®µÄÅÅÁÐ n = new ×Ö·û´®µÄÅÅÁÐ();
		ArrayList<String> list = n.Permutation("abcd");
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
