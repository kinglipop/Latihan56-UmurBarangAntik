/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan56.umurbarangantik;

/**
 *
 * @author Firman Alfinas
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk menghitung umur barang antik
 */
public class PBO11K10118904Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama barang Antik : "+r.getName());
        r.tampilUmur();
    }
    
}
