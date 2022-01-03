import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n0=0,n1=1;
        Scanner input =new Scanner(System.in);
        System.out.print("Eleman Sayisini Giriniz: ");
        int eleman=input.nextInt();

        int n2=n1+n0;
        System.out.print(n0+ " "+n1+ " ");
        while (eleman>0){
            eleman--;
            System.out.print(n2+ " ");
            n0=n1;
            n1=n2;
            n2=n1+n0;




        }




        }
    }








