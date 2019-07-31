package ½£Ö¸offer;

public class Ìæ»»¿Õ¸ñ {
	public String replaceSpace(StringBuffer str)
	{
		String s = "%20";
		int n = str.length();
		int i =0;
		for(;i<n;i++)
		{
			if(str.charAt(i)==' ')
			{
				str.replace(i, i+1, s);
				i=i+2;
			}
		}
		String ss = str.toString();
		return ss;
	}
	public static void main(String[] args)
	{
		Ìæ»»¿Õ¸ñ n = new Ìæ»»¿Õ¸ñ();
		StringBuffer str = new StringBuffer(" ");
		System.out.println(n.replaceSpace(str));
	}

}
