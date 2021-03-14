/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orang;

import Interface.Kalkulasi;
import java.util.Scanner;

/**
 *
 * @author Rasyid Rafi
 */
public class Pembeli extends Orang implements Kalkulasi{
    private int ID_beli;
    private int hargaBuku1;
    private int hargaBuku2;
    private int total;
    private String bonus;
    private double diskon;
    Pembeli [] data = new Pembeli[3];
    
    public void setDataPembeli(int ID_beli, String nama, int hargaBuku1, int hargaBuku2){
        this.ID_beli=ID_beli;
        this.nama=nama;
        this.hargaBuku1=hargaBuku1;
        this.hargaBuku2=hargaBuku2;
    }

    public void setDataPembeli(){
        try {
            Scanner input = new Scanner(System.in);
            for ( int i = 0; i < data.length ; i++) {
                data[i]=new Pembeli();
                System.out.println("Data Pembeli ke-"+(i+1)); 
                System.out.print("ID : ");
                data[i].ID_beli=input.nextInt();
                System.out.print("Nama : ");
                data[i].nama=input.next();
                System.out.print("Harga Buku 1 (Tanpa Koma/Titik) : ");
                data[i].hargaBuku1=input.nextInt();
                System.out.print("Harga Buku 2 (Tanpa Koma/Titik) : ");
                data[i].hargaBuku2=input.nextInt();
                System.out.println("");
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Inputan Salah !");
        }  
        hitungTotal();
        hitungBonus();
        hitungDiskon();
    }
    
    public void hitungTotal() {
        for (int i = 0; i < data.length; i++) {
            data[i].total=(data[i].hargaBuku1)+(data[i].hargaBuku2);
        }
    }
    
    @Override
    public void infoOrang(){
        for (int i = 0; i < data.length; i++) {
            System.out.format("%-10s",data[i].ID_beli);
            System.out.format("%-10s",data[i].nama);
            System.out.format("%-15s",data[i].hargaBuku1);
            System.out.format("%-15s",data[i].hargaBuku2);
            System.out.format("%-15s",data[i].total);
            System.out.format("%-20s",data[i].bonus);
            System.out.format("%-10s",data[i].diskon);
            System.out.println("");
        }
        System.out.println("==========================================================================================================");
    }
    
    public String hitungBonus(){
        for (int i = 0; i < data.length; i++) {
            if (data[i].total>=100000) {
                data[i].bonus="Tas";
            } else if (data[i].total>=50000){
                data[i].bonus="Tempat Pensil";
            } else if (data[i].total>=20000){
                data[i].bonus="Rautan";
            }else {
                data[i].bonus="Tidak Ada Bonus";
            }
        }
        return bonus;
    }
    
    public double hitungDiskon(){
        for (int i = 0; i < data.length; i++) {
            if (data[i].total>=100000) {
                data[i].diskon=10000;
            } else if (data[i].total>=50000){
                data[i].diskon=5000;
            } else if (data[i].total>=10000){
                data[i].diskon=1000;
            }else {
                data[i].diskon=0;
            }
        }
        return diskon;
    }
    
    @Override
    public void sorting() {
        System.out.println("");
        System.out.println("Data Sebelum Diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].total);
        }
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Data Setelah Diurutkan :");
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i].total>data[j].total){
                    double temp = data[i].total;
                    data[i].total=data[j].total;
                    data[j].total=(int) temp;        
                }
            }
        }
            for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].total);
            
        }
        
    }

    @Override
    public void searching() {
        Scanner caridata = new Scanner(System.in);
        System.out.print("Masukkan ID Beli : ");
        int cari = caridata.nextInt();
        
        boolean ketemu=false;
        int i = 0;
        int posisi = 0;
        
        while (!ketemu && i<data.length) {
            if(data[i].ID_beli==cari){
                posisi = i+1;
                ketemu=true;
                break;
            }
            i++;
        }
        if (ketemu){
            System.out.println("");
            System.out.println("Data ada di baris : "+posisi);
            System.out.println("----------------------------------------------------------------------------");
            System.out.format("%-10s","ID Beli");
            System.out.format("%-10s","Nama");
            System.out.format("%-15s","Harga Total");
            System.out.format("%-20s","Bonus");
            System.out.format("%-10s","Diskon");
            System.out.println("");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("");
            System.out.format("%-10s",data[i].ID_beli);
            System.out.format("%-10s",data[i].nama);
            System.out.format("%-15s",data[i].total);
            System.out.format("%-20s",data[i].bonus);
            System.out.format("%-10s",data[i].diskon);
            System.out.println("");
            System.out.println("");
            System.out.println("----------------------------------------------------------------------------");
        } else {
            System.out.println("Data tidak ditemukan !");
        }
    }
}
