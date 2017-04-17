package S5_17_4.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
			PriorityQueue q=new PriorityQueue(15,new MyComparator());
			q.offer("A");
			q.offer("Z");
			q.offer("L");
			q.offer("B");
			System.out.println(q);//[Z,L,B,A]
	}

}
