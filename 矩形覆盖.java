package ½£Ö¸offer;

public class ¾ØÐÎ¸²¸Ç {
	
	public int RectCover(int target)
	{
		if(target<=0)
		{
			return 0;
		}
		if(target==1)
		{
			return 1;
		}
		if(target==2)
		{
			return 2;
		}
		return RectCover(target-1)+RectCover(target-2);
	}
	public static void main(String[] args)
	{
		¾ØÐÎ¸²¸Ç n=new ¾ØÐÎ¸²¸Ç();
		System.out.println(n.RectCover(6));
	}

}
