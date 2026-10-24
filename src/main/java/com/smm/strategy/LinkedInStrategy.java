package com.smm.strategy;

public class LinkedInStrategy implements ContentStrategy {
    @Override
    public String format(Post post) {
        return post.getText() + "\nWhat do you think? #marketing";
    }
}
