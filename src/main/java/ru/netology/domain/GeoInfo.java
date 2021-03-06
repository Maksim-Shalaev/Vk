package ru.netology.domain;

public class GeoInfo {

    private String type; // информация о типе места
    private String coordinates; // информация о координатах места
    private PlaceInfo placeInfo; // подробное описание места

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public PlaceInfo getPlaceInfo() {
        return placeInfo;
    }

    public void setPlaceInfo(PlaceInfo placeInfo) {
        this.placeInfo = placeInfo;
    }
}
