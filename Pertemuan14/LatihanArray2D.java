package Pertemuan14;

public class LatihanArray2D {
     public static void main(String[] args) {
        
        // Membuat array 2D 3x3
        int[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("=== TABEL 3x3 ===");

        // Nested loop untuk menampilkan
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println(); // pindah baris
        }
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 17 Maret 2026 */