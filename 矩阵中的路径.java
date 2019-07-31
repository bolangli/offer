package 剑指offer;

public class 矩阵中的路径 {
	public boolean hasPath(char[] matrix,int rows,int cols,char[] str)
	{
		if(matrix==null||rows<1||cols<1||str==null)
		{
			return false;
		}
		boolean[] isVisited = new boolean[matrix.length];
		for(boolean v :isVisited)
		{
			v = false;
		}
		int pathLength = 0;
		for(int row=0;row<rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
				if(hasPathCore(matrix,rows,cols,row,col,pathLength,str,isVisited))
				{
					return true;
				}
			}
		}
		return false;
	}

	private boolean hasPathCore(char[] matrix, int rows, int cols, int row, int col, int pathLength, char[] str,
			boolean[] isVisited) {
		
		if(row<0||col<0||row>=rows||col>=cols||isVisited[row*cols+col]==true||str[pathLength]!=matrix[row*cols+col])
		{
			return false;
		}
		if(pathLength==str.length-1)
		{
			return true;
		}
		isVisited[row*cols+col]=true;
		if(hasPathCore(matrix, rows, cols, row-1, col, pathLength+1, str, isVisited)||
				hasPathCore(matrix, rows, cols, row+1, col, pathLength+1, str, isVisited)||
				hasPathCore(matrix, rows, cols, row, col-1, pathLength+1, str, isVisited)||
				hasPathCore(matrix, rows, cols, row, col+1, pathLength+1, str, isVisited))
		{
			return true;
		}
		isVisited[row*cols+col]=false;
		return false;
	}
	
	public static void main(String[] args)
	{
		矩阵中的路径 n = new 矩阵中的路径();
		char[] matrix = "ABCESFCSADEE".toCharArray();
		char[] str = "ABCB".toCharArray();
		System.out.println(n.hasPath(matrix, 3, 4, str));
	}

}
