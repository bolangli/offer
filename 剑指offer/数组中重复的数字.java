package ��ָoffer;

public class �������ظ������� {
	
	public boolean duplicate(int numbers[],int length,int[] duplication)
	{
		boolean[] array = new boolean[length];
		for(int i=0;i<length;i++)
		{
			if(array[numbers[i]]==true)
			{
				duplication[0]=numbers[i];
				return true;
			}
			array[numbers[i]]=true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		�������ظ������� n = new �������ظ�������();
		int[] numbers = {2,3,1,0,2,5,3};
		int[] duplication = new int[1];
		System.out.println(n.duplicate(numbers, numbers.length, duplication));
	}

}
