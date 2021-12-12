import java.util.Scanner;

public class Main {

    //Mesafe başına ücret 0,10 TL / km olarak alınacak.

    public static void main(String[] args) {
        int age,mesafe;


        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz Mesafeyi KM cinsinden giriniz(Ör:200): ");
        mesafe=input.nextInt();
        if(mesafe>0){
        double tutar=mesafe*0.10;
        }
        else {
            System.out.println("Hatali Veri Girdiniz.");
        }

        System.out.print("Yaşınızı Giriniz: ");
        age=input.nextInt();
        if (age<0){
            System.out.println("Hatali Veri Girdiniz.");
        }
        else if (0<=age && age<12){
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            int yolculukTipi=input.nextInt();
            if (yolculukTipi==1){
                double indirimliTutar = mesafe*yolculukTipi*0.10*0.50;   //0-12 yaş indirimi %50,
                System.out.println("Toplam Tutar:"+indirimliTutar+"TL");
            }
            else if(yolculukTipi==2){
                double indirimliTutar = mesafe*yolculukTipi*0.10*0.50*0.80;//gidiş-dönüş indirimi %20(%100-%20=0.80)
                System.out.println("Toplam Tutar:"+indirimliTutar+"TL");

            }
            else{
                System.out.println("'Yolculuk Tipi' Verisi Hatali.");

            }


        }
        else if (12<=age && age<=24){
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            int yolculukTipi=input.nextInt();
            if (yolculukTipi==1){
                double indirimliTutar = mesafe*yolculukTipi*0.10*0.90;   //12-24 yaş  indirimi %10(%100-%10=0.90)
                System.out.println("Toplam Tutar:"+indirimliTutar+"TL");
            }
            else if(yolculukTipi==2){
                double indirimliTutar = mesafe*yolculukTipi*0.10*0.90*0.80;//gidiş-dönüş indirimi %20(%100-%20=0.80)
                System.out.println("Toplam Tutar:"+indirimliTutar+"TL");

            }
            else{
                System.out.println("'Yolculuk Tipi' Verisi Hatali.");

            }


        }
        else if (24<age && age<=65){
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            int yolculukTipi=input.nextInt();

            if (yolculukTipi==1){
                double indirimliTutar = mesafe*yolculukTipi*0.10;   //24-65 yaş  indirimi yok)
                System.out.println("Toplam Tutar:"+indirimliTutar+"TL");
            }
            else if(yolculukTipi==2){
                double indirimliTutar = mesafe*yolculukTipi*0.10*0.80;//gidiş-dönüş indirimi %20(%100-%20=0.80)
                System.out.println("Toplam Tutar:"+indirimliTutar+"TL");

            }
            else{
                System.out.println("'Yolculuk Tipi' Verisi Hatali.");

            }


        }
        else if (age>65 && age<150){
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            int yolculukTipi=input.nextInt();

            if (yolculukTipi==1){
                double indirimliTutar = mesafe*yolculukTipi*0.10*0.70;   //65-150 yaş indirimi %30(%100-%30=0.70)
                System.out.println("Toplam Tutar:"+indirimliTutar+"TL");
            }
            else if(yolculukTipi==2){
                double indirimliTutar = mesafe*yolculukTipi*0.10*0.70*0.80;//gidiş-dönüş indirimi %20(%100-%20=0.80)
                System.out.println("Toplam Tutar:"+indirimliTutar+"TL");

            }
            else{
                System.out.println("'Yolculuk Tipi' Verisi Hatali.");

            }

        }
        else
            System.out.println("Geçersiz bir yaş girdiniz.");
    }
}