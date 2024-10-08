/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BasisDataPengguna;
import java.util.Scanner;

/**
 * UJIAN TENGAH SEMESTER 3 - PEMROGRAMAN BERORIENTASI OBJEK
 * SISTEM APLIKASI RESERVASI HOTEL "KINGSNOW"
 * @author Adi Pratama Putra
 */

// ATRIBUT SISTEM PENGGUNA ( CUSTOMER ) IMPLEMENTS INTERFACE
public class SistemCustomer implements InterfacePengguna {
    
    private String nama; // NAMA CUSTOMER
    private String nomorIdentitas; // NOMOR IDENTITAS CUSTOMER
    private int umur; // UMUR CUSTOMER
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void inputData() {
        System.out.println("\n\n\n=============== MASUKKAN DATA PRIBADI ===============");
        System.out.println("=====================================================");
        System.out.println(" ");
        System.out.print("> INPUT NAMA ANDA            : "); // INPUT NAMA CUSTOMER
        nama = scanner.nextLine();
        System.out.print("> INPUT NOMOR IDENTITAS ANDA : "); // INPUT NOMOR IDENTITAS CUSTOMER
        nomorIdentitas = scanner.nextLine();
        System.out.print("> INPUT UMUR ANDA            : "); // INPUT UMUR CUSTOMER
        umur = scanner.nextInt();
    }

    // GETNAMA MEMBANTU UNTUK MENAMPILKAN NAMA PADA DETAIL PESANAN
    // DAN AKAN DITAMPILKAN KEMBALI DI DETAIL PESANAN
    @Override // POLIMORFISME
    public String getNama() {
        return nama;
    }

    // GETNOMOR IDENTITAS MEMBANTU UNTUK MENAMPILKAN NOMOR IDENTITAS PADA DETAIL PESANAN
    // DAN AKAN DITAMPILKAN KEMBALI DI DETAIL PESANAN
    @Override // POLIMORFISME
    public String getNomorIdentitas() {
        return nomorIdentitas;
    }

    // GETUMUR MEMBANTU UNTUK MEM-VERIFIKASI UMUR CUSTOMER
    // JIKA KURANG DARI 18 TAHUN MAKA TIDAK DAPAT MELANJUTKAN PEMESANAN
    public int getUmur() {
        return umur;
    }
}

// TERIMA KASIH - THANK YOU //