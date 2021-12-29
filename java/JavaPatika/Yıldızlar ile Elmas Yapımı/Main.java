import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        n =input.nextInt();


        //üst üçgen kısım
       for (int i=1;i<=n;i++){

            for (int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");}
            System.out.println("");

        }

       //alt üçgen kısmı
        for (int i =n-1 ; i >0; i-- )
        {
            for (int j=1 ; j <=n-i; j++ )
            {
                System.out.print(" ");
            }
            for (int j=1; j <=  2*i-1; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }





    }
}