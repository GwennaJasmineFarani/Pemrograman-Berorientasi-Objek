package Pertemuan14;

public class LatihanJaggedArray {
    public static void main(String[] args) {
        
        // Membuat jagged array
        int[][] data = {
            {10, 20},
            {30, 40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("=== JAGGED ARRAY ===");

        // Menampilkan dengan loop
        for (int i = 0; i < data.length; i++) {
            System.out.print("Baris " + i + " (" + data[i].length + " elemen): ");
            
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* Nama : Gwenna Jasmina Farani (D1041241079)
Tanggal : 17 Maret 2026 */