import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int n,k,total=1;

        System.out.print("Üssü Alınacak Sayiyi Giriniz:");
        n=input.nextInt();
        System.out.print("Üs Olacak Sayiyi Giriniz:");
        k=input.nextInt();

        for (int i=1;i<=k;i++) {
            total*=n;
        }
        System.out.println("Cevap :"+total);
    }
}