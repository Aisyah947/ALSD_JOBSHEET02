package jobsheet02;

public class MataKuliahMain17 {
    public static void main(String[] args) {
      MataKuliah17 mk1 = new MataKuliah17();
      System.out.println("Informasi Mata Kuliah 1 (Default):");
      mk1.tampilInformasi();
      
      mk1.ubahSKS(3);
      mk1.tambahJam(4);
      mk1.kurangiJam(2);
      mk1.tampilInformasi();
      
      MataKuliah17 mk2 = new MataKuliah17("SI202", "Algoritma dan struktur Data", 4, 6);
      System.out.println("Informasi Mata Kuliah 2");
      mk2.tampilInformasi();
      
      mk2.ubahSKS(5);
      mk2.tambahJam(2);
      mk2.kurangiJam(3);
      mk2.tampilInformasi();
    }
}
