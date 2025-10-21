import java.util.Scanner;

public class Parkir25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Inisialisasi variabel 
        int jenis;
        int durasi;
        int total = 0; // total pembayaran parkir
        
        System.out.println("--- Sistem Pembayaran Parkir ---");
        
        // Input pertama: Output "Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)"
        System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
        jenis = sc.nextInt();

        // Perulangan WHILE (Kondisi: jenis != 0)
        while (jenis != 0) {
            
            // IF (jenis == 1 || jenis == 2)
            if (jenis == 1 || jenis == 2) { 
                
                // Input durasi
                System.out.print("Input durasi parkir (jam): ");
                durasi = sc.nextInt();
                
                // Cek durasi (IF durasi > 5)
                if (durasi > 5) { 
                    // Tarif tetap Rp 12.500 jika durasi > 5 jam
                    total += 12500;
                } else {
                    // Tarif normal
                    if (jenis == 1) { // Mobil (Rp 3.000/jam)
                        total += durasi * 3000;
                    } 
                    else if (jenis == 2) { // Motor (Rp 2.000/jam)
                        total += durasi * 2000;
                    }
                }
            } else { // Jenis tidak valid (bukan 1, 2, atau 0)
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan ulang.");
            }
            
            // Output dan Input jenis kendaraan berikutnya
            System.out.print("\nMasukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): "); 
            jenis = sc.nextInt();
        }
        
        // Output total
        System.out.println("\nTotal pembayaran parkir hari ini: Rp" + total); 
        
        sc.close();
    }
}