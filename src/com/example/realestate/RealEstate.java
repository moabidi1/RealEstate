package com.example.realestate;
import java.io.*;
import java.util.*;

public class RealEstate {

    public static void main(String[] args) {


        Home first = new Home();
        Apartment one = new Apartment();

        first.setRooms(3);
        first.setBathrooms(2);

        System.out.println("First home has " + first.getRooms() + " rooms and " + first.getBathrooms() + " bathrooms.");

        ArrayList<Home> homes = new ArrayList<>();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Would you like to purchase this home?");
        try {
            if (in.readLine().equals("Yes")){
                System.out.println(first.purchaseHome());
            }
            else{
                System.out.println("Lets look at other homes.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
