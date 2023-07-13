/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author student
 */
public class Booking {
     String passanger_name;
    int bus_no;
    Date date;
    
    Booking()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE BOOKING DETAILS : ");
        System.out.println("ENTER YOUR NAME : ");
        this.passanger_name=scanner.next();
        System.out.println("ENTER BUS NUMBER : ");
        this.bus_no=scanner.nextInt();
        System.out.println("ENTER THE DATE IN DD-MM-YY FORMATE: " );
        String datainput = scanner.next();
        SimpleDateFormat datecon = new SimpleDateFormat("dd-MM-yy");
        
         try {
             this.date = datecon.parse(datainput);
         } catch (ParseException ex) {
             Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    boolean isAvaliable(ArrayList<Booking> bookings , ArrayList<Bus> buses)
    {
        int capacity=0;
        for(Bus b:buses)
        {
            if(b.display_busno() == bus_no)
               capacity=b.display_capacity();
        }
        int booked_count=0;
        
        for(Booking b:bookings)
        {
            if(b.bus_no==bus_no)
                booked_count++;
        }
       return booked_count <capacity;
    }
}
