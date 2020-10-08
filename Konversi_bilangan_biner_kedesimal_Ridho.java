/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author Ridho
 */
public class Konversi_bilangan_biner_kedesimal {
    public static void main(String args[]){ // Main class
int i,hasil = 0; // deklarasi Variabel
int array [] = {1,1,0,1,1,0,1,0,1};  // deklarasi variabel

System.out.print("Bilangan Biner : "); // keterangan     
for (i = 0; i<array.length;i++){  // perulangan rumus
    System.out.print(array[i]);    // untuk menampilka bilangan biner
}
System.out.print("\nHasil Konversi Dari Biner ke desimal ");  // keterangan
for (i = 0; i<array.length;i++){   // perulangan untuk mengkonversi bilangan 
    
    hasil = array[i] + (hasil*2); // rumus yang di looping untuk konversi bilangan
}      
        System.out.println(hasil); // untuk menampilkan hasil konversi  bilangan
}
    }