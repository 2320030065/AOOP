

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String article) {
        System.out.println(name + " received notification for new article: " + article);
    }

    public String getName() {
        return name;
    }
}
