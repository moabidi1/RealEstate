package com.example.realestate;

import java.util.ArrayList;

public class House extends Home {
    public House(){};
    public String details(){
        return "House: " + name + " in " + city + ", with " + rooms + " rooms and " + bathrooms + " bathrooms.";
    }
}
