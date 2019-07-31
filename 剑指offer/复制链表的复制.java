
package 剑指offer;

public class 复制链表的复制 {
	
	public RandomListNode Clone(RandomListNode pHead)
	{
		if(pHead==null)
		{
			return null;
		}
		
		RandomListNode cloneNode = pHead;
		while(cloneNode!=null)
		{
			RandomListNode pClone = new RandomListNode(cloneNode.label);
			RandomListNode next = cloneNode.next;
			cloneNode.next = pClone;
			pClone.next = next;
			cloneNode = next;
		}
		
		cloneNode = pHead;
		while(cloneNode!=null)
		{
			cloneNode.next.random = cloneNode.random==null?null:cloneNode.random.next;
			cloneNode = cloneNode.next.next;
		}
		
		cloneNode = pHead;
		RandomListNode cloneHead = pHead.next;
		while(cloneNode!=null)
		{
			RandomListNode clone = cloneNode.next;
			cloneNode.next = clone.next;
			clone.next = clone.next==null?null:clone.next.next;
			cloneNode = cloneNode.next;
		}
		return cloneHead;
	}
	public static void main(String[] args)
	{
		复制链表的复制 n = new 复制链表的复制();
		RandomListNode r1 = new RandomListNode(1);
		RandomListNode r2 = new RandomListNode(2);
		RandomListNode r3 = new RandomListNode(3);
		RandomListNode r4 = new RandomListNode(4);
		RandomListNode r5 = new RandomListNode(5);
		r1.next = r2;
		r2.next = r3;
		r3.next = r4;
		r4.next = r5;
		r1.random = r3;
		r2.random = r5;
		r4.random = r2;
		RandomListNode rr = n.Clone(r1);
		while(rr!=null)
		{
			System.out.print(rr.label+" ");
			rr = rr.next;
		}
		//System.out.println(rr.label);
	}

}
