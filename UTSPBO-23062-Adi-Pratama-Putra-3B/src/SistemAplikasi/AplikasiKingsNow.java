/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package SistemAplikasi;
import BasisDataPengguna.*; // IMPORT PACKAGE BASISDATAPENGGUNA
import BasisDataHotel.*; // IMPORT PACKAGE BASISDATAHOTEL
import java.util.Scanner; // IMPORT SCANNER AGAR DAPAT INPUT

/**
 * UJIAN TENGAH SEMESTER 3 - PEMROGRAMAN BERORIENTASI OBJEK
 * SISTEM APLIKASI RESERVASI HOTEL "KINGSNOW"
 * @author Adi Pratama Putra
 */

public class AplikasiKingsNow {
    
        public static void main(String[] args) {
        
        // OBJECT SCANNER AGAR DAPAT INPUT
        Scanner scanner = new Scanner(System.in);
        // OBJECT CUSTOMER = SISTEM CUSTOMER
        SistemCustomer customer = new SistemCustomer();
        // OBJECT CUSTOMER = SISTEM ADMIN
        SistemAdmin admin = new SistemAdmin();

           
        // TAMPILAN PENGGUNA DATA HOTEL GOLDEN
        // TERDAPAT : NAMA HOTEL, KODE HOTEL, LOKASI HOTEL, FASILITAS, KAMAR ( KODE KAMAR )
        HotelGolden golden = new HotelGolden("Karawang GOLDEN Hotel", "A1A1A1", "Karawang, Jawa Barat",
                "1 Kasur, Kolam Renang, Gym, Spa", "CILAMAYA Room (A2A2A2) \n                   RENGASDENGKLOK Room (A3A3A3) \n                   KLARI Room (A4A4A4) \n                   BATUJAYA Room (A5A5A5)", 5000000);
        
        // TAMPILAN PENGGUNA DATA HOTEL PLATINUM
        // TERDAPAT : NAMA HOTEL, KODE HOTEL, LOKASI HOTEL, FASILITAS, KAMAR ( KODE KAMAR )
        HotelPlatinum platinum = new HotelPlatinum("Karawang PLATINUM Hotel", "G1G1G1", "Karawang, Jawa Barat",
                "2 Kasur, Kolam Renang, Gym, Spa, \n                   Private Office", "KARAWANG Room (G2G2G2) \n                   TELUKJAMBE Room (G3G3G3) \n                   CIKAMPEK Room (G4G4G4)", 5000000);
        
        
        // TAMPILAN PERTAMA | ANDA DIMINTA UNTUK MEMILIH MENU UNTUK MELANJUTKAN
        System.out.println("=====================================================");
        System.out.println("===================== KINGSNOW ======================");
        System.out.println("===== Aplikasi Reservasi Hotel No.1 Di Karawang =====");
        System.out.println("=====================================================");
        System.out.println("=====================================================");
        System.out.println("||                                                 ||");
        System.out.println("||            [1] LOGIN Sebagai ADMIN              ||"); // DIALIHKAN KEPADA SISTEM ADMIN
        System.out.println("||           [2] LOGIN Sebagai CUSTOMER            ||"); // DIALIHKAN KEPADA SISTEM CUSTOMER
        System.out.println("||            [3] LOGOUT dari KINGSNOW             ||"); // KELUAR APLIKASI
        System.out.println("||                                                 ||");
        System.out.println("=====================================================");
        System.out.println("=====================================================");
        
        // MENGINPUT PILIHAN MENU
        System.out.print("\n> MASUKKAN PILIHAN  : ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        
        
        // INPUT ANGKA 1 = ANDA MASUK KEDALAM SISTEM ADMIN
        if (pilihan == 1) {
            
            // SISTEM ADMIN [ TAMPILAN LOGIN ]
            if (admin.login()) {
                // YANG DITAMPILKAN JIKA MEMILIH 1
                System.out.println("\n\n> SELAMAT DATANG! [ ADMIN ] KingsNow");
                System.out.println("> Apa Yang Anda Ingin Lakukan Hari Ini ?");
                System.out.println("\n===================== PERINTAH ======================");
                System.out.println("=====================================================");
                System.out.println("||                                                 ||");
                System.out.println("||         [1] TAMBAH & HAPUS Daftar Hotel         ||");
                System.out.println("||         [2] TAMBAH & HAPUS Daftar Kamar         ||");
                System.out.println("||                                                 ||");
                System.out.println("=====================================================");
                System.out.println("=====================================================");
                
                // MENGINPUT PILIHAN MENU
                System.out.print("\n> MASUKKAN PILIHAN  : ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                // MENGINPUT ANGKA 1
                if (pilihan == 1) {
                    System.out.println("> STATUS SISTEM     : SISTEM SEDANG DIPERBAIKI!");
                    System.out.println("                      Hubungi Operator Untuk Menam-");
                    System.out.println("                      bahkan dan Menghapus HOTEL");
                    System.out.println("\n");
                
                // MENGINPUT ANGKA 2
                } else if (pilihan == 2) {
                    System.out.println("> STATUS SISTEM     : SISTEM SEDANG DIPERBAIKI!");
                    System.out.println("                      Hubungi Operator Untuk Menam-");
                    System.out.println("                      bahkan dan Menghapus KAMAR");
                    System.out.println("\n");
                }
            
            // JIKA MENGINPUT BUKAN 1 ATAU 2
            } else {
                System.out.println("\n\n=====================================================");
                System.out.println("\n> STATUS SISTEM : GAGAL MEMUAT INFO");
                System.out.println("> SILAHKAN COBA KEMBALI");
                System.out.println("\n");
            }
        
        
        
        // INPUT ANGKA 2 = ANDA MASUK KEDALAM SISTEM CUSTOMER
        } else if (pilihan == 2) {
            
            // SISTEM CUSTOMER [ TAMPILAN LOGIN ]
            customer.inputData();
            
            // SISTEM CUSTOMER [ JIKA MASIH DIBAWAH 18 TAHUN CUSTOMER TIDAK DAPAT LOGIN ]
            if (customer.getUmur() < 18) {
                // YANG DITAMPILKAN JIKA UMUR CUSTOMER DIBAWAH 18 TAHUN
                System.out.println("\n\n=====================================================");
                System.out.println("\n> STATUS SISTEM : CUSTOMER MASIH BERADA DIBAWAH UMUR");
                System.out.println("                  SILAHKAN MEMINTA BANTUAN ORANG DEWASA");
                System.out.println("\n");
            
            // SISTEM ADMIN [ TAMPILAN LOGIN ]
            } else {
                // YANG DITAMPILKAN JIKA MEMILIH 2
                System.out.println("\n==================== DAFTAR HOTEL ====================");
                System.out.println("======================================================");
                System.out.println("||                                                  ||");
                System.out.println("||            [1] Karawang GOLDEN Hotel             ||");
                System.out.println("||           [2] Karawang PLATINUM Hotel            ||");
                System.out.println("||                                                  ||");
                System.out.println("======================================================");
                System.out.println("======================================================");

                // MENGINPUT PILIHAN MENU
                System.out.print("\n> MASUKKAN PILIHAN  : ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Menangani newline

                // MENGINPUT ANGKA 1
                if (pilihan == 1) {
                    golden.tampilkanInfo(); // MENAMPILKAN INFO HOTEL GOLDEN
                    
                // MENGINPUT ANGKA 2
                } else if (pilihan == 2) {
                    platinum.tampilkanInfo(); // MENAMPILKAN INFO HOTEL PLATINUM
                }

                // INPUT DATA PESANAN
                System.out.print("\n> MASUKKAN KODE HOTEL              : "); // INPUT KODE HOTEL
                String kodeHotel = scanner.nextLine();
                System.out.print("> MASUKKAN KODE KAMAR              : "); // INPUT KODE KAMAR
                String kodeKamar = scanner.nextLine();
                System.out.print("> MASUKKAN JANGKA WAKTU MENGINAP   : "); // INPUT JANGKA WAKTU LAMA MENGINAP
                int lamaMenginap = scanner.nextInt();

                // TAMPILAN PROMO
                // DITAMPILKAN SETELAH MENGINPUT DATA PESANAN
                System.out.print("\n> PROMO BESAR-BESARAN AKHIR TAHUN! : ");
                System.out.println("\n> [1] SPECIAL Promo : - 500.000 Per-Hari ( JIKA MENGINAP LEBIH DARI 7 HARI )");
                System.out.println("> [2] SUPER Promo   : - 750.000 Per-Hari ( JIKA MENGINAP LEBIH DARI 14 HARI )");
                System.out.println("> [3] EXTRA Promo   : - 1.000.000 Per-Hari ( JIKA MENGINAP LEBIH DARI 21 HARI )");
                System.out.println("> [4] NON Promo   : HARGA NORMAL");
                
                // MENGINPUT PILIHAN PROMO YANG DI INGINKAN
                System.out.print("\n> PILIH PROMO YANG DI INGINKAN  : ");
                int pilihanPromo = scanner.nextInt();
                scanner.nextLine();
                
                // MENGHITUNG PROMO SESUAI YANG DIPILIH
                int hargaAkhir = hitungHargaAkhir(pilihanPromo, lamaMenginap, golden, platinum);
                
                // KONFIRMASI PEMESANAN KAMAR-HOTEL
                System.out.println("\n\n[ KONFIRMASI ] Apakah Anda Ingin Melanjutkan Pemesanan?");
                System.out.println("[1] YA | [2] TIDAK");
                
                // MENGINPUT PILIHAH
                System.out.print("\n> MASUKKAN PILIHAN  : ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                // MENGINPUT ANGKA 1 = YA
                // JIKA MENGINPUT ANGKA 1 MAKA AKAN MUNCUL DETAIL PESANAN
                if (pilihan == 1) {
                    // YANG DITAMPILKAN JIKA MEMILIH 1
                    System.out.println("\n\nPROSES RESERVASI BERHASIL !!");
                    System.out.println("\n=============== DETAIL PESANAN ANDA ==============");
                    System.out.println("==================================================");
                    System.out.println("NAMA CUSTOMER   : " + customer.getNama());
                    System.out.println("NOMOR IDENTITAS : " + customer.getNomorIdentitas());
                    System.out.println("KODE HOTEL      : " + kodeHotel);
                    System.out.println("KODE KAMAR      : " + kodeKamar);
                    System.out.println("HARGA           : Rp. " + hargaAkhir);
                    System.out.println("==================================================");
                    System.out.println("==================================================");
                    System.out.println("\n");
                    
                // MENGINPUT ANGKA 2 = TIDAK
                // JIKA MENGINPUT ANGKA 2 MAKA PEMESANAN KAMAR-HOTEL DIBATALKAN
                } else {
                    // YANG DITAMPILKAN JIKA MEMILIH 2
                    System.out.println("\n\nPROSES PEMESANAN DIBATALKAN !!");
                    System.out.println("\n=====================================================");
                    System.out.println("\n> STATUS SISTEM : ANDA MEMBATALKAN RESERVASI HOTEL!");
                    System.out.println(" ");
                }
            }
        
        

        // INPUT ANGKA 3 = ANDA LOGOUT APLIKASI
        // JIKA MENGINPUT ANGKA 3 MAKA ANDA LOGOUT APLIKASI
        } else {
            // YANG DITAMPILKAN JIKA MEMILIH 3
            System.out.println("\n\n=====================================================");
            System.out.println("\n> STATUS SISTEM : LOGOUT BERHASIL!");
            System.out.println(" ");
        }
                
    }

    
    // PENGHITUNGAN HARGA AKHIR YANG SUDAH DIHITUNG DENGAN PROMO    
    private static int hitungHargaAkhir(int pilihanPromo, int lamaMenginap, HotelGolden golden, HotelPlatinum platinum) {
    int hargaPerHari;

    // PENGHITUNGAN PROMO HOTEL GOLDEN
    
    // JIKA MEMILIH PROMO 1 DAN LAMA MENGINAP LEBIH DARI 7 HARI MAKA PROMO BERHASIL
    // JIKA MEMILIH PROMO 1 LAMA MENGINAP KURANG DARI 7 HARI MAKA HARGA NORMAL
    if (pilihanPromo == 1 && lamaMenginap > 7) {
        hargaPerHari = golden.getHargaPerHari() - 500000;
    
    // JIKA MEMILIH PROMO 2 DAN LAMA MENGINAP LEBIH DARI 14 HARI MAKA PROMO BERHASIL
    // JIKA MEMILIH PROMO 2 LAMA MENGINAP KURANG DARI 14 HARI MAKA HARGA NORMAL
    } else if (pilihanPromo == 2 && lamaMenginap > 14) {
        hargaPerHari = golden.getHargaPerHari() - 750000;
    
    // JIKA MEMILIH PROMO 3 DAN LAMA MENGINAP LEBIH DARI 21 HARI MAKA PROMO BERHASIL
    // JIKA MEMILIH PROMO 3 LAMA MENGINAP KURANG DARI 21 HARI MAKA HARGA NORMAL
    } else if (pilihanPromo == 3 && lamaMenginap > 21) {
        hargaPerHari = golden.getHargaPerHari() - 1000000;
        
    // JIKA MEMILIH PROMO 4 = TIDAK MENGAMBIL PROMO
    // JIKA MEMILIH PROMO 4 = HARGA NORMAL
    } else {
        hargaPerHari = golden.getHargaPerHari();
    }

    
    // PENGHITUNGAN PROMO HOTEL PLATINUM
    
    // JIKA MEMILIH PROMO 1 DAN LAMA MENGINAP LEBIH DARI 7 HARI MAKA PROMO BERHASIL
    // JIKA MEMILIH PROMO 1 LAMA MENGINAP KURANG DARI 7 HARI MAKA HARGA NORMAL
    if (pilihanPromo == 1 && lamaMenginap > 7) {
        hargaPerHari = platinum.getHargaPerHari() - 500000;
        
    // JIKA MEMILIH PROMO 2 DAN LAMA MENGINAP LEBIH DARI 14 HARI MAKA PROMO BERHASIL
    // JIKA MEMILIH PROMO 2 LAMA MENGINAP KURANG DARI 14 HARI MAKA HARGA NORMAL
    } else if (pilihanPromo == 2 && lamaMenginap > 14) {
        hargaPerHari = platinum.getHargaPerHari() - 750000;
        
    // JIKA MEMILIH PROMO 3 DAN LAMA MENGINAP LEBIH DARI 21 HARI MAKA PROMO BERHASIL
    // JIKA MEMILIH PROMO 3 LAMA MENGINAP KURANG DARI 21 HARI MAKA HARGA NORMAL
    } else if (pilihanPromo == 3 && lamaMenginap > 21) {
        hargaPerHari = platinum.getHargaPerHari() - 1000000;
        
    // JIKA MEMILIH PROMO 4 = TIDAK MENGAMBIL PROMO
    // JIKA MEMILIH PROMO 4 = HARGA NORMAL
    } else {
        hargaPerHari = platinum.getHargaPerHari();
    }
    
    // MENGHITUNG HARGA AKHIR
    // HARGA AKHIR = HARGA SUDAH DIHITUNG PROMO X LAMA WAKTU MENGINAP
    return hargaPerHari * lamaMenginap;
    
    }
}

// TERIMA KASIH - THANK YOU //
