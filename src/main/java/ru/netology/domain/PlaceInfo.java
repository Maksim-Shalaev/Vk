package ru.netology.domain;

public class PlaceInfo {

    private int id; // идентификатор места
    private String title; // название места
    private int latitude; // географическая широта в градусах
    private int longitude; // географическая долгота в градусах
    private int created; // дата создания отметки о данном месте
    private String icon; // иконка данного места
    private int checkins; // количество отметок в данном месте
    private int updated; // дата обновления места
    private int type;  // тип места (можно использовать String c указанием типа места)
    private int country; // идентификатор страны (можно использовать String c указанием названия страны)
    private int city; // идентификатор города (можно использовать String c указанием названия города)
    private String adress; // адрес места

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getCheckins() {
        return checkins;
    }

    public void setCheckins(int checkins) {
        this.checkins = checkins;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
