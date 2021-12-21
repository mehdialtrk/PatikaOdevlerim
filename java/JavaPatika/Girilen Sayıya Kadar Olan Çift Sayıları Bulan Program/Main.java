import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int girilenSayi,toplam=0,sayac=0;

        Scanner input =new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        girilenSayi=input.nextInt();

        for (int i=1;i<=girilenSayi;i++){
            if(i%3==0||i%4==0||i%12==0){
                toplam+=i;
                sayac++;
            }



        }

       double ortalama= ((double)toplam/sayac);
        System.out.println(ortalama);

    }
}