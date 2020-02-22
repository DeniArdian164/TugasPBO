/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser= new Scanner(System.in);
        double a,t,tv;//tinggiPrismaSegitiga,tinggiLimasSegitiga;
        char kembali=0, kembali1=0,kembali2=0;
        int pilih,pilih1,pilih2;
        do {
            System.out.println("Menu");
            System.out.println("1.Segitiga");
            System.out.println("2.Jajargenjang");
            System.out.print("Silahkan Pilih : ");
            pilih = inputUser.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Alas Segitiga: ");
                    a = inputUser.nextDouble();
                    System.out.print("Tinggi: ");
                    t = inputUser.nextDouble();
                    Segitiga luasSegitiga=new Segitiga();
                    System.out.println("luas "+luasSegitiga.luas(a,t));
                    Segitiga kelilingSegitiga=new Segitiga();
                    double samaSisi=kelilingSegitiga.keliling((float)a);
                    double samaKaki=kelilingSegitiga.keliling((float)a,(float)t);
                    System.out.println("keliling Segitiga Sama Sisi ="+samaSisi);
                    System.out.println("Keliling Segitiga Sama Kaki ="+samaKaki);
                    do {
                        System.out.println("Pilih Menu Bangun Ruang: ");
                        System.out.println("1.Limas Segitiga");
                        System.out.println("2.Prisma Segitiga");
                        System.out.print("PILIH : ");
                        pilih1 = inputUser.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.print("Tinggi Limas Segitiga: ");
                                tv = inputUser.nextDouble();
                                Limas volumeLimas= new Limas();
                                volumeLimas.setT(tv);
                                System.out.println("Volume= "+ volumeLimas.luas(a,t));
                                break;
                            case 2:
                                System.out.print("Tinggi Prisma: ");
                                tv = inputUser.nextDouble();
                                Prismasegitiga volumePrismaSegitiga= new Prismasegitiga();
                                volumePrismaSegitiga.setT(tv);
                                System.out.println("Volume= "+ volumePrismaSegitiga.luas(a,t));
                                break;
                        }
                        System.out.print("Kembali?(y/n)");
                        kembali1 = inputUser.next().charAt(0);
                    }   while (kembali1 == 'Y' || kembali1 == 'y');
                    break;
                case 2:
                    System.out.print("Panjang Sisi JajarGenjang: ");
                    a = inputUser.nextDouble();
                    System.out.print("Tinggi: ");
                    t = inputUser.nextDouble();
                    Jajargenjang luasJajargenjang=new Jajargenjang();
                    System.out.println("luas = "+luasJajargenjang.luas(a,t));
                    do {
                        System.out.println("Pilih Menu Bangun Ruang: ");
                        System.out.println("1.Prisma Jajargenjang");
                        System.out.println("2.Limas Jajargenjang");
                        System.out.print("PILIH:");
                        pilih2 = inputUser.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.print("Tinggi Prisma: ");
                                tv = inputUser.nextDouble();
                                Prismajajargenjang volumePrismaJajargenjang= new Prismajajargenjang();
                                volumePrismaJajargenjang.setT(tv);
                                System.out.println("Volume= "+ volumePrismaJajargenjang.luas(a,t));
                                break;
                            case 2:
                                System.out.print("Tinggi Limas Jajargenjang: ");
                                tv = inputUser.nextDouble();
                                LimasJajargenjang volumeLimasJajargenjang= new LimasJajargenjang();
                                volumeLimasJajargenjang.setT(tv);
                                System.out.println("Volume= "+ volumeLimasJajargenjang.luas(a,t));
                                break;
                        }
                        System.out.print("Kembali?(y/n)");
                        kembali2 = inputUser.next().charAt(0);
                    } while (kembali2 == 'Y' || kembali2 == 'y');
                    break;
            }System.out.print("Kembali ke menu?(y/n)");
            kembali = inputUser.next().charAt(0);
        }while (kembali == 'Y' || kembali == 'y');
    }
}
