/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservation;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author yaso
 */
public class BusReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Bus> buses = new ArrayList<Bus>();
        
        buses.add(new Bus(121,true,2));
        buses.add(new Bus(122,true,3));
        buses.add(new Bus(123,true,2)); 
        
        
        for(Bus b : buses)
        {
            b.display_bus_info();
        }
        
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        
        int book=1;
        Scanner scanner = new Scanner(System.in);
        while(book==1)
        {
            System.out.println("If You want to book the seats enter 1 else enter 2 for exit : ");
            book = scanner.nextInt();
            if(book == 1)
            {
                Booking booking = new Booking();
                if(booking.isAvaliable(bookings,buses))
                {
                    bookings.add(booking);
                    System.out.println("BOOKING IS SUCESSFUL");
                }
                else
                    System.out.println("SOORY , TRY ANOTHER BUS FOR BOOKING SEAT ARE FULL");
            }
        }
    }
    }
    

