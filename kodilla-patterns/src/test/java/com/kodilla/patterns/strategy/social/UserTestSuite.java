package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User mariusz = new Millenials("Mariusz");
        User zosia = new YGeneration("Zosia");
        User kasia = new ZGeneration("Kasia");

        //When
        String mariuszSharePost = mariusz.sharePost();
        String zosiaSharePost = zosia.sharePost();
        String kasiaSharePost = kasia.sharePost();

        //Then
        assertEquals("Facebook", mariuszSharePost);
        assertEquals("Snapchat", zosiaSharePost);
        assertEquals("Twitter", kasiaSharePost);
    }

    @Test
    void testIndividualSharingStrategy() {
        User mariusz = new Millenials("Mariusz");

        mariusz.setSocialPublisher(new TwitterPublisher());
        String mariuszSharePost = mariusz.sharePost();

        assertEquals("Twitter", mariuszSharePost);
    }
}
