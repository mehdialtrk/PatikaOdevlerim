import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int number=input.nextInt();
        for (int i=1;i<number;i++){
            if(number%i==0){
                result+=i;

            }
        }

        if (result==number){
            System.out.println(number+" Mükemmel Sayidir.");
        }
        else System.out.println(number+" Mükemmel Sayi Değildir..");


        }
    }








