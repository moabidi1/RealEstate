package com.example.realestate;
import java.io.*;
import java.util.*;

public class RealEstate {

    public static void main(String[] args) {

        ArrayList<String> houses = new ArrayList<>();

        houses.add("Bistro");
        houses.add("Admirals");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Add houses, enter 'Done' to finish.");

        try {
            while(true){
                String house = in.readLine();
                if (house.equals("Done")){
                    break;
                }
                else{
                    houses.add(house);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("These are the houses: " + houses);

    }
}
