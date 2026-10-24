package com.smm.strategy;

public class InstagramStrategy implements ContentStrategy {
    @Override
    public String format(Post post) {
        return post.getText() + " #instagram #socialmedia";
    }
}
