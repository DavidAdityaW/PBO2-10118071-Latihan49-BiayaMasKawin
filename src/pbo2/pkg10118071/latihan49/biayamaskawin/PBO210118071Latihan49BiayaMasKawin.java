/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan49.biayamaskawin;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     biaya mas kawin
 * 
 */
public class PBO210118071Latihan49BiayaMasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Emas emas = new Emas();
        
        emas.set_berat(15.7);
        emas.set_harga(570000);
        
        System.out.println("Berat emas kawin yang akan dibeli Hendi = " + emas.get_berat());
        System.out.println("Harga emas per gram di bulan Oktober = " + emas.get_harga());
        System.out.println("Total bayar yang harus dibayar Hendi = " + String.format("%.00f",emas.totalHarga(emas.get_harga(), emas.get_berat())));
        
    }
    
}
