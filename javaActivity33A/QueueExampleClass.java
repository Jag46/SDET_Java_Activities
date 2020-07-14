package javaActivity33A;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Queue
		Queue<Integer> queue = new LinkedList<>();

        for (int i=0;i<5;i++) {
        	queue.add(i);
        }
 
        System.out.println("Elements in queue: " + queue);

        int objectRemoved = queue.remove();
        System.out.println("Removed Object from the Queue: " + objectRemoved);

        
        int headQueue = queue.peek();
        System.out.println("Head of queue: " + headQueue);

        int queueSize = queue.size();
        System.out.println("Size of queue: " + queueSize);	

		        
	}

}
