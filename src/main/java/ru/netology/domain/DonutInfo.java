package ru.netology.domain;

public class DonutInfo {

    private boolean isDonut; // запись доступна только для платных пользователей
    private int paidDuration; // время, в течении которога, пост будет доступен для платных пользователей
    private boolean placeHolder; // информация о том, что пост доступен только для платных пользователей (отображается для тех, кто не оплатил подписку)
    private boolean canPublishFreeCopy; // возможно ли предоставить запись для всех пользователей
    private String editMode; // информация о том, какие значения можно изменять

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public boolean isPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(boolean placeHolder) {
        this.placeHolder = placeHolder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
