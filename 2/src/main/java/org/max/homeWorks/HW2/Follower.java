package org.max.homeWorks.HW2;

public class Follower {

    private String nameF;

    public Follower(String nameF, NewsChanel newsChanel) {
        this.nameF = nameF;
        newsChanel.addFollowers(this);
    }

    public void newsletter(String sms) {
        System.out.printf("%s получил новость: %s\n", nameF, sms);
    }
}
