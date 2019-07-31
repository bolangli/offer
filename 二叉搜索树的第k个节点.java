package 剑指offer;

import java.util.Stack;

public class 二叉搜索树的第k个节点 {
	
	/*第一种方法
	 * TreeNode KthNode(TreeNode pRoot,int k)
	{
		if(pRoot==null||k<=0)
		{
			return null;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = pRoot;
		int count = 0;
		while(!stack.isEmpty()||node!=null)
		{
			if(node!=null)
			{
				stack.push(node);
				node = node.left;
			}else
			{
				node = stack.pop();
				count++;
				if(count==k)
				{
					return node;
				}
				node = node.right;
			}
		}
		return null;
	}*/
	//第二种方法
	TreeNode KthNode(TreeNode pRoot,int k)
	{
		if(pRoot==null||k==0)
		{
			return null;
		}
		Stack<TreeNode> stack = new Stack<>();
		int count = 0;
		while(pRoot!=null||!stack.isEmpty())
		{
			while(pRoot!=null)
			{
				stack.push(pRoot);
				pRoot = pRoot.left;
			}
			pRoot = stack.pop();
			count++;
			if(count==k)
			{
				return pRoot;
			}
			pRoot = pRoot.right;
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		二叉搜索树的第k个节点 n = new 二叉搜索树的第k个节点();
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(7);
		TreeNode t4 = new TreeNode(2);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(8);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		System.out.println(n.KthNode(t1, 4).val);
	}

}
