package com.joke;

import org.junit.Test;
import static org.junit.Assert.*;

public class JokeServiceTest {

    @Test
    public void testGetRandomJokeNotNull() {
        JokeService service = new JokeService();
        String joke = service.getRandomJoke();
        assertNotNull(joke);
    }

    @Test
    public void testGetRandomJokeLength() {
        JokeService service = new JokeService();
        String joke = service.getRandomJoke();
        assertTrue(joke.length() > 0);
    }
}
