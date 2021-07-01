package ru.netology.domain;

public class CommentsInfo {

    private int count; // счетчик для комментариев
    private int canPost; // информация о том, может ли текущий пользователь комментировать запись (лучше использовать boolean)
    private int groupsCanPost;  // информация о том, могут ли сообщества комментировать запись (лучше использовать boolean)
    private boolean canClose; // информация о том, может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen; // информация о том, может ли текущий пользователь открыть комментарии к записи

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
