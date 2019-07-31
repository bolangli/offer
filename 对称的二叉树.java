package 剑指offer;

public class 对称的二叉树 {
	
	boolean isSymmetrical(TreeNode pRoot)
	{
		if(pRoot==null)
		{
			return true;
		}
		return compare(pRoot.left,pRoot.right);
	}

	private boolean compare(TreeNode left, TreeNode right) {
		if(left==null && right==null)
		{
			return true;
		}
		if(left==null || right==null)
		{
			return false;
		}
		if(left.val!=right.val)
		{
			return false;
		}
		return compare(left.left,right.right)&&compare(left.right,right.left);
	}
	
	public static void main(String[] args)
	{
		对称的二叉树 n = new 对称的二叉树();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(4);
		TreeNode t4 = new TreeNode(5);
		TreeNode t5 = new TreeNode(3);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(4);
		t1.left = t2;
		t1.right = t5;
		t2.left = t3;
		t2.right = t4;
		t5.left = t6;
		t5.right = t7;
		System.out.println(n.isSymmetrical(t1));
	}

}
