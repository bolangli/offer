package 剑指offer;

public class 把字符串转换成整数 {
	
	public int StrToInt(String str)
	{
		if(str.equals("")||str.length()==0)
		{
			return 0;
		}
		char[] c = str.toCharArray();
		int sum = 0;
		int sign = 0;
		if(c[0]=='-')
		{
			sign=1;
		}
		for(int i=sign;i<str.length();i++)
		{
			if(c[i]=='+')
			{
				continue;
			}
			if(c[i]<48||c[i]>57)
			{
				return 0;
			}
			sum = sum*10+c[i]-48;
		}
		return sign==0?sum:sum*(-1);
	}
	public static void main(String[] args)
	{
		把字符串转换成整数 n = new 把字符串转换成整数();
		System.out.println(n.StrToInt("-2147483647"));
	}

}
