package 剑指offer;

public class 二叉搜索树与双向链表 {
	
	public TreeNode Convert(TreeNode pRootOfTree)
	{
		if(pRootOfTree==null)
		{
			return null;
		}
		if(pRootOfTree.left==null&&pRootOfTree.right==null)
		{
			return pRootOfTree;
		}
		TreeNode left = Convert(pRootOfTree.left);
		TreeNode p = left;
		while(p!=null&&p.right!=null)
		{
			p = p.right;
		}
		if(left!=null)
		{
			p.right = pRootOfTree;
			pRootOfTree.left = p;
		}
		TreeNode right = Convert(pRootOfTree.right);
		if(right!=null)
		{
			pRootOfTree.right = right;
			right.left = pRootOfTree;
		}
		
		return left!=null?left:pRootOfTree;
	}
	
	public static void main(String[] args)
	{
		二叉搜索树与双向链表 n = new 二叉搜索树与双向链表();
		TreeNode root = new TreeNode(5);
		TreeNode root1 = new TreeNode(3);
		TreeNode root2 = new TreeNode(7);
		TreeNode root3 = new TreeNode(2);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(6);
		TreeNode root6 = new TreeNode(8);
		root.left = root1;
		root.right = root2;
		root1.left = root3;
		root1.right = root4;
		root2.left = root5;
		root2.right = root6;
		TreeNode result = n.Convert(root);
		while(result!=null)
		{
			System.out.print(result.val+" ");
			result = result.right;
		}
	}

}
