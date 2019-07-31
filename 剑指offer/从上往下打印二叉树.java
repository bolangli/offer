package 剑指offer;

import java.util.ArrayList;

public class 从上往下打印二叉树 {
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root)
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
		if(root==null)
		{
			return array;
		}
		queue.add(root);
		while(queue.size()!=0)
		{
			TreeNode t = queue.remove(0);
			if(t.left!=null)
			{
				queue.add(t.left);
			}
			if(t.right!=null)
			{
				queue.add(t.right);
			}
			array.add(t.val);
		}
		return array;
	}
	
	public static void main(String[] args)
	{
		从上往下打印二叉树 n = new 从上往下打印二叉树();
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(5);
		TreeNode t4 = new TreeNode(1);
		TreeNode t5 = new TreeNode(4);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		System.out.print(n.PrintFromTopToBottom(t1));
	}

}
