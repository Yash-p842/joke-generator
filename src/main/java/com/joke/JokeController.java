package com.joke;

public class JokeController {
    public static void main(String[] args) {
        JokeService service = new JokeService();
        System.out.println("Here's a random joke: " + service.getRandomJoke());
    }
}
