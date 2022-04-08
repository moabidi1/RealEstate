package com.example.realestate;

import java.util.ArrayList;

public class Apartment extends Home{

    public Apartment(){};
    public String details(){
        return "Apartment: " + name + " in " + city + ", with " + rooms + " rooms and " + bathrooms + " bathrooms.";
    }
}
