
import java.util.ArrayList;
import java.util.List;

public class NewsFeed {
    private List<Subscriber> subscribers;
    private List<String> articles;

    public NewsFeed() {
        this.subscribers = new ArrayList<>();
        this.articles = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void publishArticle(String article) {
        this.articles.add(article);
        notifySubscribers(article);
    }

    private void notifySubscribers(String article) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(article);
        }
    }

    public List<String> getArticles() {
        return articles;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }
}
