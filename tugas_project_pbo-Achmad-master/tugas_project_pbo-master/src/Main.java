import model.Pegawai;
import model.PegawaiMagang;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException) {

        // Object 1
        Pegawai Zikri = new Pegawai("KD-01", "Zikri Zega", "Direktur", "Jakarta", "23-09-2019", false);
        Zikri.absensiPegawai("Zikri Zega");
        Zikri.tampilkanData();
        Zikri.hitungGaji();

        System.out.println();

        // Object 2
        Pegawai Arul = new Pegawai("KD-02", "Arul Pansyah", "Staf", "Cempaka", "23-06-2018", true);
        Arul.tampilkanData();
        Arul.hitungGaji();

        System.out.println();

        // Object 3
        PegawaiMagang Fajar = new PegawaiMagang("MG-01", "Fajar Anwar", "Banjarmasin", "UNLAM", "21-04-2021", "12-03-2021");
        Fajar.absensiPegawai("Fajar");
        Fajar.tampilkanDataPegawaiMagang();
        Fajar.hitungGajiMagang();

        System.out.println();

        // Object 4
        PegawaiMagang Supri = new PegawaiMagang("MG-02", "Supriadi", "Marabahan", "UNPAD", "20-09-2021", "23-09-2021");
        Supri.tampilkanDataPegawaiMagang();
        Supri.hitungGajiMagang();

        System.out.println();

        // Object 5
        Pegawai Andi = new Pegawai("KD-03", "Andi Riswan", "Andi", "Andi");

        System.out.println();

        // Object 6
        Pegawai Randi = new Pegawai("KD-04", "Randi Orton", "Randi", "randi123");
    }

}
