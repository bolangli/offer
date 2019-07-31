package 剑指offer;

import java.util.ArrayList;

public class 二叉树中和为某一值的路径 {
	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target)
	{
		if(root==null)
		{
			return listAll;
		}
		list.add(root.val);
		target = target - root.val;
		if(target==0&&root.left==null&&root.right==null)
		{
			listAll.add(new ArrayList<Integer>(list));
		}
		FindPath(root.left, target);
		FindPath(root.right, target);
		list.remove(list.size()-1);
		return listAll;
	}
	public static void main(String[] args)
	{
		二叉树中和为某一值的路径 n = new 二叉树中和为某一值的路径();
		TreeNode root = new TreeNode(10);
		TreeNode root1 = new TreeNode(5);
		TreeNode root2 = new TreeNode(12);
		TreeNode root3 = new TreeNode(4);
		TreeNode root4 = new TreeNode(7);
		root.left = root1;
		root.right = root2;
		root1.left = root3;
		root1.right = root4;
		n.listAll=n.FindPath(root, 22);
		System.out.println(n.listAll);
	}
}
