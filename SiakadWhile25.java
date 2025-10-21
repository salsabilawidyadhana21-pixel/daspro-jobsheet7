import java.util.Scanner;

public class SiakadWhile25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int nilai, jml; 
        int i = 0; 

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        // Struktur Perulangan WHILE 
        while (i < jml) {
            // Input nilai
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            // Cek Nilai Tidak Valid (negatif atau lebih dari 100)
            if (nilai < 0 || nilai > 100) { 
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue; // Melewati sisa kode di iterasi ini dan meminta input ulang
            }

            String kategoriHuruf = "";

            // Kondisi pemilihan IF-ELSE IF-ELSE untuk menentukan kategori nilai huruf
            if (nilai > 80 && nilai <= 100) {
                kategoriHuruf = "A";
            } else if (nilai > 73 && nilai <= 80) {
                kategoriHuruf = "B+";
            } else if (nilai > 65 && nilai <= 73) {
                kategoriHuruf = "B";
            } else if (nilai > 60 && nilai <= 65) {
                kategoriHuruf = "C+";
            } else if (nilai > 50 && nilai <= 60) {
                kategoriHuruf = "C";
            } else if (nilai > 39 && nilai <= 50) {
                kategoriHuruf = "D";
            } else { // nilai <= 39
                kategoriHuruf = "E";
            }
            
            // Output Kategori
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah " + kategoriHuruf);

            // Peningkatan counter hanya jika nilai valid (i++)
            i++; 
        } // Akhir perulangan WHILE

        System.out.println("\n--- Proses selesai ---");

        sc.close();
    }
}