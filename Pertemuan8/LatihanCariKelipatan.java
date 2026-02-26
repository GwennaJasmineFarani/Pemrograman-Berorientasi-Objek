package Pertemuan8;

public class LatihanCariKelipatan {
    public static void main(String[] args) {
        System.out.println("=== CARI KELIPATAN 7 ===");
        for (int i = 1; i <= 50 ; i++) { 
            System.out.println("Cek : " + i);

            if (i == 7) { // cek kelipatan 7
                System.out.println("✓ Kelipatan 7 Pertama: " + i);
                System.out.println("Pencarian Selesai");
                    break; // memberhentikan loop saat angka ditemukan
            }
        }
    }
}
    
/* Nama : Gwenna Jasmine Farani (D1041241079) 
Tanggal : 26 / 2 / 2026*/

