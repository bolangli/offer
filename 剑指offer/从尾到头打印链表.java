package 剑指offer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class 从尾到头打印链表 {
	/*
	第一种方法：使用递归
	ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
	{
		
		if(listNode!=null)
		{
			printListFromTailToHead(listNode.next);
			list.add(listNode.val);
		}
		return list;
	}*/
	//第二种方法：使用栈的思想
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
	{
		Stack<Integer> s = new Stack<Integer>();
		while(listNode!=null)
		{
			s.push(listNode.val);
			listNode=listNode.next;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(!s.empty())
		{
			list.add(s.pop());
		}
		return list;
	}
	
	public static void main(String[] args)
	{
		从尾到头打印链表 n = new 从尾到头打印链表();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = n.printListFromTailToHead(l1);
		/*Iterator it1 = list.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next());
		}*/
		for(Integer i :list)
		{
			System.out.print(i+" ");
		}
	}

}
