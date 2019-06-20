


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tegar
 */
import javax.swing.JOptionPane;
public class Transaksi {
    public static void main(String[] args) {
        double hargamakanan = 0;
        double jumlahmakanan = 0;
        double jumlahbayar = 0;
        double kembalian;
        double subtotal;
        
       
        
        hargamakanan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Makanan (Rp.)"));
        jumlahmakanan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Makanan (Rp.)"));
        
        jumlahbayar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Bayar (Rp.)"));
        
        subtotal = hargamakanan*jumlahmakanan;
        
        kembalian = jumlahbayar - subtotal;
        
        System.out.println("Subtotal = Rp."+subtotal);
        
        System.out.println("kembalian = Rp."+kembalian);
        
    }

}
