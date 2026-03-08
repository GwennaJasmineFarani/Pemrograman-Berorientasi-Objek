package Pertemuan10;

public class LatihanBukuConstructor {
     public static void main(String[] args) {

        Buku buku1 = new Buku();

        Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        // Menampilkan informasi buku
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
    }
}

class Buku {

    String judul;
    String pengarang;
    int harga;

    // tanpa parameter
    public Buku() {
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }

    // dengan parameter
    public Buku(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // menampilkan info buku
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga     : Rp " + harga);
        System.out.println();
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 8 Maret 2026 */
