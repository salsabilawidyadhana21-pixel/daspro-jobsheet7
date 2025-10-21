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

        // Struktur Perulangan WHILE (Kondisi: i < jml)
        while (i < jml) {
            // Input nilai
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            // Cek Nilai Tidak Valid (negatif atau lebih dari 100)
            if (nilai < 0 || nilai > 100) { 
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue; // Melanjutkan ke iterasi berikutnya tanpa menambah i
            }

            String kategoriHuruf = "";

            // Kondisi pemilihan IF-ELSE IF-ELSE untuk menentukan kategori nilai huruf
            if (nilai > 80 && nilai <= 100) {
                kategoriHuruf = "A";
                // MODIFIKASI: Menampilkan pesan tambahan untuk nilai A
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println("Bagus, pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                kategoriHuruf = "B+";
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                kategoriHuruf = "B";
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                kategoriHuruf = "C+";
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                kategoriHuruf = "C";
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                kategoriHuruf = "D";
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else { // nilai <= 39
                kategoriHuruf = "E";
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            
            // Peningkatan counter hanya jika nilai valid (i++)
            i++; 
        } // Akhir perulangan WHILE

        System.out.println("\n--- Proses selesai ---");

        sc.close();
    }
}