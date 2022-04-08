package com.example.realestate;

public class Home {

    String name;
    String city;
    int rooms;
    int bathrooms;

    public Home(){}

    public Home(String name, String city, int rooms, int bathrooms){
        this.name = name;
        this.city = city;
        this.rooms = rooms;
        this.bathrooms = bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
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
    public String details(){
        return name + " in " + city + ", with " + rooms + " rooms and " + bathrooms + " bathrooms.";
    }
}
