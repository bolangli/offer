package 剑指offer;

import java.util.Stack;

public class 包含min函数的栈 {
	
	Stack<Integer> data = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	public void push(int node)
	{
		data.push(node);
		if(minStack.size()==0 || node<minStack.peek())
		{
			minStack.push(node);
		}else
			minStack.push(minStack.peek());
	}
	public void pop()
	{
		data.pop();
		minStack.pop();
	}
	public int top()
	{
		return data.peek();
	}
	public int min()
	{
		return minStack.peek();
	}
	
	public static void main(String[] args)
	{
		包含min函数的栈 n = new 包含min函数的栈();
		int[] node = {1,5,3,4,2};
		for(int i=0;i<node.length;i++)
		{
			n.push(node[i]);
		}
		System.out.print(n.top()+" "+n.min());
	}

}
