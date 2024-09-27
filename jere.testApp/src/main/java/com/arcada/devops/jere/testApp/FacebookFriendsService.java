package com.arcada.devops.jere.testApp;


public class FacebookFriendsService {
	
	
	
	public String[] getFriendsList(String profileUrl) {
	    if (profileUrl == null || profileUrl.isEmpty()) {
	        return new String[0]; // Return an empty array if null or empty string
	    }

	    // Hardcoded mock profiles
	    if (profileUrl.equals("https://facebook.com/profile123")) {
	        return new String[]{"Alice", "Bob", "Charlie"};
	    } else if (profileUrl.equals("https://facebook.com/profile456")) {
	        return new String[]{"Dave", "Eve"};
	    } else {
	        return new String[0]; // No friends for invalid or unknown profiles
	    }
	}
}
