package jobsheet02;

public class DosenMain17 {
    public static void main(String[] args) {

        Dosen17 dosen1 = new Dosen17();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Ahmad Fauzi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Sistem Informasi";

        Dosen17 dosen2 = new Dosen17("D002", "Prof. Siti Aminah", false, 2005, "Kecerdasan Buatan");

        System.out.println("== Informasi Dosen Awal ==");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(true);
        dosen1.ubahKeahlian("Data Science");

        System.out.println("== Informasi Setelah Perubahan ==");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();

        int tahunSekarang = 2025;
        System.out.println("Masa kerja " + dosen1.nama + ": " + dosen1.hitungMasaKerja(tahunSekarang) + " tahun.");
        System.out.println("Masa kerja " + dosen2.nama + ": " + dosen2.hitungMasaKerja(tahunSekarang) + " tahun.");
    }
}
