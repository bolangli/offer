package ½£Ö¸offer;

import java.util.Stack;

public class ·­×ªµ¥´ÊË³ĞòĞòÁĞ {
	
	public String ReverseSentence(String str)
	{
		if(str.trim().equals("")&&str.length()>0)
		{
			return str;
		}
		//String string = str.trim();
		String[] ss = str.split(" ");
		Stack stack = new Stack();
		for(int i=0;i<ss.length;i++)
		{
			stack.push(ss[i]);
		}
		String result = new String();
		while(!stack.isEmpty())
		{
			result=result+stack.pop()+" ";
		}
		return result.trim();
	}
	
	public static void main(String[] args)
	{
		·­×ªµ¥´ÊË³ĞòĞòÁĞ n = new ·­×ªµ¥´ÊË³ĞòĞòÁĞ();
		String s = new String();
		s = n.ReverseSentence("I am a student.");
		String ss = new String();
		ss = n.ReverseSentence(" ");
		System.out.println(ss);
	}

}
