/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bilanganganjil;

/**
 *
 * @author syahf
 */
import java.util.Scanner;
public class for1 {
    public static void main(String[] args) {
       int a;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Angka Maksimal = ");
        a=keyboard.nextInt();
        
        for(int i=1; i <= a; i += 2){
            System.out.print( i + " " );
        }
    }
}
