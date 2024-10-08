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

// ATRIBUT SISTEM PENGGUNA ( ADMIN )
public class SistemAdmin {

    // KATA SANDI ADMIN KINGSNOW
    String kataSandi = "Admin123-KingsNow";
    Scanner scanner = new Scanner(System.in);

    
    // MENGINPUT ANGKA 1
    // TAMPILAN AWAL JIKA LOGIN SEBAGAI ADMIN
    public boolean login() {
        System.out.println("\n\n> MASUKKAN USERNAME : @Admin"); // MENAPILKAN NAMA ADMIN (OTOMATIS)
        System.out.print("> MASUKKAN KATA SANDI : "); // INPUT KATA SANDI ADMIN
        String inputKataSandi = scanner.nextLine();

        // LOGIN ADMIN
        if (inputKataSandi.equals(kataSandi)) { // EQUALS UNTUK VERIFIKASI KATA SANDI BENAR ATAU SALAH
            return true; // LOGIN BERHASIL JIKA INPUT KATA SANDI BENAR
        } else {
            return false; // LOGIN GAGAL JIKA INPUT KATA SANDI SALAH
        }
    }

    
    public static void main(String[] args) {
        
        // OBJECT ADMIN AGAR DAPAT LOGIN KE SISTEM ADMIN 
        SistemAdmin admin = new SistemAdmin();
        admin.login();
    }
}

// TERIMA KASIH - THANK YOU //