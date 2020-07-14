package javaActivity32;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating new HashSet
		HashSet<String> hs = new HashSet<String>();
        
        hs.add("Jag");
        hs.add("Kiran");
        hs.add("Jo");
        hs.add("Sabari");
        hs.add("Chandu");
        hs.add("Komala");
        
        System.out.println("Objects in HashSet: " +hs);        
        System.out.println("Size of HashSet: " + hs.size());
        
        System.out.println("Removing Kiran from HashSet: " + hs.remove("Kiran"));
        
        if(hs.remove("Muki")) {
        	System.out.println("Muki removed from the Set");
        } else {
        	System.out.println("Muki is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if Kiran is present: " + hs.contains("Kiran"));
        
        System.out.println("Updated HashSet: " + hs);
    }	


}
