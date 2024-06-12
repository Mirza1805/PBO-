/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week11;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Week11 {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/a112214344";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stat;
    static ResultSet rs;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (pilihan) {
                case 1:
                    inputBuku();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    deleteBuku();
                    break;
                case 4:
                    updateBuku();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 5);
    }

    public static void inputBuku() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> bukuList = new ArrayList<>();
        System.out.print("Masukan jumlah buku: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        for (int i = 0; i < numBooks; i++) {
            Buku buku = new Buku();
            System.out.print("Masukan buku ke-"+ (i+1) +"\n");
            System.out.print("Masukan judul buku: ");
            buku.setJudulBuku (scanner.nextLine());
            System.out.print("Masukan tahun terbit: ");
            buku.setTahunTerbit (scanner.nextInt());
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Masukan stok: ");
            buku.setStok(scanner.nextInt());
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Masukan penulis: ");
            buku.setPenulis (scanner.nextLine());
            bukuList.add(buku);
        }
        insert(bukuList);
    }

    public static void insert(ArrayList<Buku> bukuList) {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stat = conn.createStatement();
            for (Buku buku : bukuList) {
                String sql = "INSERT INTO buku (judul_buku, tahun_terbit, stok, penulis) values (?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, buku.getJudulBuku());
                ps.setInt(2, buku.getTahunTerbit());
                ps.setInt(3, buku.getStok());
                ps.setString(4, buku.getPenulis());
                ps.execute();
            }
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void show() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from buku");
            int i = 1;
            System.out.println("\n----Hasil di Database----");
            while (rs.next()) {
                System.out.println("\n"+ "Data ke-" + i);
                System.out.println("ID Buku: " + rs.getInt("id"));
                System.out.println("Judul Buku: " + rs.getString("judul_buku"));
                System.out.println("Tahun Terbit: " + rs.getString("tahun_terbit"));
                System.out.println("Stok: " + rs.getString("stok"));
                System.out.println("Penulis: " + rs.getString("penulis"));
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteBuku() {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stat = conn.createStatement();
            System.out.print("Masukan ID buku yang ingin dihapus: ");
            int idBuku = scanner.nextInt();
            String sql = "DELETE FROM buku WHERE id = " + idBuku;
            stat.executeUpdate(sql);
            System.out.println("Data buku berhasil dihapus.");
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateBuku() {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stat = conn.createStatement();
            System.out.print("Masukan ID buku yang ingin diubah: ");
            int idBuku = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Masukan judul buku baru: ");
            String judulBuku = scanner.nextLine();
            System.out.print("Masukan tahun terbit baru: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Masukan stok baru: ");
            int stok = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Masukan penulis baru: ");
            String penulis = scanner.nextLine();
            String sql = "UPDATE buku SET judul_buku = '" + judulBuku + "', tahun_terbit = " + tahunTerbit + ", stok = " + stok + ", penulis = '" + penulis + "' WHERE id = " + idBuku;
            stat.executeUpdate(sql);
            System.out.println("Data buku berhasil diubah.");
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Buku {

        private String judulBuku;
        private int tahunTerbit;
        private int stok;
        private String penulis;

        public String getJudulBuku() {
            return judulBuku;
        }

        public void setJudulBuku(String judulBuku) {
            this.judulBuku = judulBuku;
        }

        public int getTahunTerbit() {
            return tahunTerbit;
        }

        public void setTahunTerbit(int tahunTerbit) {
            this.tahunTerbit = tahunTerbit;
        }

        public int getStok() {
            return stok;
        }

        public void setStok(int stok) {
            this.stok = stok;
        }

        public String getPenulis() {
            return penulis;
        }

        public void setPenulis(String penulis) {
            this.penulis = penulis;
        }
    }
}