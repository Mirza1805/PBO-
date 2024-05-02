package Responsi;
import java.util.*;

public class Mahasiswa {
    String nama;
    int Semester;
    int Sks;
    int NIM;
    int spp;
    int biayakuliahpersks;
        int biayaspp;
    //int biayakuliah;

    public Mahasiswa(String nama, int Semester, int Sks, int NIM, int spp){
        this.nama = nama;
        this.Semester = Semester;
        this.Sks = Sks;
        this.NIM = NIM;
        this.spp = spp;
    }

    public String getnama(){
        return nama;
    }

    public int getSemester(){
        return Semester;
    }

    public int getSks(){
        return Sks;
    }

    public int getNIM(){
        return NIM;
    }

    public int getspp(){
        return spp;
    }
    
    public int tagihan (){
        
        if (this.Semester < 2 ){
            biayakuliahpersks=300000;
            spp=3000000;
        }
        else if (this.Semester >= 3 && this.Semester<=6 ){
            biayakuliahpersks=275000;
            spp=2900000;
        }
        else if (this.Semester >=7){
            biayakuliahpersks=250000;
            spp=2750000;
        }

        return (this.Sks * biayakuliahpersks) + spp;
    }
    

}