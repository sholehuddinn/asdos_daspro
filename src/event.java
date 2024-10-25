public class event {
  public static void main(String[] args) {
      System.out.println("== Surabaya Event ==");

      int jamMulai = 8;
      int menitMulai = 0;

      int durasiPembukaan = 40;
      int durasiAcara = 110;
      int durasiPenutupan = 20;

      int totalMenitPembukaan = menitMulai + durasiPembukaan;
      int menitSelesaiPembukaan = totalMenitPembukaan % 60;
      int tambahanJamPembukaan = totalMenitPembukaan / 60;
      int jamSelesaiPembukaan = jamMulai + tambahanJamPembukaan;

      System.out.printf("Pembukaan %d Menit | %02d:%02d - %02d:%02d\n", durasiPembukaan, jamMulai, menitMulai, jamSelesaiPembukaan, menitSelesaiPembukaan);

      int jamMulaiAcara = jamSelesaiPembukaan;
      int menitMulaiAcara = menitSelesaiPembukaan;

      int totalMenitAcara = menitMulaiAcara + durasiAcara;
      int menitSelesaiAcara = totalMenitAcara % 60;
      int tambahanJamAcara = totalMenitAcara / 60;
      int jamSelesaiAcara = jamMulaiAcara + tambahanJamAcara;

      System.out.printf("Acara Utama %d Menit | %02d:%02d - %02d:%02d\n", durasiAcara, jamMulaiAcara, menitMulaiAcara, jamSelesaiAcara, menitSelesaiAcara);

      int jamMulaiPenutupan = jamSelesaiAcara;
      int menitMulaiPenutupan = menitSelesaiAcara;

      int totalMenitPenutupan = menitMulaiPenutupan + durasiPenutupan;
      int menitSelesaiPenutupan = totalMenitPenutupan % 60;
      int tambahanJamPenutupan = totalMenitPenutupan / 60;
      int jamSelesaiPenutupan = jamMulaiPenutupan + tambahanJamPenutupan;

      System.out.printf("Penutupan %d Menit | %02d:%02d - %02d:%02d\n", durasiPenutupan, jamMulaiPenutupan, menitMulaiPenutupan, jamSelesaiPenutupan, menitSelesaiPenutupan);
  }
}
