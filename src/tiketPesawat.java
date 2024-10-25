import java.text.NumberFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class tiketPesawat {

    // tugas pertemuan 5

    // Kelas Penerbangan
    static class Penerbangan {
        int flightId;
        String from;
        String to;
        int price;
        int availabil;

        Penerbangan(int flightId, String from, String to, int price, int availabil) {
            this.flightId = flightId;
            this.from = from;
            this.to = to;
            this.price = price;
            this.availabil = availabil;
        }
    }

    static List<Penerbangan> penerbanganList = new ArrayList<>();

    // Fungsi untuk format harga ke Rupiah
    public static String toRupiah(double amount) {
        Locale localeID = new Locale("id", "ID");
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(localeID);
        return rupiahFormat.format(amount);
    }

    // Fungsi untuk menampilkan data penerbangan
    public static String tampilkanPenerbangan(Penerbangan penerbangan) {
        return "Flight Id: " + penerbangan.flightId + "\n"
                + "Dari: " + penerbangan.from + "\n"
                + "Tujuan: " + penerbangan.to + "\n"
                + "Harga Tiket: " + toRupiah(penerbangan.price) + "\n"
                + "Jumlah Tiket Tersedia: " + penerbangan.availabil;
    }

    // Fungsi utama
    public static void main(String[] args) {
        do {
            String[] pilihan = {"Client", "Staff", "Keluar"};
            int role = JOptionPane.showOptionDialog(null, "Login Sebagai", "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, pilihan, pilihan[0] );
            
            if (role == 2 || role == -1) {
                JOptionPane.showMessageDialog(null, "Tekan Sekali lagi untuk keluar", "Exit", JOptionPane.ERROR_MESSAGE );
                break;
            }

            // Bagian staff untuk input data penerbangan
            if (role == 1) {
                int addFlight = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Penerbangan Yang Akan Ditambahkan:"));

                for (int i = 0; i < addFlight; i++) {
                    String from = JOptionPane.showInputDialog("Flight Id " + (i + 1) + "\nDari:");
                    String to = JOptionPane.showInputDialog("Tujuan:");
                    int price = Integer.parseInt(JOptionPane.showInputDialog("Harga Tiket:"));
                    int availabil = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Tiket Tersedia:"));

                    Penerbangan penerbangan = new Penerbangan(i + 1, from, to, price, availabil);
                    penerbanganList.add(penerbangan);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan!!");
                }

            // Bagian client untuk mencari data penerbangan
            } else if (role == 0) {
                String asal = JOptionPane.showInputDialog("Masukkan Kota Asal:");
                String tujuan = JOptionPane.showInputDialog("Masukkan Kota Tujuan:");

                boolean found = false;
                for (Penerbangan penerbangan : penerbanganList) {
                    if (penerbangan.from.equalsIgnoreCase(asal) && penerbangan.to.equalsIgnoreCase(tujuan)) {
                        JOptionPane.showMessageDialog(null, "Penerbangan Ditemukan:\n" + tampilkanPenerbangan(penerbangan));

                        String namaPenumpang = JOptionPane.showInputDialog("Masukkan Nama Penumpang:");
                        int tiketDipesan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Tiket yang Dipesan:"));

                        if (tiketDipesan <= penerbangan.availabil) {
                            penerbangan.availabil -= tiketDipesan;
                            JOptionPane.showMessageDialog(null, "Tiket Berhasil Dipesan!\n"
                                    + "============================\n"
                                    + "ID " + penerbangan.flightId + "\n"
                                    + "Nama Penumpang: " + namaPenumpang + "\n"
                                    + "Jumlah Tiket Dipesan: " + tiketDipesan + "\n"
                                    + "Total Harga: " + toRupiah(tiketDipesan * penerbangan.price) + "\n"
                                    + "Silahkan Lakukan Pembayaran Di Bandara\n"
                                    + "Sisa Tiket: " + penerbangan.availabil);
                        } else {
                            JOptionPane.showMessageDialog(null, "Tiket Tidak Cukup. Hanya " + penerbangan.availabil + " Tiket Tersedia.");
                        }
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    JOptionPane.showMessageDialog(null, "Maaf, Kota yang Anda Cari Tidak Ada.");
                }
            }
        } while (true);
    }
}
