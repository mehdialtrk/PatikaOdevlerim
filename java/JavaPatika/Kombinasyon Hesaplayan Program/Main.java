import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
       N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        // C(n,r) = n! / (r! * (n-r)!)*/


        int elemanSayisi,altKumeSayisi,fact1=1,fact2=1,fact3=1;
        long Faktoriyel, Faktoriyel2,Faktoriyel3;

        Scanner input =new Scanner(System.in);

        System.out.print("Kümenin Eleman Sayisini Giriniz: ");
        elemanSayisi=input.nextInt();


        System.out.print("Alt Küme Sayisini Giriniz: ");
        altKumeSayisi=input.nextInt();
        for (int i=1;i<=elemanSayisi;i++){

                fact1*=i;

        }
        Faktoriyel=fact1;

        for (int i=1;i<=altKumeSayisi;i++){

            fact2*=i;

        }
        Faktoriyel2=fact2;
        for (int i=1;i<=(elemanSayisi-altKumeSayisi) ;i++){

            fact3*=i;

        }
        Faktoriyel3=fact3;
        // C(n,r) = n! / (r! * (n-r)!)
        long sonuc=Faktoriyel/(Faktoriyel2*Faktoriyel3);

        System.out.println(elemanSayisi+" elemanlı Kumenin "+altKumeSayisi+" eleman sayili alt küme sayisi : "+sonuc+" olur");

    }
}