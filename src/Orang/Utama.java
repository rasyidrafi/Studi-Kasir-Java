/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orang;
import java.util.Scanner;

/**
 *
 * @author Rasyid Rafi
 */
public class Utama {
    static int pilihan;
    
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("***  SISTEM STUDI BUKU                ***");
        System.out.println("***  versi 1.0                        ***");
        System.out.println("***  Made by                          ***");
        System.out.println("***  Muhammad Rasyid Rafi'i(13)       ***");
        System.out.println("***  Silfi Nazarina(28)               ***");
        System.out.println("***  Wildan Arindra Ramadhan(33)      ***");
        System.out.println("***  Yuanda Pradya Febrianif(35)      ***");
        System.out.println("=========================================");
        System.out.println("");
        System.out.println("");
        
        do{
            menu();
        } while (pilihan!=7);
    }

    private static void menu() {
        Kasir objkasir = new Kasir();
        Pembeli objpembeli = new Pembeli();
        
        do {
            System.out.println("MENU PILIHAN");
            System.out.println("=========================================");
            System.out.println("1. Masukkan data Kasir");
            System.out.println("2. Masukkan data Pembeli");
            System.out.println("3. Tampilkan data Kasir");
            System.out.println("4. Tampilkan data Pembeli");
            System.out.println("5. Urutkan Nilai Pembeli");
            System.out.println("6. Cari Nilai Pembeli");
            System.out.println("7. Keluar");
            System.out.println("");
            System.out.println("=========================================");
            System.out.print("Pilihan (1,2,3,4,5,6,7) : ");
          
            Scanner input = new Scanner(System.in);
            try {
                pilihan=input.nextInt();
            } catch (Exception e) {
                System.out.println("Harus Angka !");
            }
            
            switch(pilihan){
            case 1 :
                   System.out.println("=========================================");
                   System.out.println("");
                   System.out.println("Masukkan Data Kasir !");
                   System.out.println("");
                   objkasir.setDataKasir();
                   System.out.println("Data berhasil dimasukkan !");
                   System.out.println("=========================================");
                   System.out.println("");
                   break;
            case 2 :
                    System.out.println("=========================================");
                    System.out.println("");
                    System.out.println("Masukkan Data Pembeli !");
                    System.out.println("");
                    objpembeli.setDataPembeli();
                    System.out.println("Data berhasil dimasukkan !");
                    System.out.println("========================================");
                    System.out.println("");
                    break;
            case 3 :
                    System.out.println("=========================================");
                    System.out.println("");
                    System.out.println("DATA KASIR");
                    System.out.println("");
                    System.out.println("=========================================");
                    System.out.format("%-10s","ID");
                    System.out.format("%-10s","NAMA");
                    System.out.format("%-10s","LANTAI");
                    System.out.println("");
                    System.out.println("=========================================");
                    objkasir.infoOrang();
                    System.out.println("");
                    break;
            case 4 :
                    System.out.println("========================================");
                    System.out.println("");
                    System.out.println("DATA PEMBELI");
                    System.out.println("========================================");
                    System.out.println("");
                    System.out.println("==========================================================================================================");
                    System.out.format("%-10s","ID BELI");
                    System.out.format("%-10s","NAMA");
                    System.out.format("%-15s","HARGA BUKU 1");
                    System.out.format("%-15s","HARGA BUKU 2");
                    System.out.format("%-15s","TOTAL");
                    System.out.format("%-20s","BONUS");
                    System.out.format("%-10s","DISKON");
                    System.out.println("");
                    System.out.println("==========================================================================================================");
                    objpembeli.infoOrang();
                    System.out.println("");
                    break;
            case 5 :
                    System.out.println("=========================================");
                    objpembeli.sorting();
                    System.out.println("");
                    break;
            case 6 :
                    System.out.println("========================================");
                    System.out.println("");
                    objpembeli.searching();
                    System.out.println("");
                    break;
            case 7 :
                    System.out.println("========================================");
                    System.out.println("");    
                    System.exit(0);
                    break;
            default:
                    System.out.println("Masukkan hanya angka 1-7!");
            }
        
        } while (true);
    }
}
