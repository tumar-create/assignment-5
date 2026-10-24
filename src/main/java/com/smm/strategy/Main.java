package com.smm.strategy;

public class Main {
    public static void main(String[] args) {
        Post post = new Post("Our new coffee shop is open!");
        PostPublisher publisher = new PostPublisher();

        publisher.setStrategy(new InstagramStrategy());
        publisher.publish(post);

        publisher.setStrategy(new LinkedInStrategy());
        publisher.publish(post);

        publisher.setStrategy(new TikTokStrategy());
        publisher.publish(post);
    }
}
