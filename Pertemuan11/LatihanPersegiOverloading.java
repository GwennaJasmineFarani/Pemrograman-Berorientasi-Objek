package Pertemuan11;

public class LatihanPersegiOverloading {
     static class PersegiPanjang {
        int panjang;
        int lebar;
        int luas;
        int keliling;

        // Persegi (panjang = lebar)
        public PersegiPanjang(int sisi) {
            this.panjang = sisi;
            this.lebar = sisi;
            this.luas = panjang * lebar;
            this.keliling = 2 * (panjang + lebar);
        }

        // Persegi panjang
        public PersegiPanjang(int panjang, int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.luas = panjang * lebar;
            this.keliling = 2 * (panjang + lebar);
        }

        // menampilkan informasi
        public void tampilkanInfo() {

            if (panjang == lebar) {
                System.out.println("=== PERSEGI ===");
            } else {
                System.out.println("=== PERSEGI PANJANG ===");
            }

            System.out.println("Panjang : " + panjang + " cm");
            System.out.println("Lebar   : " + lebar + " cm");
            System.out.println("Luas    : " + luas + " cm²");
            System.out.println("Keliling: " + keliling + " cm");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // persegi
        PersegiPanjang p1 = new PersegiPanjang(5);

        // persegi panjang
        PersegiPanjang p2 = new PersegiPanjang(8, 4);

        // Tampilkan informasi
        p1.tampilkanInfo();
        p2.tampilkanInfo();
    }
}

/*Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : Jumat, 13 Maret 2026 */