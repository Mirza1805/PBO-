package Responsi;
import Responsi.Mahasiswa;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class DataMahasiswa{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswalist = new ArrayList<Mahasiswa>();
        System.out.print("Jumlah Mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();
        
        for(int i=0;i<jumlahMahasiswa;i++){
            System.out.println("Masukan data mahasiswa ke - " + (i+1));
            System.out.print("nama : ");
            String nama=scanner.next();

            System.out.print("semester : ");
            int Semester=scanner.nextInt();

            System.out.print("sks : ");
            int Sks=scanner.nextInt();

            System.out.print("NIM : ");
            int NIM=scanner.nextInt();
           System.out.print("SPP : ");
            int spp=scanner.nextInt();
            
            Mahasiswa mahasiswa = new Mahasiswa(nama,Semester,Sks,NIM,spp);
            mahasiswalist.add(mahasiswa);
        }
        System.out.println ("Data Mahasiswa dan tagihannya : ");
        for (Mahasiswa mahasiswa : mahasiswalist){
            System.out.print("Nama : " + mahasiswa.getnama() );
            System.out.print("\nSemester : " + mahasiswa.getSemester() );
            System.out.print("\nSKS : " + mahasiswa.getSks() );
            System.out.print("\nNIM : " + mahasiswa.getNIM() );
            System.out.println("\nSPP : " + mahasiswa.getspp() );
            System.out.print("Tagihan : " + mahasiswa.tagihan() );
        }
    }
}