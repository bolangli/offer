package 剑指offer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class 把二叉树打印成多行 {
	
	/*第一种方法
	 * ArrayList<ArrayList<Integer>> Print(TreeNode pRoot)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		depth(pRoot,1,result);
		return result;
	}

	private void depth(TreeNode pRoot, int i, ArrayList<ArrayList<Integer>> result) {
		
		if(pRoot==null)
		{
			return ;
		}
		if(i>result.size())
		{
			result.add(new ArrayList<Integer>());
		}
		result.get(i-1).add(pRoot.val);
		depth(pRoot.left,i+1,result);
		depth(pRoot.right,i+1,result);
	}*/
	//第二种方法
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if(pRoot==null)
		{
			return result;
		}
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<TreeNode> queue = new ArrayList<>();
		queue.add(null);
		queue.add(pRoot);
		while(queue.size()!=1)
		{
			TreeNode node = queue.remove(0);
			if(node ==null)
			{
				Iterator<TreeNode> iter = null;
				iter = queue.iterator();
				while(iter.hasNext())
				{
					TreeNode temp = (TreeNode)iter.next();
					list.add(temp.val);
				}
				result.add(new ArrayList<Integer>(list));
				list.clear();
				queue.add(null);
				continue;
			}
			if(node.left!=null)
			{
				queue.add(node.left);
			}
			if(node.right!=null)
			{
				queue.add(node.right);
			}
		}
		return result;

	}
	
	public static void main(String[] args)
	{
		把二叉树打印成多行 n = new 把二叉树打印成多行();
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
