package behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Jose");

        newsAgency.registerObserver(user1);
        newsAgency.registerObserver(user2);
        newsAgency.registerObserver(user3);

        newsAgency.setNews("Breaking News: Observer Pattern in Java!");
    }
}
