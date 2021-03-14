package Orang;

import java.util.Scanner;

/**
 *
 * @author Rasyid Rafi
 */
public class Kasir extends Orang {
    private int ID;
    private String Lantai;
    Kasir data[] = new Kasir[3];
    
    public void setDataKasir(int ID, String nama, String Lantai){
        this.ID=ID;
        this.nama=nama;
        this.Lantai=Lantai;
    }
    
    public void setDataKasir(){
        try {
            Scanner input = new Scanner(System.in);
            for ( int i = 0; i < data.length ; i++) {
                data[i]=new Kasir();
                System.out.println("Data Kasir ke-"+(i+1)); 
                System.out.print("ID : ");
                data[i].ID=input.nextInt();
                System.out.print("Nama : ");
                data[i].nama=input.next();
                System.out.print("Lantai : ");
                data[i].Lantai=input.next();
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Inputan Salah !");
        }
    }
    
    @Override
    public void infoOrang(){
        for (int i = 0; i < data.length; i++) {
            System.out.format("%-10s",data[i].ID);
            System.out.format("%-10s",data[i].nama);
            System.out.format("%-10s",data[i].Lantai);
            System.out.println("");
        }
        System.out.println("-----------------------------------------");
    }
    public String getNamaLantai(){
        return Lantai;
    }
}
