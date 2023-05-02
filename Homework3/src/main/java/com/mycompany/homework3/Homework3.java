/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework3;

import java.util.Scanner;

/**
 *
 * @author krivosheevnikolaj
 */
public class Homework3 {

    public static void main(String[] args) {
        System.out.println("Дз 3. Вариант 5. Студент Кривошеев Н.А. Группа РИБО-04-21");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название магазина");
        String name = scanner.next();
        System.out.println("Введите адрес магазина");
        String address = scanner.next();
        System.out.println("Введите число сотрудников");
        int employess = scanner.nextInt();
        System.out.println("Введите количество товаров");
        int inventory = scanner.nextInt();
        Store store = new Store(name, address, employess, inventory);
        System.out.println(store.toString()); 
        Revisor revisor = new Revisor(10000);
        revisor.closeStore(store);
        revisor.rebrand(store);
        System.out.println(store.toString());  
        
    }
}
    

