import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birinciSayi, ikinciSayi, ekok,ebob=1, bolen=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz: ");
        birinciSayi = input.nextInt();

        System.out.print("İkinci Sayiyi Giriniz: ");
        ikinciSayi = input.nextInt();

        /*    // *******EBOB bulma Algoritması(For Dongüsü ile)********
        if (birinciSayi > ikinciSayi) {
            for (bolen = 1; bolen <= ikinciSayi; bolen++) {

                if (birinciSayi % bolen == 0 && ikinciSayi % bolen == 0) {

                    ebob=bolen;


                }
            }
            System.out.println("Girdiğiniz Sayiların Ebob'u: "+ebob);

        }
        else {
            for (bolen = 1; bolen <= birinciSayi; bolen++) {
                if (birinciSayi % bolen == 0 && ikinciSayi % bolen == 0) {
                    ebob=bolen;
                    }
                }
            System.out.println("Girdiğiniz Sayiların Ebob'u: "+ebob);

            }
        // *******EKOK bulma Algoritması********

            //Bilgi: Ekok=(birinciSayi*ikinciSayi)/ebob;
            ekok=(birinciSayi*ikinciSayi)/ebob;
        System.out.println("Girdiğiniz Sayiların Ekok'u: "+ekok);*/

        if (birinciSayi > ikinciSayi) {
            // *******EBOB bulma Algoritması(While Döngüsü ile)********
            while(bolen<=ikinciSayi){
                if (birinciSayi % bolen == 0 && ikinciSayi % bolen == 0) {
                ebob=bolen;

                }
                bolen++;
            }
            System.out.println("Girdiğiniz Sayiların Ebob'u: "+ebob);

            // *******EKOK bulma Algoritması********
            //Bilgi: Ekok=(birinciSayi*ikinciSayi)/ebob;


            ekok=(birinciSayi*ikinciSayi)/ebob;
            System.out.println("Girdiğiniz Sayiların Ekok'u: "+ekok);
        }
        else  {
            // *******EBOB bulma Algoritması********
            while(bolen<=birinciSayi){
                if (birinciSayi % bolen == 0 && ikinciSayi % bolen == 0) {
                    ebob=bolen;

                }
                bolen++;
            }
            System.out.println("Girdiğiniz Sayiların Ebob'u: "+ebob);

            // *******EKOK bulma Algoritması********
            //Bilgi: Ekok=(birinciSayi*ikinciSayi)/ebob;


            ekok=(birinciSayi*ikinciSayi)/ebob;
            System.out.println("Girdiğiniz Sayiların Ekok'u: "+ekok);
        }



        }
    }








