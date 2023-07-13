/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yaso
 */

public class Bus {
    private int bus_number;
    private Boolean ac; 
    private int capacity;
    
    Bus(int bs , boolean ac,int cap)
    {
       this.bus_number= bs;
       this.ac=ac;
       this.capacity=cap;
    }
    public int display_busno()
    {
        return this.bus_number;
    }
    public int display_capacity()
    {
        return this.capacity;
    }
    
    public void set_capacity(int cap)
    {
        this.capacity=cap;
    }
    
    public void set_ac(boolean ac)
    {
        this.ac=ac;
    }
    
    public boolean display_ac()
    {
        return this.ac;
    }
    
    public void display_bus_info()
    {
        System.out.println("Bus NUMBER :" + bus_number);
        System.out.println("ac avaliable :" + ac);
        System.out.println("capacity of the bus " + capacity);
    }
}
