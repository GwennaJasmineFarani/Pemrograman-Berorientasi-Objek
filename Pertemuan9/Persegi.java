package Pertemuan9;

public class Persegi {

    int sisi;
    int luas;
    int keliling;

    // menghitung luas
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    // menghitung keliling
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    // menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + sisi + " cm");
        System.out.println("Luas     : " + luas + " cm²");
        System.out.println("Keliling : " + keliling + " cm");
    }

    public static void main(String[] args) {

        Persegi p1 = new Persegi();

        // isi atribut
        p1.sisi = 5;

        // panggil method
        p1.hitungLuas();
        p1.hitungKeliling();
        p1.tampilkanHasil();
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 8 Maret 2026 */
