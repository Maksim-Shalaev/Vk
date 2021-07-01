package ru.netology.domain;

public class RepostsInfo {

    private int counter; // счетчик "поделившихся" записью
    private int userReposted; // наличие репоста для текущего пользователя (лучше использовать boolean)

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}
