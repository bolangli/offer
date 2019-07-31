package 剑指offer;

public class 机器人的运动范围 {
	
	public int movingCount(int threshold,int rows,int cols)
	{
		if(rows<=0||cols<=0||threshold<0)
		{
			return 0;
		}
		boolean[] isVisited = new boolean[rows*cols];
		for(boolean v:isVisited)
		{
			v = false;
		}
		int count = movingCountCore(threshold,rows,cols,isVisited,0,0);
		return count;
	}

	private int movingCountCore(int threshold, int rows, int cols, boolean[] isVisited, int i, int j) {
		
		int count = 0;
		if(check(threshold,rows,cols,isVisited,i,j))
		{
			isVisited[i*cols+j] = true;
			count = 1+movingCountCore(threshold, rows, cols, isVisited, i-1, j)
					+movingCountCore(threshold, rows, cols, isVisited, i+1, j)
					+movingCountCore(threshold, rows, cols, isVisited, i, j-1)
					+movingCountCore(threshold, rows, cols, isVisited, i, j+1);
		}
		
		return count;
	}

	private boolean check(int threshold, int rows, int cols, boolean[] isVisited, int i, int j) {
		
		/*if(i<0||i>=rows||j<0||j>=cols||getDigitSum(i)+getDigitSum(j)>threshold||isVisited[i*cols+j]==true)
		{
			return false;
		}
		
		return true;*/
		
		if(i>=0&&i<rows&&j>=0&&j<cols&&getDigitSum(i)+getDigitSum(j)<=threshold&&!isVisited[i*cols+j])
		{
			return true;
		}
		return false;
	}

	private int getDigitSum(int i) {
		
		int sum = 0;
		while(i>0)
		{
			sum = sum+i%10;
			i = i/10;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		机器人的运动范围 n = new 机器人的运动范围();
		System.out.println(n.movingCount(4, 3, 4));
	}

}
