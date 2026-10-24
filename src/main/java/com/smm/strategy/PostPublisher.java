package com.smm.strategy;

public class PostPublisher {
    private ContentStrategy strategy;

    public void setStrategy(ContentStrategy strategy) {
        this.strategy = strategy;
    }

    public void publish(Post post) {
        System.out.println(strategy.format(post));
    }
}
