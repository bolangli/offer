package 剑指offer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class 按之字形顺序打印二叉树 {
	
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if(pRoot==null)
		{
			return result;
		}
		ArrayList<Integer> list = new ArrayList<>();
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addLast(null);
		queue.addLast(pRoot);
		boolean leftToRight = true;
		while(queue.size()!=1)
		{
			TreeNode node = queue.removeFirst();
			if(node ==null)
			{
				Iterator<TreeNode> iter = null;
				if(leftToRight)
				{
					iter = queue.iterator();
				}else
					iter = queue.descendingIterator();
				leftToRight = !leftToRight;
				while(iter.hasNext())
				{
					TreeNode temp = (TreeNode)iter.next();
					list.add(temp.val);
				}
				result.add(new ArrayList<Integer>(list));
				list.clear();
				queue.addLast(null);
				continue;
			}
			if(node.left!=null)
			{
				queue.addLast(node.left);
			}
			if(node.right!=null)
			{
				queue.addLast(node.right);
			}
		}
		return result;

	}
	
	public static void main(String[] args)
	{
		按之字形顺序打印二叉树 n = new 按之字形顺序打印二叉树();
		TreeNode t1 = new TreeNode(8);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(6);
		TreeNode t4 = new TreeNode(2);
		TreeNode t5 = new TreeNode(1);
		TreeNode t6 = new TreeNode(3);
		TreeNode t7 = new TreeNode(4);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		list =  n.Print(t1);
		for(ArrayList l:list)
		{
			for(int i=0;i<l.size();i++)
			{
				System.out.print(l.get(i)+" ");
			}
			System.out.println();
		}
	}

}
