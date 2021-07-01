package ru.netology.domain;

public class LikesInfo {

    private int counter; // счетчик "лайков"
    private int userLikes; // отметка "Нравится" от пользователей (лучше использовать boolean)
    private int canLike; // информация о том, может ли пользователь нажать кнопку "Нравится" (лучше использовать boolean)
    private int canPublish; // информация о том, может ли пользователь сделать репост данной записи (лучше использовать boolean)

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
