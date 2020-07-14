package javaActivity33B;

import java.util.*;

public class DoubleQueueExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating double queue
		Deque<String> dqueue = new LinkedList<String>();


        dqueue.add("dhoni");
        dqueue.addFirst("Ganguly");
        dqueue.addLast("Sachin");
        
        dqueue.offer("Yuvi");
        dqueue.offerFirst("Kaif");
        dqueue.offerLast("Rohit");

        //Iterate through the queue elements.
        Iterator<String> iterator = dqueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Peek first: " + dqueue.peekFirst());
        System.out.println("Peek Last: " + dqueue.peekLast());
       
        
        //Search for element
        System.out.println("is Wolf present in the Dqueue: " + dqueue.contains("Wolf"));

        //Remove the first and last element
        dqueue.removeFirst();
        dqueue.removeLast();
        System.out.println("Removing first and last elements: " + dqueue);
        System.out.println("Size of deque: " + dqueue.size());
	

	}

}
