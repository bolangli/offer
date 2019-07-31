package ½£Ö¸offer;

public class ×óÐý×ª×Ö·û´® {
	
	public String LeftRotateString(String str,int n)
	{
		if(str.length()<n)
		{
			return str;
		}
		String result = new String();
		String str1 = str.substring(0, n);
		String str2 = str.substring(n);
		result = str2+str1;
		return result;
	}
	
	public static void main(String[] args)
	{
		×óÐý×ª×Ö·û´® n = new ×óÐý×ª×Ö·û´®();
		String str = new String();
		str = n.LeftRotateString("abcXYZdef", 3);
		System.out.println(str);
	}

}
