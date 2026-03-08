package Pertemuan9;

public class Buku {

    String judul;
    String pengarang;
    int harga;

    void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga     : Rp " + harga);
        System.out.println();
    }

    public static void main(String[] args) {

        // Objek buku pertama
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;

        // Objek buku kedua
        Buku buku2 = new Buku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;

        // Menampilkan informasi buku
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 8 Maret 2026 */