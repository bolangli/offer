package 剑指offer;

import java.util.HashMap;

public class 两个链表的第一个公共节点 {
	
	public ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2)
	{
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		HashMap<ListNode,Integer> map = new HashMap<ListNode,Integer>();
		while(p1!=null)
		{
			map.put(p1, 1);
			p1 = p1.next;
		}
		while(p2!=null)
		{
			if(map.containsKey(p2))
			{
				return p2;
			}else
				p2 = p2.next;
		}
		return null;
	}
	public static void main(String[] args)
	{
		两个链表的第一个公共节点 n = new 两个链表的第一个公共节点();
		ListNode p1 = new ListNode(1);
		ListNode p2 = new ListNode(2);
		ListNode p3 = new ListNode(3);
		ListNode p4 = new ListNode(6);
		ListNode p5 = new ListNode(7);
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		p4.next=p5;
		ListNode pp2 = new ListNode(4);
		ListNode pp3 = new ListNode(5);
		ListNode pp4 = new ListNode(6);
		ListNode pp5 = new ListNode(7);
		pp2.next=pp3;
		pp3.next=pp4;
		pp4.next=pp5;
		ListNode l = n.FindFirstCommonNode(p1, pp2);
		System.out.println(l);
	}

}
