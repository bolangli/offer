package 剑指offer;

public class 删除链表中重复的节点 {
	
	public ListNode deleteDuplication(ListNode pHead)
	{
		if(pHead==null||pHead.next==null)
		{
			return pHead;
		}
		if(pHead.val==pHead.next.val)
		{
			ListNode node = pHead.next;
			while(node!=null&&node.val==pHead.val)
			{
				node = node.next;
			}
			return deleteDuplication(node);
		}else
		{
			pHead.next = deleteDuplication(pHead.next);
			return pHead;
		}
	}
	
	public static void main(String[] args)
	{
		删除链表中重复的节点 n = new 删除链表中重复的节点();
		ListNode pHead = new ListNode(1);
		ListNode pHead1 = new ListNode(2);
		ListNode pHead2 = new ListNode(3);
		ListNode pHead3 = new ListNode(3);
		ListNode pHead4 = new ListNode(4);
		ListNode pHead5 = new ListNode(4);
		ListNode pHead6 = new ListNode(5);
		pHead.next=pHead1;
		pHead1.next = pHead2;
		pHead2.next = pHead3;
		pHead3.next = pHead4;
		pHead4.next = pHead5;
		pHead5.next = pHead6;
		ListNode node = n.deleteDuplication(pHead);
		//System.out.println(node.val);
		while(node!=null)
		{
			System.out.print(node.val+" ");
			node = node.next;
		}
	}

}
