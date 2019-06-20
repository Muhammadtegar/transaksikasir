/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tegar
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class panew {

    static void hitungkembalian(double total, int bayar) {
        System.out.println("Kembalian : Rp." + (bayar - total) + ",-");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));

        String[] makanan1 = {"Nasi Goreng", "Ayam Geprek", "Ikan Bakar", "Nasi Uduk", "Bakmi"};
        int[] harga_makanan1 = {15000, 12000, 20000, 15000, 15000};
        String[] minuman1 = {"Es Teh", "Es Jeruk", "Es Telur", "Es Mega Mendung", "Soda Gembira"};
        int[] harga_minuman1 = {4000, 4000, 9000, 10000, 10000};

        int i = 1;
        String keputusan = "Y";
        int jumlah = 0;
        int[] sub_harga_makanan = new int[i];
        int[] sub_harga_minuman = new int[i];
        int[] index_makanan = new int[i];
        int[] index_minuman = new int[i];

        int total_makanan = 0;
        int total_minuman = 0;
        double harga_total = 0;
        int uang = 0;

        String member = null;

        System.out.println("--------------------------------------------------------");
        System.out.println("No.      MENU             Harga");
        for (int in = 0; in < makanan1.length; in++) {
            System.out.println((in + 1) + ". \t" + makanan1[in] + "\tRp. " + harga_makanan1[in] + ",-");
        }
        System.out.println("\n---------------------------------------------------------");

        System.out.println("--------------------------------------------------------");
        System.out.println("No.      MENU             Harga");
        for (int in = 0; in < minuman1.length; in++) {
            System.out.println((in + 1) + ". \t" + minuman1[in] + "\tRp. " + harga_minuman1[in] + ",-");
        }
        System.out.println("\n---------------------------------------------------------");

        while (keputusan.equals("Y") || keputusan.equals("y")) {
            System.out.print("Masukkan Nomor Pesanan makanan : ");
            int pilihanMakanan = scan.nextInt();

            if (pilihanMakanan > makanan1.length) {
                System.out.println("Menu yang anda pesan kosong");
            }

            System.out.println("makanan yang anda pesan : " + makanan1[pilihanMakanan - 1]);
            System.out.print("Jumlah pesanan : ");
            int jumlahmakanan = scan.nextInt();
            total_makanan = harga_makanan1[pilihanMakanan - 1] * jumlahmakanan;
            System.out.println("total = " + total_makanan);
            index_makanan[i - 1] = pilihanMakanan - 1;

            System.out.print("Masukkan Nomor Pesanan minuman : ");
            int pilihanMinuman = scan.nextInt();

            if (pilihanMinuman > minuman1.length) {
                System.out.println("Menu yang anda pesan kosong");
            }

            System.out.println("minuman yang anda pesan : " + minuman1[pilihanMinuman - 1]);
            System.out.print("Jumlah pesanan : ");
            int jumlahminuman = scan.nextInt();
            total_minuman = harga_minuman1[pilihanMinuman - 1] * jumlahminuman;
            System.out.println("total = " + total_minuman);
            index_minuman[i - 1] = pilihanMinuman - 1;

//            harga_total = total_makanan + total_minuman;
//            System.out.println("Total belanja anda sebesar : Rp. " + harga_total + " ;");
            System.out.println("Apakah anda ingin order lagi ? Y/N : ");
            try {
                keputusan = input2.readLine();
            } catch (IOException e) {
                System.out.println("Failed to Read Keyboard");
            }
            i++;

            System.out.println("List Pesanan anda saat ini : ");

            for (int a = 0; a < i; a++) {
                System.out.println((a + 1) + " " + makanan1[pilihanMakanan - 1] + "\tRp." + total_makanan);
                System.out.println((a + 1) + " " + minuman1[pilihanMinuman - 1] + "\tRp." + total_minuman);
            }

        }

        System.out.println("---------------------------------------------------------");

        System.out.println("Total pembayaran sebesar " + harga_total + ".");
        System.out.println("Ada Member ? ");
        try {
            member = input2.readLine();
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
        if (member.equals("y") || member.equals("Y")) {
            harga_total = harga_total - (harga_total * 0.1);
            System.out.println("Total pembayaran sebesar " + harga_total + ".");
            System.out.print("Uang yang dibayarkan : ");
            uang = scan.nextInt();
            System.out.println("--------------------------------------------------------");
            if (uang < harga_total) {
                System.out.println("Maaf uang anda tidak cukup");
            } else {
                System.out.println("Uang anda : Rp." + uang + ",-");
                hitungkembalian(harga_total, uang);

            }
        } else if (member.equals("n") || member.equals("N")) {
            System.out.println("Total pembayaran sebesar " + harga_total + ".");
            System.out.print("Uang yang dibayarkan : ");
            uang = scan.nextInt();
            System.out.println("--------------------------------------------------------");
            if (uang < harga_total) {
                System.out.println("Maaf uang anda tidak cukup");
            } else {
                System.out.println("Uang anda : Rp." + uang + ",-");
                hitungkembalian(harga_total, uang);
            }

        }

    }
}
