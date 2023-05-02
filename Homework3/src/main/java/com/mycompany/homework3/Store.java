/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework3;

/**
 *
 * @author krivosheevnikolaj
 */
public class Store {
    private String name;
    private String address;
    private int employess;
    private int inventory;
 
    public Store(String name, String address, int employess, int inventory) {
        this.name = name;
        this.address = address;
        this.employess = employess;
        this.inventory = inventory;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addInventory(int amount){
        this.inventory += amount;
    }
    
    public void removeInventory(int amount){
        this.inventory -= amount;
    }


    public String getAddress() {
        return address;
    }

    public int getEmployess() {
        return employess;
    }

    public int getInventory() {
        return inventory;
    }
    
    @Override
    public String toString(){
        return "name = " + this.name + ", address = " + this.address + ", employess =  "
                + this.employess + ", inventory" + this.inventory;
    }
}
    

