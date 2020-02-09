import java.util.Scanner;

public class Tugass {

    public static void main(String[] args) {
        int angka[]= new int[6];
        int min = 0, max = 0;
        float mean = 0;
        String name;
        Scanner input =new Scanner(System.in);
        
        System.out.print("Nama       : ");
        name=input.nextLine();
        for (int i = 1; i < 6; i++) {
            System.out.print("Nilai ke-"+i+" : ");
            angka[i]=input.nextInt();
        }
        
        System.out.println("\nNama            : "+name);
        for (int i = 1; i < 6; i++) {
            if(i==1){
                min=angka[i];
                max=angka[i];
            }else{
                if(min>angka[i]){
                    min=angka[i];
                }else if(max<angka[i]){
                    max=angka[i];
                }
            }
            mean=mean+angka[i];
        }
        mean=mean/5;
        System.out.println("Nilai Tertinggi : "+max);
        System.out.println("Nilai Terendah  : "+min);
        System.out.println("Rata Rata       : "+mean);
    }  

}
