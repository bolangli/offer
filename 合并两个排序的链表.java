package 剑指offer;

public class 合并两个排序的链表 {
	
	public ListNode Merge(ListNode list1,ListNode list2)
	{
		if(list1==null)
		{
			return list2;
		}
		if(list2==null)
		{
			return list1;
		}
		ListNode pHead = null;
		if(list1.val<list2.val)
		{
			pHead = list1;
			pHead.next = Merge(list1.next,list2);
		}else
		{
			pHead = list2;
			pHead.next = Merge(list1, list2.next);
		}
		return pHead;
	}
	
	public static void main(String[] args)
	{
		合并两个排序的链表 n = new 合并两个排序的链表();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(3);
		ListNode l6 = new ListNode(4);
		l4.next = l5;
		l5.next = l6;
		
		ListNode head = n.Merge(l1, l4);
		while(head!=null)
		{
			System.out.print(head.val+" ");
			head = head.next;
		}
		//System.out.print(head.next.val);
	}

}
