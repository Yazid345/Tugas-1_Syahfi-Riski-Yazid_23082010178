/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.segitigaangkabaris2;
import java.util.Scanner;
public class SegitigaAngkaBaris2 {
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Segitiga Angka Baris");
        System.out.print("Masukkan Angka = ");
        int angka = s.nextInt();
        for(int i = 0; i < angka; i++) {
            for(int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" Baris " + i);
        }
    
    }

}
