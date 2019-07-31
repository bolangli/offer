package 剑指offer;

public class 链表中环的入口节点 {
	
	public ListNode EntryNodeOfLoop(ListNode pHead)
	{
		if(pHead==null||pHead.next==null)
		{
			return null;
		}
		ListNode p1 = pHead;
		ListNode p2 = pHead;
		while(p2!=null&p2.next!=null)
		{
			p1 = p1.next;
			p2 = p2.next.next;
			if(p1==p2)
			{
				p2 = pHead;
				while(p1!=p2)
				{
					p1 = p1.next;
					p2 = p2.next;
				}
				if(p1==p2)
				{
					return p1;
				}
			}
		}
		return null;
	}
	public static void main(String[] args)
	{
		链表中环的入口节点 n = new 链表中环的入口节点();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l2;
		System.out.println(n.EntryNodeOfLoop(l1).val);
	}
	

}
