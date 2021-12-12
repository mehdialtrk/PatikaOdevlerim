import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Yıl Giriniz(ör:1988):");
        int year=input.nextInt();
        if(year%4==0){
            System.out.println("\n"+year+": Artık Yıldır.");
            if(year%400==0){

                System.out.print("hem de Artık Yüzyıldır.");
            }
            else
                System.out.print("ama Artık Yüzyıl değildir.");
        }
        else
            System.out.println("\n"+year+": Artık Yıl Değildir.");

    }
}

