package ru.netology.domain;


import java.util.Date;

public class Post {
    private int idPost;
    private int ownerId;
    private int from_id;
    private int created_by;
    private ImageForPost logo;
    private String namePublic;
    private Date publicationDate;
    private boolean anchor;
    private PostType type;
    private String postText;
    private ImageForPost imageForPost;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private LikesInfo likes;
    private RepostsInfo reposts;
    private Views views;
    private  Geo geo;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean markedAsAds;

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
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

    public LikesInfo getLikes() {
        return likes;
    }

    public void setLikes(LikesInfo likes) {
        this.likes = likes;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public void setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFrom_id() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public PostType getType() {
        return type;
    }

    public void setType(PostType type) {
        this.type = type;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public Views getViews() {
        return views;
    }

    public void setViews(Views views) {
        this.views = views;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }
}
