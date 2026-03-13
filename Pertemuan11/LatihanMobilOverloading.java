package Pertemuan11;

public class LatihanMobilOverloading {
    static class Mobil {
        String merk;
        String warna;
        int tahun;

        // tanpa parameter
        Mobil() {
            merk = "Unknown";
            warna = "Unknown";
            tahun = 0;
        }

        // hanya merk mobil
        Mobil(String merk) {
            this.merk = merk;
            warna = "Unknown";
            tahun = 0;
        }

        // semua atribut
        Mobil(String merk, String warna, int tahun) {
            this.merk = merk;
            this.warna = warna;
            this.tahun = tahun;
        }

        // menampilkan spesifikasi
        public void tampilkanSpesifikasi() {
            System.out.println("=== SPESIFIKASI MOBIL ===");
            System.out.println("Merk : " + merk);
            System.out.println("Warna: " + warna);
            System.out.println("Tahun: " + tahun);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Toyota");
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}

/*Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : Jumat, 13 Maret 2026 */