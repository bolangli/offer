package 剑指offer;

public class 链表中倒数第k个节点 {
	
	public ListNode FindKthToTail(ListNode head,int k)
	{
		if(head==null||k==0)
		{
			return null;
		}
		ListNode p1 = head;
		for(int i=0;i<k-1;i++)
		{
			if(p1.next!=null)
			{
				p1 = p1.next;
			}else
				return null;
		}
		ListNode p2 = head;
		while(p1.next!=null)
		{
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	public static void main(String[] args)
	{
		链表中倒数第k个节点 n = new 链表中倒数第k个节点();
		ListNode head = new ListNode(1);
		ListNode h2 = new ListNode(2);
		ListNode h3 = new ListNode(3);
		ListNode head1 = null;
		head.next = h2;
		h2.next = h3;
		ListNode l = n.FindKthToTail(head1, 2);
		System.out.println(l);
	}

}
