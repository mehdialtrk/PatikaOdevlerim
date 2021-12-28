import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,sum=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        number =input.nextInt();

        while(!(number==0)){
            sum=number%10+sum;  //-----> sayının 10 'a bölümünden kalanı toplama ekle
            number/=10;         // -----> sayıyı 10 böl
        }

        System.out.println("Sonuc: "+sum);

    }
}