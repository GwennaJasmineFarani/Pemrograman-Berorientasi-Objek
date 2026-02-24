package Pertemuan5;

public class LatihanBilangan {
    public static void main(String[] args) {
        int number = -7 ; 

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);

        // Menentukan positif / negatif / nol
        if (number > 0) {
            System.out.println("Jenis: Bilangan positif");
        } else if (number < 0) {
            System.out.println("Jenis: Bilangan negatif");
        } else {
            System.out.println("Jenis: Nol");
        }

        // Menentukan genap / ganjil
        if (number != 0) {
            String tipe = (number % 2 == 0) ? "Genap" : "Ganjil";
            System.out.println("Tipe: " + tipe);
        }
    }
}
    
/* Nama : Gwenna Jasmina Farani (D1041241079)
Tanggal : 24 / 2 / 2026 */
