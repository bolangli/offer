package 剑指offer;

import java.util.ArrayList;

public class 序列化二叉树 {
	
	public String Serialize(TreeNode root)
	{
		StringBuffer buffer = new StringBuffer();
		if(root==null)
		{
			buffer.append("#,");
			return buffer.toString();
		}
		buffer.append(root.val+",");
		buffer.append(Serialize(root.left));
		buffer.append(Serialize(root.right));
		return buffer.toString();
	}
	int index = -1;
	public TreeNode Deserialize(String str)
	{
		index++;
		String[] ss = str.split(",");
		TreeNode node = null;
		if(!ss[index].equals("#"))
		{
			node = new TreeNode(Integer.valueOf(ss[index]));
			node.left = Deserialize(str);
			node.right = Deserialize(str);
		}
		return node;
	}
	
	public static void main(String[] args)
	{
		序列化二叉树 n = new 序列化二叉树();
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
		System.out.println(n.Serialize(t1));
		TreeNode node = n.Deserialize(n.Serialize(t1));
		把二叉树打印成多行 nn = new 把二叉树打印成多行();
		ArrayList<ArrayList<Integer>> list = nn.Print(node);
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
