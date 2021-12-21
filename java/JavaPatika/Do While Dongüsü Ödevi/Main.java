import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int girilenSayi,toplam=0;

        Scanner input =new Scanner(System.in);

        do {
            System.out.print("Bir Sayi Giriniz: ");
            girilenSayi=input.nextInt();
            if(girilenSayi%2==0||girilenSayi%4==0){
                toplam+=girilenSayi;
            }
        }
        while (!(girilenSayi%2==1));

        System.out.println("Toplam: "+toplam);

    }
}