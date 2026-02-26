package Pertemuan7;

public class LatihanDeretGanjil {
    public static void main(String[] args) {
        int angka = 1; // mulai dari angka  1

        System.out.println("=== BILANGAN GANJIL 1-15 ===");

        while (angka <= 15) {
            if (angka % 2 != 0) { // mengecek ganjil
                System.out.print(angka + " ");
            }
            angka++; // mengupdate setiap iterasi
        }
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 26 / 2 /20 */