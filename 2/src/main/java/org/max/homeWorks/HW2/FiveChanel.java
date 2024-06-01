package org.max.homeWorks.HW2;

import java.util.ArrayList;
import java.util.List;

public class FiveChanel implements NewsChanel {

    private List<Follower> followersList;
    private String textNews;

    public FiveChanel() {
        followersList = new ArrayList<>();
    }

    public void setNews(String textNews) {
        this.textNews = textNews;
        sendNewsFollowers();
    }

    @Override
    public void addFollowers(Follower followers) {
        followersList.add(followers);
    }

    @Override
    public void removeFollowers(Follower followers) {
        followersList.remove(followers);
    }

    @Override
    public void sendNewsFollowers() {
        for (Follower follower : followersList)
            follower.newsletter(textNews);
    }

    public List<Follower> getFollowersList() {
        return followersList;
    }

    public String getTextNews() {
        return textNews;
    }
}
