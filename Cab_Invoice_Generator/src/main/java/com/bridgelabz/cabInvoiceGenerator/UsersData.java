package com.bridgelabz.cabInvoiceGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author - Shreyash Jadhav
 */
public class UsersData {
    public static HashMap<String , List<Ride>> rideLists = new HashMap<>();

    public static void getData() {

        ArrayList<Ride> user1Rides = new ArrayList<>();

        Ride ride1 = new Ride("Premium", 0.5, 5);
        Ride ride2 = new Ride("Normal", 4, 8);
        Ride ride3 = new Ride("Premium", 8, 16);
        Ride ride4 = new Ride("Normal", 0.2, 2);

        user1Rides.add(ride1);
        user1Rides.add(ride2);
        user1Rides.add(ride3);
        user1Rides.add(ride4);

        rideLists.put("user1", user1Rides);

        ArrayList<Ride> user2Rides = new ArrayList<>();

        Ride ride5 = new Ride("Normal", 5, 10);
        Ride ride6 = new Ride("Premium", 7, 14);
        Ride ride7 = new Ride("Normal", 0.1, 2);

        user2Rides.add(ride5);
        user2Rides.add(ride6);
        user2Rides.add(ride7);

        rideLists.put("user2", user2Rides);
    }
}
