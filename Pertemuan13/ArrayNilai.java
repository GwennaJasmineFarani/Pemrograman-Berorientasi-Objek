package Pertemuan13;

public class ArrayNilai {
    public static void main(String[] args) {
        
        // Membuat array dengan 5 nilai
        int[] nilai = {85, 90, 78, 92, 88};

        System.out.println("=== DAFTAR NILAI ===");

        // Menampilkan setiap nilai
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai " + (i + 1) + ": " + nilai[i]);
        }

        // Menampilkan jumlah elemen
        System.out.println("\nTotal Nilai: " + nilai.length);
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 17 Maret 2026 */