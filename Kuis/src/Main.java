import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilih = 0, banyak;
        char kembali;

        Scanner inputUser = new Scanner(System.in);

        try {
            do {
                System.out.println("MENU FORM PENDAFTARAN");
                System.out.println("1. Asisten Laboratorium");
                System.out.println("2. Admin Laboratorium");
                System.out.print("Pilih Jenis Form : ");
                pilih = inputUser.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("\nFORM PENDAFTARAN ASISTEN LABORATORIUM");
                        System.out.print("Berapa banyak data yang akan di inputkan ? : ");
                        banyak = inputUser.nextInt();
                        Data[] dataAslab = new Data[banyak];
                        for (int i = 0; i < banyak; i++) {
                            inputUser = new Scanner(System.in);
                            System.out.print("Input NIM : ");
                            String nim = inputUser.next();
                            inputUser = new Scanner(System.in);
                            System.out.print("Input Nama : ");
                            String nama = inputUser.nextLine();
                            try {
                                System.out.print("Input Nilai Tes Tulis : ");
                                double tulis = inputUser.nextDouble();
                                if (tulis < 0)
                                    throw new Exception();
                                System.out.print("Input Nilai Tes Coding : ");
                                double coding = inputUser.nextDouble();
                                if (coding < 0)
                                    throw new Exception();
                                System.out.print("Input Nilai Tes Wawancara : ");
                                double wawancara = inputUser.nextDouble();
                                if (wawancara < 0)
                                    throw new Exception();
                                System.out.print("Input Nilai Tes Microteaching : ");
                                double microteaching = inputUser.nextDouble();
                                if (microteaching < 0)
                                    throw new Exception();

                                dataAslab[i] = new Data(nim, nama, tulis, coding, wawancara, microteaching, "Aslab");
                                dataAslab[i].hitungRataRata();
                                dataAslab[i].hasilKeterangan();
                            } catch (Exception e) {
                                System.out.println("Input Harus Bilangan Bulat Positif\n");
                            }
                        }
                        break;

                    case 2:
                        System.out.println("\nFORM PENDAFTARAN ADMIN LABORATORIUM");
                        System.out.print("Berapa banyak data yang akan di inputkan ? : ");
                        banyak = inputUser.nextInt();
                        Data[] dataAdmin = new Data[banyak];
                        for (int i = 0; i < banyak; i++) {
                            inputUser = new Scanner(System.in);
                            System.out.print("Input NIM : ");
                            String nim = inputUser.next();
                            inputUser = new Scanner(System.in);
                            System.out.print("Input Nama : ");
                            String nama = inputUser.nextLine();
                            try {
                                System.out.print("Input Nilai Tes Tulis : ");
                                double tulis = inputUser.nextDouble();
                                if (tulis < 0)
                                    throw new Exception();
                                System.out.print("Input Nilai Tes Coding : ");
                                double coding = inputUser.nextDouble();
                                if (coding < 0)
                                    throw new Exception();
                                System.out.print("Input Nilai Tes Wawancara : ");
                                double wawancara = inputUser.nextDouble();
                                if (wawancara < 0)
                                    throw new Exception();
                                System.out.print("Input Nilai Tes Jaringan : ");
                                double jaringan = inputUser.nextDouble();
                                if (jaringan < 0)
                                    throw new Exception();

                                dataAdmin[i] = new Data(nama, nim, tulis, coding, wawancara, jaringan, "Admin");
                                dataAdmin[i].hitungRataRata();
                                dataAdmin[i].hasilKeterangan();
                            } catch (Exception e) {
                                System.out.println("Input Harus Bilangan Bulat Positif\n");
                            }
                        }
                        break;

                    default:
                        System.out.println("\nMenu Tidak Tesedia");
                        return;
                }
                System.out.print("Kembali ke menu (y/n) ? ");
                inputUser = new Scanner(System.in);
                kembali = inputUser.next().charAt(0);
                System.out.println("");
            } while (kembali == 'y' || kembali == 'Y');
        }catch (InputMismatchException e){
            System.out.println("Input Harus Bilangan Bulat");
            System.out.println("\nMenu Tidak Tesedia");
        }
    }
}