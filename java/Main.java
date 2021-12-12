import java.util.Scanner;

public class Main{

    public static void main(String[] args){
    int day,month;

        Scanner input=new Scanner(System.in);
        System.out.println("1.Ocak\n" +
                            "2.Şubat\n" +
                            "3.Mart\n" +
                            "4.Nisan\n" +
                            "5.Mayıs\n" +
                            "6.Haziran\n" +
                            "7.Temmuz\n" +
                            "8.Ağustos\n" +
                            "9.Eylül\n" +
                            "10.Ekim\n" +
                            "11.Kasım\n" +
                            "12.Aralık\n");
        System.out.println("Kaçıncı Ayda Doğdunuz?: ");
        month=input.nextInt();
        System.out.println("Kaçıncı Günde Doğdunuz?: ");
        day=input.nextInt();
        if(month==1){

            if(day<22&&day>=0){
                System.out.println("Oğlak Burcusunuz.");
            }
            else if(day>=22&&day<=31){
                System.out.println("Kova Burcusunuz.");
            }
        }

        if(month==2){//şubat

            if(day<20&&day>=0){
                System.out.println("Kova Burcusunuz.");
            }
            else if(day>=21&&day<=28){
                System.out.println("Balık Burcusunuz.");
            }
        }
        if(month==3){

            if(day>=0 &&day<20){
                System.out.println("Balık Burcusunuz.");
            }
            else if(day>=21&&day<=31){
                System.out.println("Koç Burcusunuz.");
            }
        }
        if(month==4){

            if(day>=0 &&day<21){
                System.out.println("Koç Burcusunuz.");
            }
            else if(day>=21&&day<=30){
                System.out.println("Boğa Burcusunuz.");
            }
        }
        if(month==5){

            if(day>=0 &&day<22){
                System.out.println("Boğa Burcusunuz.");
            }
            else if(day>=22&&day<=31){
                System.out.println("İkizler Burcusunuz.");
            }
        }
        if(month==6){

            if(day>=0 &&day<23){
                System.out.println("ikizler Burcusunuz.");
            }
            else if(day>=23&&day<=30){
                System.out.println("Yengeç Burcusunuz.");
            }
        }
        if(month==7){

            if(day>=0 &&day<23){
                System.out.println("Yengeç Burcusunuz.");
            }
            else if(day>=23&&day<=31){
                System.out.println("Aslan Burcusunuz.");
            }
        }
        if(month==8){

            if(day>=0 &&day<23){
                System.out.println("Aslan Burcusunuz.");
            }
            else if(day>=23&&day<=31){
                System.out.println("Başak Burcusunuz.");
            }
        }
        if(month==9){

            if(day>=0 &&day<23){
                System.out.println("Başak Burcusunuz.");
            }
            else if(day>=23&&day<=30){
                System.out.println("Terazi Burcusunuz.");
            }
        }
        if(month==10){

            if(day>=0 &&day<23){
                System.out.println("Terazi Burcusunuz.");
            }
            else if(day>=23&&day<=31){
                System.out.println("Akrep Burcusunuz.");
            }
        }
        if(month==11){

            if(day>=0 &&day<22){
                System.out.println("Akrep Burcusunuz.");
            }
            else if(day>=22&&day<=30){
                System.out.println("Yay Burcusunuz.");
            }
        }
        if(month==12){

            if(day>=0 &&day<22){
                System.out.println("Yay Burcusunuz.");
            }
            else if(day>=22&&day<=31){
                System.out.println("Kova Burcusunuz.");
            }
        }

    }

}
/* Kova Burcu : 22 Ocak - 19 Şubat
  Balık Burcu : 20 Şubat - 20 Mart
  Koç Burcu : 21 Mart - 20 Nisan
  Boğa Burcu : 21 Nisan - 21 Mayıs
  İkizler Burcu : 22 Mayıs - 22 Haziran-
  Yengeç Burcu : 23 Haziran - 22 Temmuz
  Aslan Burcu : 23 Temmuz - 22 Ağustos
  Başak Burcu : 23 Ağustos - 22 Eylül
  Terazi Burcu : 23 Eylül - 22 Ekim
  Akrep Burcu : 23 Ekim - 21 Kasım
  Yay Burcu : 22 Kasım - 21 Aralık
  Oğlak Burcu : 22 Aralık - 21 Ocak */