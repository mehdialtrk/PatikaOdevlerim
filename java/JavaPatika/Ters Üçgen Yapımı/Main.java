import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Basamak Sayisi: ");

        int n=input.nextInt();
        System.out.println();

        for (int i =n ; i >0; i-- )// Satir sayisi : Aşağıya doğru 1,2,3,4,5,6... olarak değişiyor
        {
            for (int j=1 ; j <=n-i; j++ )// boşluk Sayisi: Her Satirda ilk yildiz ile Karşılaşıncaya kadar 0,1,2,3... olarak değişiyor.
            {
                System.out.print(" ");
            }
            for (int j=1; j <=  2*i-1; j++ )// yıldız sayisi: Her Satırda olan yıldız Sayiları aşağıya dğru ...9,7,5,3,1 olarak değişiyor.
            {
                System.out.print("*");
            }
            System.out.println();// boşluk Sayısını ifade ediyor.
        }



        }
    }








