public class Data extends Mahasiswa implements InterfaceData{
    private double tulis;
    private double coding;
    private double wawancara;
    private double microteachingJaringan;
    private double hasilAkhir;
    private String bagian;

    public Data(String nim, String nama, double tulis, double coding, double wawancara, double microteachingJaringan, String bagian) {
        super(nim, nama);
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
        this.microteachingJaringan = microteachingJaringan;
        this.bagian = bagian;
    }

    @Override
    public void hitungRataRata() {
        hasilAkhir = ( tulis + coding + wawancara + microteachingJaringan ) / 4;
    }

    @Override
    public void hasilKeterangan() {
        System.out.printf("Nilai Akhir : %.0f \n", hasilAkhir);
        if ( hasilAkhir > 85 ) {
            System.out.println("KETERANGAN : LOLOS");
            System.out.printf("Selamat kepada %s telah diterima sebagai %s", super.getNim(), bagian);
            System.out.println("\n");
        } else {
            System.out.println("KETERANGAN : GAGAL");
            System.out.printf("Mohon maaf kepada %s telah ditolak sebagai %s",super.getNim(), bagian);
            System.out.println("\n");
        }
    }
}
