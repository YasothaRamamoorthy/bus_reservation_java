/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busreservation;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author yasot
 */
public class Busreservation {

    public static void main(String[] args) {
        ArrayList<BUS> buses = new ArrayList<BUS>();
        
        buses.add(new BUS(121,true,20));
        buses.add(new BUS(121,true,20));
        buses.add(new BUS(121,true,20));    
        
        
        for(BUS b : buses)
        {
            b.display_bus_info();
        }
        
        int booking=1;
        Scanner scanner = new Scanner(System.in);
        while(booking==1)
        {
            System.out.println("If You want to book the seats enter 1 else enter 2 for exit : ");
            booking = scanner.nextInt();
            if(booking == 1)
            {
                System.out.println("Booking ...");
            }
        }
    }
}
