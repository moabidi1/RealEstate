package com.example.realestate;
import java.io.*;
import java.util.*;

public class RealEstate {

    public static void main(String[] args) {


        Home first = new House();
        Apartment one = new Apartment();

        first.setRooms(3);
        first.setBathrooms(2);
        first.setCity("LA");
        first.setName("BroadWay");

        one.setRooms(2);
        one.setBathrooms(1);
        one.setCity("Rancho");
        one.setName("Parkview");


        ArrayList<Home> homes = new ArrayList<>();
        homes.add(first);
        homes.add (one);

        for (Home h : homes){
            System.out.println(homes.indexOf(h) + ". " + h.details());
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Are you a buyer or realtor?");{
            try {
                if (in.readLine().equals("buyer")){
                    System.out.println("First home has " + first.getRooms() + " rooms and " + first.getBathrooms() + " bathrooms.");
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
                else if (in.readLine().equals("realtor")){
                    System.out.println("Update Listings");
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
