

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewsFeedTest {

    private NewsFeed newsFeed;
    private Subscriber subscriber1;
    private Subscriber subscriber2;

    @BeforeEach
    void setUp() {
        newsFeed = new NewsFeed();
        subscriber1 = new Subscriber("Alice");
        subscriber2 = new Subscriber("Bob");
    }

    @Test
    void testSubscribe() {
        newsFeed.subscribe(subscriber1);
        assertTrue(newsFeed.getSubscribers().contains(subscriber1));
    }

    @Test
    void testUnsubscribe() {
        newsFeed.subscribe(subscriber1);
        newsFeed.unsubscribe(subscriber1);
        assertFalse(newsFeed.getSubscribers().contains(subscriber1));
    }

    @Test
    void testPublishArticleAndNotifySubscribers() {
        newsFeed.subscribe(subscriber1);
        newsFeed.subscribe(subscriber2);

        newsFeed.publishArticle("Breaking News: Java is awesome!");

        assertEquals(1, newsFeed.getArticles().size());
        assertTrue(newsFeed.getArticles().contains("Breaking News: Java is awesome!"));
    }
}
