package Pertemuan12;

class Sekolah {
    String namaSekolah;

    Sekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    class Kelas {
        String namaKelas;

        Kelas(String namaKelas) {
            this.namaKelas = namaKelas;
        }

        void info() {
            System.out.println("Sekolah: " + namaSekolah);
            System.out.println("Kelas: " + namaKelas);
        }
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {

        Sekolah sekolah = new Sekolah("SMA Negeri 1");

        Sekolah.Kelas kelas = sekolah.new Kelas("X-A");

        kelas.info();
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 16 Maret 2026 */