/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.busreservation;

/**
 *
 * @author yasot
 */

public class BUS {
    private int bus_number;
    private Boolean ac; 
    private int capacity;
    
    BUS(int bs , boolean ac,int cap)
    {
       this.bus_number= bs;
       this.ac=ac;
       this.capacity=cap;
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
