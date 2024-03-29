package 剑指offer;

public class 表示数值的字符串 {
	private int index = 0;
	public boolean isNumeric(char[] str)
	{
		if(str.length<1)
		{
			return false;
		}
		boolean flag = scanInteger(str);
		if(index<str.length&&str[index]=='.')
		{
			index++;
			flag = scanUnsignInteger(str)||flag;
		}
		if(index<str.length&&(str[index]=='E'||str[index]=='e'))
		{
			index++;
			flag = flag&&scanInteger(str);
		}
		return flag&&index==str.length;
	}
	private boolean scanInteger(char[] str) {
		if(index<str.length&&(str[index]=='+'||str[index]=='-'))
		{
			index++;
		}
		return scanUnsignInteger(str);
	}
	private boolean scanUnsignInteger(char[] str) {
		int start=index;
		while(index<str.length&&str[index]>='0'&&str[index]<='9')
		{
			index++;
		}
		return start<index;
	}

}
