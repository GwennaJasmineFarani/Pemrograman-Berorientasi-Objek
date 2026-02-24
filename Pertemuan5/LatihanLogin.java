package Pertemuan5;

public class LatihanLogin {
     public static void main(String[] args) {
        // Data benar
        String usernameBenar = "admin";
        String passwordBenar = "admin123";

        // Input 
        String inputUsername = "admin";
        String inputPassword = "admin321";

        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println();

        // Nested if untuk validasi
        if (inputUsername.equals(usernameBenar)) {
            System.out.println("Username valid");

            if (inputPassword.equals(passwordBenar)) {
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, " + inputUsername);
            } else {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }

        } else {
            System.out.println("Username tidak valid");
            System.out.println("LOGIN GAGAL!");
        }
    }
}

/* Nama : Gwenna Jasmina Farani (D1041241079)
Tanggal : 24 / 2 / 2026 */