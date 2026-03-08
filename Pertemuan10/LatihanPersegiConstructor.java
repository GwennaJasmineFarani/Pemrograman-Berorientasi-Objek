package Pertemuan10;

public class LatihanPersegiConstructor {
    public static void main(String[] args) {

        // valid
        Persegi p1 = new Persegi(5);

        // tidak valid
        Persegi p2 = new Persegi(-3);

        // menampilkan hasil
        p1.tampilkanHasil();
        p2.tampilkanHasil();
    }
}

class Persegi {

    int sisi;
    int luas;
    int keliling;

    // Constructor 1 parameter
    public Persegi(int sisi) {

        if (sisi <= 0) {
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }

        // Menghitung luas dan keliling
        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }

    // menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + sisi + " cm");
        System.out.println("Luas     : " + luas + " cm2");
        System.out.println("Keliling : " + keliling + " cm");
        System.out.println();
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 8 Maret 2026 */