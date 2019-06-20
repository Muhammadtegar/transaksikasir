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

public class neww  {

    static void hitungkembalian(double total, int bayar) {
        System.out.println("Kembalian : Rp." + (bayar - total) + ",-");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        String[] makanan = new String[100];
        String[] minuman = new String[100];
        int[] harga_makanan = new int[100];
        int[] harga_minuman = new int[100];
        String keputusan = "Y";
        int jumlah = 0;
        double harga_total = 0;
        int uang = 0;
        int[] total = new int[10];
        String member = "";

        System.out.println("--------------------------------------------------------");
        System.out.println("No.      MENU             Harga");
        System.out.println("1.   Nasi Goreng       Rp.15000,-");
        System.out.println("2.   Ayam Geprek       Rp.12000,-");
        System.out.println("3.   Ikan Bakar        Rp.20000,-");
        System.out.println("4.   Nasi Uduk         Rp.15.000,-");
        System.out.println("5.   Bakmi             Rp.15.000,-");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------");

        System.out.println("---------------------------------------------------------");

        System.out.println("No.      MENU             Harga");
        System.out.println("1.   Es Teh             Rp.4000,-");
        System.out.println("2.   Es Jeruk           Rp.4000,-");
        System.out.println("3.   Es teler           Rp.9000,-");
        System.out.println("4.   Es Mega Mendung    Rp.10.000,-");
        System.out.println("5.   Soda Gembira       Rp.10.000,-");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------");

        while (keputusan.equals("Y") || keputusan.equals("y")) {
            System.out.print("Masukkan Nomor Pesanan makanan : ");
            int pil = scan.nextInt();

            switch (pil) {
                case 1:
                    makanan[i] = "Nasi Goreng";
                    harga_makanan[i] = 15000;
                    break;
                case 2:
                    makanan[i] = "Ayam Geprek";
                    harga_makanan[i] = 12000;
                    break;
                case 3:
                    makanan[i] = "Ikan Bakar";
                    harga_makanan[i] = 20000;
                    break;
                case 4:
                    makanan[i] = "Nasi Uduk";
                    harga_makanan[i] = 15000;
                    break;
                case 5:
                    makanan[i] = "Bakmi";
                    harga_makanan[i] = 15000;
                    break;
                case 6:
                default:
                    System.out.println("Menu yang anda pesan kosong");
                    break;
            }
            for (int k = pil; k < 6; k++) {
                System.out.println("makanan yang anda pesan : " + makanan[i]);
                System.out.print("Jumlah pesanan : ");
                int jumlahmakanan = scan.nextInt();
                harga_makanan[i] = harga_makanan[i] * jumlahmakanan;
                System.out.println("total = " + harga_makanan[i]);
                break;
            }

            System.out.println(" ");
            System.out.print("Masukan Nomor Pesanan Minuman : ");
            int pil2 = scan.nextInt();
            switch (pil2) {
                case 1:
                    minuman[i] = "Es Teh";
                    harga_minuman[i] = 4000;
                    break;
                case 2:
                    minuman[i] = "Es Jeruk";
                    harga_minuman[i] = 4000;
                    break;
                case 3:
                    minuman[i] = "Es Teler";
                    harga_minuman[i] = 9000;
                    break;
                case 4:
                    minuman[i] = "Es Mega Mendung";
                    harga_minuman[i] = 10000;
                    break;
                case 5:
                    minuman[i] = "Soda Gembira";
                    harga_minuman[i] = 10000;
                    break;
                case 6:
                default:
                    System.out.println("Menu yang anda pesan kosong");
                    break;
            }
            for (int j = pil2; j < 6; j++) {
                System.out.println("Minuman yang anda pesan : " + minuman[i]);
                System.out.print("Jumlah pesanan : ");
                int jumlahminuman = scan.nextInt();
                harga_minuman[i] = harga_minuman[i] * jumlahminuman;
                System.out.println("total = " + harga_minuman[i]);
                break;
            }
            System.out.println("");
            int totalmakanan = 0;
            int totalminuman = 0;
            total[i] = harga_makanan[i] + harga_minuman[i];
            System.out.println("Total belanja anda sebesar : Rp. " + total[i] + " ;");

            System.out.println("Apakah anda ingin order lagi ? Y/N : ");
            try {
                keputusan = input2.readLine();
            } catch (IOException e) {
                System.out.println("Failed to Read Keyboard");
            }
            
            i++;
            System.out.println("List Pesanan anda saat ini : ");

            for (int a = 0; a < i; a++) {
                System.out.println(makanan[a] + "\t "+ harga_makanan[a]);
            }
            for (int b = 0; b < i; b++) {
                System.out.println(minuman[b] + "\t\t " + harga_minuman[b]);
            }

        }

        System.out.println("---------------------------------------------------------");

        for (int c = 0; c < total.length; c++) {
                harga_total = harga_total + total[c];
            }
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

