package ru.netology.domain;

public class CopyrightsInfo {

    private int id; // идентификатор объекта поста
    private String link; // ссылка на внешний источник внутри поста
    private String name; // название поста
    private String type; // тип объекта

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
