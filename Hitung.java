/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.co.cobacoba.aplikasi_penjualan;

/**
 *
 * @author ACN
 */
public class Hitung {

    public double HitungDiskon (double jumlah , double harga){
   
   if (jumlah >= 25){
   double diskon =  harga*jumlah  * 0.05 ;
   double total = (harga*jumlah)-diskon ;
   System.out.print("Anda Mendapatkan Diskon 5% ");
   return total ;
   
   }else if (jumlah >= 50 ){
    double diskon = harga*jumlah*0.1 ;
    double total = (harga*jumlah)-diskon ;
    System.out.print("Anda Mendapatkan Diskon 10% ");
    return total ;   

   }else{
    double diskon = 0 ;
    double total = (harga*jumlah) - diskon ;
    return total ;
   }    

    }
}
