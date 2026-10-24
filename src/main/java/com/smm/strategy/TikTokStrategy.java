package com.smm.strategy;

public class TikTokStrategy implements ContentStrategy {
    @Override
    public String format(Post post) {
        return "🎬 " + post.getText() + " #fyp #tiktok";
    }
}
