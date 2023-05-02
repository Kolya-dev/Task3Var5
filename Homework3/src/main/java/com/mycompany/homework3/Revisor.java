/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework3;

/**
 *
 * @author krivosheevnikolaj
 */
public class Revisor {
    private int salary;

    public Revisor(int salary) {
        this.salary = salary;
    }
    
    public void closeStore(Store store){
        if(store.getName().equals("IKEA")){         
            store.setName(null);
        }
    }
    
    public void rebrand(Store store){
        if(store.getName() != null && store.getName().equals("MacDonalds")){         
            store.setName("Вкусно и точка");
        }
        else{
            if(store.getName() != null) {
            String newName = store.getName();
            newName = newName.substring(1);
            store.setName(newName);
            }
        }
    }
    
}
