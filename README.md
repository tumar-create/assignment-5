# SMM Post Formatter

A small Java example of the Strategy pattern. It formats the same post for Instagram, LinkedIn, and TikTok.

## Run

```bash
mkdir -p out
javac -d out src/main/java/com/smm/strategy/*.java
java -cp out com.smm.strategy.Main
```

## Classes

- `ContentStrategy` is the shared interface.
- `InstagramStrategy`, `LinkedInStrategy`, and `TikTokStrategy` format the post for each platform.
- `PostPublisher` uses the selected strategy and can switch it while running.
- `Main` creates a post and tries all three strategies.

## Clean Code examples

1. Classes and methods have clear names.
2. Each strategy has one job.
3. The publisher uses an interface instead of checking platform names.
4. Platform formatting is kept inside each strategy.
5. A new strategy can be added without changing the publisher.

