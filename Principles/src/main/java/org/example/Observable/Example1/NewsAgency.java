package org.example.Observable.Example1;


import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Channel{
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    // when state changes NewsAgency Notifies the observers
    public void setNews(String news) {
        this.news = news;
        for (Channel channel: this.channels) {
            channel.update(this.news);
        }
    }

    @Override
    public void update(Object o) {

    }
}
