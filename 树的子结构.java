package 剑指offer;

public class 树的子结构 {
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2)
	{
		boolean result = false;
		if(root1!=null && root2!=null)
		{
			if(root1.val==root2.val)
			{
				result = DoesTree1HasTree2(root1,root2);
			}
			if(!result)
			{
				result = HasSubtree(root1.left, root2);
			}
			if(!result)
			{
				result = HasSubtree(root1.right, root2);
			}
		}
		return result;
	}

	private boolean DoesTree1HasTree2(TreeNode root1, TreeNode root2) {
		if(root1==null && root2!=null)
		{
			return false;
		}
		if(root2==null)
		{
			return true;
		}
		if(root1.val!=root2.val)
		{
			return false;
		}
		return DoesTree1HasTree2(root1.left, root2.left) && DoesTree1HasTree2(root1.right, root2.right);
	}
	public static void main(String[] args)
	{
		树的子结构 n = new 树的子结构();
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(5);
		TreeNode t4 = new TreeNode(1);
		TreeNode t5 = new TreeNode(4);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		TreeNode tt1 = new TreeNode(3);
		TreeNode tt2 = new TreeNode(1);
		TreeNode tt3 = new TreeNode(4);
		tt1.left = tt2;
		tt1.right = tt3;
		boolean b = n.HasSubtree(t1, tt1);
		System.out.println(b);
		
	}

}
