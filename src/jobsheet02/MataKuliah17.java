package jobsheet02;

public class MataKuliah17 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
    public MataKuliah17() {
        this.kodeMK = "Mk10023";
        this.nama = "Algoritma dan Struktur Data";
        this.sks = 2;
        this.jumlahJam = 3;
    }
    
    public MataKuliah17(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    public void tampilInformasi() {
        System.out.println("Kode MK   : " + kodeMK);
        System.out.println("Nama      : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("------------------------");
    }
    
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sksBaru);
    }
    
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam bertambah menjadi " + jumlahJam);
    }
    
    public void kurangiJam(int jam) {
        if (jam > this.jumlahJam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan! Jumlah jam tidak mencukupi.");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berkurang menjadi " + jumlahJam);
        }
    }
}
