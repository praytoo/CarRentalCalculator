package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("What day do you want to pick up the car?");
        String pickupdate = scanner.nextLine();
        System.out.println("How many days do you need the car for?");
        int nrdays = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you want an electric toll tag @ $3.95/day yes/no");
        String tolltagstr = scanner.nextLine();
        boolean tolltag = tolltagstr.equals("yes") ? true : false;
        System.out.println("Do you want a GPS @ $2.95/day yes/no");
        String GPSstr = scanner.nextLine();
        boolean GPS = GPSstr.equals("yes") ? true : false;
        System.out.println("Do you want roadside assistance @ $3.95/day yes/no");
        String roadsideassiststr = scanner.nextLine();
        boolean roadsideassist = roadsideassiststr.equals("yes") ? true : false;
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 25){
            System.out.println("30% surcharge applied");
        }
        double baseprice = (29.99 * nrdays) + ((tolltag ? 3.95 : 0) * nrdays) + ((GPS ? 2.95 : 0) * nrdays) + (( roadsideassist ? 3.95 : 0) * nrdays) + ( age < 25 ? 29.99 * .3 * nrdays : 0);
        System.out.println("Your total is:" + " " + "$" + baseprice);

    }
}
