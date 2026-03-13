package Pertemuan11;

public class LatihanProdukOverloading {
    static class Produk {
        String namaProduk;
        int harga;
        int stok;

        // nama produk dan harga
        Produk(String namaProduk, int harga) {
            this.namaProduk = namaProduk;
            this.harga = harga;
            this.stok = 0;
        }

        // semua atribut
        Produk(String namaProduk, int harga, int stok) {
            this.namaProduk = namaProduk;
            this.harga = harga;
            this.stok = stok;
        }

        // menampilkan informasi produk
        public void tampilkanInfo() {
            System.out.println("=== INFORMASI PRODUK ===");
            System.out.println("Nama Produk: " + namaProduk);
            System.out.println("Harga      : Rp " + harga);
            System.out.println("Stok       : " + stok);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // menggunakan constructor nama dan harga
        Produk produk1 = new Produk("Laptop ASUS", 8500000);

        // menggunakan constructor semua atribut
        Produk produk2 = new Produk("Mouse Logitech", 250000, 50);

        // Menampilkan informasi produk
        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
    }
}

/*Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : Jumat, 13 Maret 2026 */