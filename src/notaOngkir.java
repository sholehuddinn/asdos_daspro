import java.util.Scanner;

public class notaOngkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input informasi barang
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan harga per unit: ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = scanner.nextInt();

        System.out.print("Masukkan berat total barang (kg): ");
        double berat = scanner.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = scanner.nextDouble();

        // Menghitung total harga
        double totalHarga = harga * jumlah;
        double diskon = 0, pajak = 0, ongkir = 0;

        // Kondisi nested if untuk menentukan diskon
        if (totalHarga > 5000000) {
            if (totalHarga > 10000000) {
                diskon = totalHarga * 0.20;  // Diskon 20%
            } else if (totalHarga > 7000000) {
                diskon = totalHarga * 0.15;  // Diskon 15%
            } else {
                diskon = totalHarga * 0.10;  // Diskon 10%
            }
        } else {
            diskon = 0;  // Tidak ada diskon
        }

        // Menghitung total setelah diskon
        double totalSetelahDiskon = totalHarga - diskon;

        // Kondisi nested if untuk menghitung pajak
        if (totalSetelahDiskon > 8000000) {
            pajak = totalSetelahDiskon * 0.10;  // Pajak 10%
        } else {
            pajak = totalSetelahDiskon * 0.05;  // Pajak 5%
        }

        // Kondisi nested if untuk menghitung ongkir berdasarkan berat dan jarak
        if (berat > 10) {
            if (jarak > 100) {
                ongkir = 100000;  // Ongkir Rp 100.000
            } else {
                ongkir = 75000;   // Ongkir Rp 75.000
            }
        } else {
            if (jarak > 100) {
                ongkir = 50000;   // Ongkir Rp 50.000
            } else {
                ongkir = 30000;   // Ongkir Rp 30.000
            }
        }

        // Menghitung total pembayaran akhir
        double totalBayar = totalSetelahDiskon + pajak + ongkir;

        // Cetak Nota
        System.out.println("\n=============== NOTA ===============");
        System.out.println("Nama Barang          : " + namaBarang);
        System.out.println("Harga Satuan         : Rp " + harga);
        System.out.println("Jumlah               : " + jumlah);
        System.out.println("Berat Total          : " + berat + " kg");
        System.out.println("Jarak Pengiriman     : " + jarak + " km");
        System.out.println("Total Harga          : Rp " + totalHarga);
        System.out.println("Diskon               : Rp " + diskon);
        System.out.println("Total Setelah Diskon : Rp " + totalSetelahDiskon);
        System.out.println("Pajak                : Rp " + pajak);
        System.out.println("Ongkos Kirim         : Rp " + ongkir);
        System.out.println("------------------------------------");
        System.out.println("Total Bayar          : Rp " + totalBayar);
        System.out.println("====================================");
        System.out.println("             Terimakasih");
        System.out.println("====================================");
        // Menutup scanner
        scanner.close();
    }
}
