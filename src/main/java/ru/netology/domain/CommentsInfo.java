package ru.netology.domain;

import java.util.ArrayList;

public class CommentsInfo {
    private int countComments;
    ArrayList comments;


    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public ArrayList getComments() {
        return comments;
    }

    public void setComments(ArrayList comments) {
        this.comments = comments;
    }
}
