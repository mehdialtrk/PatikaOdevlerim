import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int girilenSayi,i,j;



        Scanner input =new Scanner(System.in);
        System.out.print("Sınır Sayısını giriniz.: ");
        girilenSayi=input.nextInt();

        System.out.println("***4'ün Kuvvetleri***");
            for (i = 1; i <= girilenSayi; i *= 4) {


                System.out.println(i);


            }
        System.out.println("***5'in Kuvvetleri***");
        for (j = 1; j <= girilenSayi; j *= 5) {

            System.out.println(j);
        }





    }
}