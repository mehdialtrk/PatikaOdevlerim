import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number;
        double sum=0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        number =input.nextInt();
            for(double i=1.0;i<=number;i++){


                sum=1/i+sum;

            }
        System.out.println(sum);
    }
}