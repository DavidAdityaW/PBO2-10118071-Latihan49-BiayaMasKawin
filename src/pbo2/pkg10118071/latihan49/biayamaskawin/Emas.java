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
public class Emas {
    
    private double berat;
    private int harga;
    
    public void set_harga(int harga) {
        this.harga = harga;
    }
    
    public int get_harga() {
        return harga;
    }
    
    public void set_berat(double berat) {
        this.berat = berat;
    }
    
    public double get_berat() {
        return berat;
    }
    
    public double totalHarga(int harga, double berat) {
        return harga * berat;
    }
    
}
