package 剑指offer;

public class 二叉树的下一个节点 {
	
	public TreeLinkNode GetNext(TreeLinkNode pNode)
	{
		if(pNode==null)
		{
			return null;
		}
		if(pNode.right!=null)
		{
			pNode = pNode.right;
			while(pNode.left!=null)
			{
				pNode = pNode.left;
			}
			return pNode;
		}
		while(pNode.next!=null)
		{
			if(pNode.next.left==pNode)
			{
				return pNode.next;
			}
			pNode = pNode.next;
		}
		return null;
	}
	
	public static void main(String[] args)	
	{
		二叉树的下一个节点 n = new 二叉树的下一个节点();
		TreeLinkNode pNode = new TreeLinkNode(1);
		TreeLinkNode p2 = new TreeLinkNode(3);
		TreeLinkNode p3 = new TreeLinkNode(4);
		TreeLinkNode p4 = new TreeLinkNode(5);
		TreeLinkNode p5 = new TreeLinkNode(6);
		TreeLinkNode p6 = new TreeLinkNode(7);
		TreeLinkNode p7 = new TreeLinkNode(8);
		pNode.left=p2;
		pNode.right=p3;
		p2.left=p4;
		p2.right=p5;
		p3.left=p6;
		p3.right=p7;
		p2.next=p3.next=pNode;
		p4.next=p5.next=p2;
		p6.next=p7.next=p3;
		TreeLinkNode l = n.GetNext(p6);
		System.out.println(l.val);
	}

}
