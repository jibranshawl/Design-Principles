package org.example.Observable.Example1;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        Channel observer = new NewsAgency();

        observable.addObserver(observer);
        observable.setNews("news");
    }
}
