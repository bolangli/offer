package 剑指offer;

public class 平衡二叉树 {
	
	public boolean IsBalanced_Solution(TreeNode root)
	{
		if(root==null)
		{
			return true;
		}
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		int diff = left - right;
		if(diff<-1||diff>1)
		{
			return false;
		}
		return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
	}
	public int TreeDepth(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		return (left>right)?(left+1):(right+1);
	}
	public static void main(String[] args)
	{
		平衡二叉树 n = new 平衡二叉树();
		TreeNode root = new TreeNode(1);
		TreeNode root1 = new TreeNode(2);
		TreeNode root2 = new TreeNode(1);
		TreeNode root3 = new TreeNode(1);
		TreeNode root4 = new TreeNode(1);
		TreeNode root5 = new TreeNode(1);
		TreeNode root6 = new TreeNode(1);
		TreeNode root7 = new TreeNode(1);
		root.left=root1;
		root.right=root2;
		root1.left=root3;
		root1.right=root4;
		root2.left=root5;
		root3.left=root6;
		//root6.left=root7;
		root3.right=root7;
		System.out.println(n.IsBalanced_Solution(root));
	}

}
