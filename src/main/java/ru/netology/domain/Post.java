package ru.netology.domain;

public class Post {
    private String id; // id пользователя опубликовавшего пост
    private String name; // имя пользователя опубликовавшего пост
    private String imageAvatarUrl; // аватарка пользователя опубликовавшего пост
    private String dataPost; // дата публикации поста
    private int timePost; // время публикации поста
    private boolean isFavorites; // возможность добавить пост в "избранное"
    private String toShare; // возможность поделиться данным постом
    private int viewsInfo; // количество просмотров поста
    private int postId; // id записи поста
    private int authorId; // id пользователя опубликовавшего пост
    private String textPost; // текст к публикации
    private int replyOwnerId; // идентификатор владельца записи, в ответ на к-ую была опубликована текущая
    private int replyPostId; // идентификатор записи, в ответ на к-ую была опубликована текущая
    private int friendsOnly; // если запись создана с опцией "для друзей" (лучше использовать тип boolean)
    private CommentsInfo commentsInfo; // создание отдельного класса под комментарии к посту
    private CopyrightsInfo copyrightsInfo; // создание отдельного класса для источника материала поста
    private LikesInfo likesInfo; // создание отдельного класса для лайков к посту
    private RepostsInfo repostsInfo; // создание отдельного класса для информации о репостах поста
    private GeoInfo geoInfo; // создание отдельного класса о месторасположении, привязанного к посту
    private int siegnerId; // идентификатор пользователя, если запись опубликована сообществом (группой)
    private int canDelete; // информация о том, можно ли удалить данный пост для текущего пользователя (лучше использовать тип boolean)
    private int canPin; // информация о том, можно ли закрепить данный пост текущий пользователь (лучше использовать тип boolean)
    private int canEdit; // информация о том, можно ли корректировать данный пост для текущего пользователя (лучше использовать тип boolean)
    private int isPinned; // информация о закреплении поста (лучше использовать тип boolean)
    private int markedAsAds; // информация о содержании рекламы в посте (лучше использовать тип boolean)
    private DonutInfo donutInfo; // информация о доступности для платных подписчиках
    private int postponedId; // идентификатор отложенной записи

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageAvatarUrl() {
        return imageAvatarUrl;
    }

    public void setImageAvatarUrl(String imageAvatarUrl) {
        this.imageAvatarUrl = imageAvatarUrl;
    }

    public String getDataPost() {
        return dataPost;
    }

    public void setDataPost(String dataPost) {
        this.dataPost = dataPost;
    }

    public int getTimePost() {
        return timePost;
    }

    public void setTimePost(int timePost) {
        this.timePost = timePost;
    }

    public boolean isFavorites() {
        return isFavorites;
    }

    public void setFavorites(boolean favorites) {
        isFavorites = favorites;
    }

    public String getToShare() {
        return toShare;
    }

    public void setToShare(String toShare) {
        this.toShare = toShare;
    }

    public int getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(int viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
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

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public CopyrightsInfo getCopyrightsInfo() {
        return copyrightsInfo;
    }

    public void setCopyrightsInfo(CopyrightsInfo copyrightsInfo) {
        this.copyrightsInfo = copyrightsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getSiegnerId() {
        return siegnerId;
    }

    public void setSiegnerId(int siegnerId) {
        this.siegnerId = siegnerId;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public DonutInfo getDonutInfo() {
        return donutInfo;
    }

    public void setDonutInfo(DonutInfo donutInfo) {
        this.donutInfo = donutInfo;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
