package com.steedup.qa.models;

public class SearchHotel {

    private String location;
    private String checkout;

    private String checkin;
    private String rooms;
    private String adults;
    private String children;

    public String getLocation() {
        return location;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public String getRooms() {
        return rooms;
    }

    public String getAdults() {
        return adults;
    }

    public String getChildren() {
        return children;
    }

    public SearchHotel(String location,  String checkout, String checkin, String rooms, String adults, String children) {
        this.location = location;
        this.checkout=checkout;
        this.checkin=checkin;
        this.rooms=rooms;
        this.adults=adults;
        this.children=children;

    }

}
