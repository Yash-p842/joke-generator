package com.joke;

import java.util.Random;

public class JokeService {
    private static final String[] jokes = {
        "Why don't scientists trust atoms? Because they make up everything!",
        "I'm reading a book about anti-gravity. It's impossible to put down!",
        "What did the zero say to the eight? Nice belt!"
    };

    public String getRandomJoke() {
        Random rand = new Random();
        return jokes[rand.nextInt(jokes.length)];
    }
}
