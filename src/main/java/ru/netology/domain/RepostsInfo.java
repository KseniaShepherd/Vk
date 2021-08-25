package ru.netology.domain;

public class RepostsInfo {
    private boolean repost;
    private int repostsAmount;

    public boolean isRepost() {
        return repost;
    }

    public void setRepost(boolean repost) {
        this.repost = repost;
    }

    public int getRepostsAmount() {
        return repostsAmount;
    }

    public void setRepostsAmount(int repostsAmount) {
        this.repostsAmount = repostsAmount;
    }
}
