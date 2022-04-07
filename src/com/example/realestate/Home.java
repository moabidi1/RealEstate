package com.example.realestate;

public class Home {
    int rooms;
    int bathrooms;

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public int getRooms() {
        return rooms;
    }
    public int getBathrooms() {
        return bathrooms;
    }

    public String purchaseHome(){
        return "Congratulations! You have purchased this home.";
    }
}
