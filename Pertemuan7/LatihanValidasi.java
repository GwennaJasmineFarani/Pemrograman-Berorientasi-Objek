package Pertemuan7;

public class LatihanValidasi {
    public static void main (String[] args) {
       int nilai;
        int[] percobaan = {-10, 150, 85}; // simulasi 3 input

        System.out.println("=== VALIDASI NILAI UJIAN ===\n");

        int i = 0;

        do {
            nilai = percobaan[i];
            System.out.println("Percobaan input: " + nilai);

            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100!\n");
            } else {
                System.out.println("✓ Nilai valid: " + nilai);
            }

            i++;

        } 
        
        while ((nilai < 0 || nilai > 100) && i < percobaan.length);
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 26 / 2 / 2026 */