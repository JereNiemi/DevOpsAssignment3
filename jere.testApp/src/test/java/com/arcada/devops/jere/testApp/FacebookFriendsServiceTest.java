package com.arcada.devops.jere.testApp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class FacebookFriendsServiceTest {

    FacebookFriendsService service = new FacebookFriendsService();

    // Positive Test: Valid profile with friends
    @Test
    public void testValidProfileWithFriends() {
        String[] friends = service.getFriendsList("https://facebook.com/profile123");
        assertArrayEquals(new String[]{"Alice", "Bob", "Charlie"}, friends);
    }

    // Positive Test: Another valid profile with fewer friends
    @Test
    public void testAnotherValidProfileWithFriends() {
        String[] friends = service.getFriendsList("https://facebook.com/profile456");
        assertArrayEquals(new String[]{"Dave", "Eve"}, friends);
    }

    // Negative Test: Invalid profile URL (no friends)
    @Test
    public void testInvalidProfile() {
        String[] friends = service.getFriendsList("https://facebook.com/unknownProfile");
        assertArrayEquals(new String[]{}, friends); // Expecting an empty array
    }

    // Negative Test: Null input
    @Test
    public void testNullProfileUrl() {
        String[] friends = service.getFriendsList(null);
        assertArrayEquals(new String[]{}, friends); // Expecting an empty array
    }

    // Negative Test: Empty string as profile URL
    @Test
    public void testEmptyProfileUrl() {
        String[] friends = service.getFriendsList("");
        assertArrayEquals(new String[]{}, friends); // Expecting an empty array
    }
}