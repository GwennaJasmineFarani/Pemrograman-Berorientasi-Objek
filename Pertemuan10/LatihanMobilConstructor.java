package Pertemuan10;

public class LatihanMobilConstructor {
       public static void main(String[] args) {

        // dengan constructor tanpa parameter
        Mobil mobil1 = new Mobil();

        // dengan constructor 1 parameter
        Mobil mobil2 = new Mobil("Toyota");

        // dengan constructor 3 parameter
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        // menampilkan spesifikasi mobil
        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}

class Mobil {

    String merk;
    String warna;
    int tahun;

    // constructor 1: tanpa parameter
    public Mobil() {
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }

    // constructor 2: 1 parameter
    public Mobil(String merk) {
        this.merk = merk;
        warna = "Belum diisi";
        tahun = 0;
    }

    // constructor 3: semua atribut
    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    // menampilkan spesifikasi mobil
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println();
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 8 Maret 2026 */
