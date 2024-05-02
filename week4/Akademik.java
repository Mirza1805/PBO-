package week4;
import week1.Mahasiswa;
import java.util.*;

public class Akademik{
    public static void main(String []args){
        int n;
        System.out.println("Masukan jumlah data : ");
        //buat objek dari class scanner untuk menginput data
        Scanner inp=new Scanner(System.in);
        n=inp.nextInt();

        //buat variabel aray dengam tipe mahasiswa
        Mahasiswa[]mhs=new Mahasiswa[n];

        String nim ;
        String nama ;
        Double ipk ;
        Double usia ;
        
        for(int i=0;i<n;i++){
            System.out.println("Data ke-"+(i+1));
            System.out.print("Masukan NIM :");
            nim = inp.next();
            System.out.print("Masukan IPK :");
            ipk = inp.nextDouble();
            System.out.print("Masukan Nama :");
            nama = inp.next();
            System.out.print("Masukan Usia :");
            usia = inp.nextDouble();

            mhs[i] = new Mahasiswa (nim,nama,ipk);
        }
        for (int i=0;i<n;i++){
            System.out.print("Data Mahasiswa");
            mhs[i].getIdentitas();
        }
    
        
    }
}