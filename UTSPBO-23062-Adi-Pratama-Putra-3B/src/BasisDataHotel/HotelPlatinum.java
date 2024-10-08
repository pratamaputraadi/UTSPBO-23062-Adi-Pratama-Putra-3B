/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BasisDataHotel;

/**
 * UJIAN TENGAH SEMESTER 3 - PEMROGRAMAN BERORIENTASI OBJEK
 * SISTEM APLIKASI RESERVASI HOTEL "KINGSNOW"
 * @author Adi Pratama Putra
 */

// ATRIBUT TAMPILAN DATA HOTEL PLATINUM
public class HotelPlatinum {
    
    private String nama; // NAMA HOTEL
    private String kodeHotel; // KODE HOTEL
    private String lokasi; // LOKASI HOTEL
    private String fasilitas; // FASILITAS HOTEL
    private String kamar; // KAMAR ( KODE KAMAR )
    private int hargaPerHari; // HARGA PER-HARI

    // KONSTRUKTOR TAMPILAN DATA HOTEL PLATINUM
    public HotelPlatinum (String nama, String kodeHotel, String lokasi, String fasilitas, String kamar, int hargaPerHari) {
        this.nama = nama; // NAMA HOTEL
        this.kodeHotel = kodeHotel; // KODE HOTEL
        this.lokasi = lokasi; // LOKASI HOTEL
        this.fasilitas = fasilitas; // FASILITAS HOTEL
        this.kamar = kamar; // KAMAR ( KODE KAMAR )
        this.hargaPerHari = hargaPerHari; // HARGA PER-HARI
    }

    
    // MENGINPUT ANGKA 2
    // MENU TAMPILAN INFO HOTEL PLATINUM
    public void tampilkanInfo() {
        // TAMPILAN INFO HOTEL PLATINUM
        System.out.println("\n\n\n==================== INFO HOTEL =====================");
        System.out.println("=====================================================");
        System.out.println("                                                     ");
        System.out.println("> NAMA HOTEL     : " + nama); // NAMA HOTEL
        System.out.println("> KODE HOTEL     : " + kodeHotel); // KODE HOTEL
        System.out.println("> LOKASI HOTEL   : " + lokasi); // LOKASI HOTEL
        System.out.println("> FASILITAS      : " + fasilitas); // FASILITAS HOTEL
        System.out.println("> KAMAR HOTEL    : " + kamar); // KAMAR ( KODE KAMAR )
        System.out.println("> HARGA ( MALAM ) : Rp. " + hargaPerHari + " Per-Hari"); // HARGA ORIGINAL
        System.out.println("                                                     ");
        System.out.println("=====================================================");
        System.out.println("=====================================================");
    }

    
    // HARGAPERHARI AKAN DIHITUNG DENGAN PROMO 
    // DAN AKAN DITAMPILKAN KEMBALI DI DETAIL PESANAN 
    public int getHargaPerHari() {
        return hargaPerHari;
    }
}

// TERIMA KASIH - THANK YOU //