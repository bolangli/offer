package ��ָoffer;

public class ��ת���� {
	
	public ListNode ReverseList(ListNode head)
	{
		ListNode pNode = head;
		ListNode pPrev = null;
		ListNode p = null;
		while(pNode!=null)
		{
			ListNode pNext = pNode.next;
			if(pNext==null)
			{
				p = pNode;
			}
			pNode.next = pPrev;
			pPrev = pNode;
			pNode = pNext;
		}
		return p;
	}

	public static void main(String[] args)
	{
		��ת���� n = new ��ת����();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		ListNode l = n.ReverseList(l1);
		System.out.println(l.val);
	}
}
