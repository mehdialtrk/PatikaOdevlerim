import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,max=0,min=0;



        Scanner input=new Scanner(System.in);
        System.out.print("Kaç Tane Sayi Gireceksiniz: ");
        int N=input.nextInt();
        for (int i=1;i<=N;i++) {
            System.out.print(i + ". Sayiyi Giriniz: ");
            number = input.nextInt();
                if(i==1){
                    max=number;
                    min=number;
                }
                if(number>max)
                    max=number;
                if (min>number)
                    min=number;
            }
        System.out.println("Girdiğiniz En Büyük Sayi= "+max);
        System.out.println("Girdiğiniz En Küçük Sayi= "+min);






        }
    }








