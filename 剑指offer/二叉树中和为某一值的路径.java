package ��ָoffer;

import java.util.ArrayList;

public class �������к�Ϊĳһֵ��·�� {
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
		�������к�Ϊĳһֵ��·�� n = new �������к�Ϊĳһֵ��·��();
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
