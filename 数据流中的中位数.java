package 剑指offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 数据流中的中位数 {
	
	//小顶堆
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	//大顶堆
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			
			return o2-o1;
		}
		
	}); 
	
	public void Insert(Integer num)
	{
		if((minHeap.size()+maxHeap.size())%2==0)
		{
			if(!maxHeap.isEmpty()&&maxHeap.peek()>num)
			{
				maxHeap.add(num);
				num = maxHeap.poll();
			}
			minHeap.add(num);
		}else
		{
			if(!minHeap.isEmpty()&&minHeap.peek()<num)
			{
				minHeap.add(num);
				num = minHeap.poll();
			}
			maxHeap.add(num);
		}
	}
	public Double GetMedian()
	{
		double result;
		if((maxHeap.size()+minHeap.size())%2==0)
		{
			result = (maxHeap.peek()+minHeap.peek())/2.0;
		}else
			result = minHeap.peek();
		return result;
	}
	
	public static void main(String[] args)
	{
		数据流中的中位数 n = new 数据流中的中位数();
		n.Insert(1);
		n.Insert(3);
		n.Insert(7);
		n.Insert(2);
		n.Insert(4);
		n.Insert(6);
		n.Insert(8);
		System.out.println(n.GetMedian());
	}

}
