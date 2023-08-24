
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package id.co.cobacoba.aplikasi_penjualan;

import java.util.Scanner;

/**
 *
 * @author ACN
 */
public class Depan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner (System.in);
        Barang brg = new Barang ();
        Hitung htg = new Hitung () ;
        String nama ;
        double  jumlah , harga ;
        
        //INPUT USER
        
        System.out.println("Masukan Nama Barang : ");
        nama = input.nextLine();
        brg.namaBarang(nama);
        
        System.out.println("Masukan Harga Barang : ");
        harga = input.nextDouble();
        brg.hargaBarang(0);
        
        System.out.println("Masukan Jumlah Barang : ");
        jumlah = input.nextDouble();
        brg.jumlahBarang(0);
        
        
          
        //Struk
        System.out.println("------------------STRUK--------------------");
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("jumlah : " + jumlah);
        System.out.println("Total : " + htg.HitungDiskon(jumlah, harga));
        
        System.out.println("-------------------------------------------");
        
    }
    
}
