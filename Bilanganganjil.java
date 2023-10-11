/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bilanganganjil;
import java.util.Scanner;
public class Bilanganganjil {
    public static void main(String[] args) {
       int a;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Angka Maksimal = ");
        a=keyboard.nextInt();
      
        
        int i=1;
        do {
                System.out.print(i + " ");
                i += 2;
            }while (i<a);
        }   
}
