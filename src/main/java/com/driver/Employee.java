package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	  private String name;
	    private List<Gift> gifts=new ArrayList<>();


	    public Employee(String name) {
	       // your code goes here
			this.name=name;
	    }

	    public void receiveGift(Gift gift) {
	    	// your code goes here
			gifts.add(gift);
	    }

	    public String getName() {
	    	// your code goes here
	        return name;
	    }
	    
	    public List<Gift> getGifts() {
	    	// your code goes here
	        return gifts;
	    }
}
