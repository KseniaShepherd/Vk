package ru.netology.domain;


import java.util.Date;

public class Post {
    private int idPost;
    private ImageForPost logo;
    private String namePublic;
    private Date publicationDate;
    private boolean anchor;
    private String postText;
    private ImageForPost imageForPost;
    private boolean like;
    private int likesAmount;
    private boolean repost;
    private int repostsAmount;

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public boolean isRepost() {
        return repost;
    }

    public void setRepost(boolean repost) {
        this.repost = repost;
    }

    public ImageForPost getLogo() {
        return logo;
    }

    public void setLogo(ImageForPost logo) {
        this.logo = logo;
    }

    public String getNamePublic() {
        return namePublic;
    }

    public void setNamePublic(String namePublic) {
        this.namePublic = namePublic;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isAnchor() {
        return anchor;
    }

    public void setAnchor(boolean anchor) {
        this.anchor = anchor;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public ImageForPost getImageForPost() {
        return imageForPost;
    }

    public void setImageForPost(ImageForPost imageForPost) {
        this.imageForPost = imageForPost;
    }

    public int getLikesAmount() {
        return likesAmount;
    }

    public void setLikesAmount(int likesAmount) {
        this.likesAmount = likesAmount;
    }

    public int getRepostsAmount() {
        return repostsAmount;
    }

    public void setRepostsAmount(int repostsAmount) {
        this.repostsAmount = repostsAmount;
    }
}
