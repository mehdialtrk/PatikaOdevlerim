import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi Giriniz: ");
        int sayi = input.nextInt();
        asalMi(sayi);
    }
    static int asalMi(int sayi) {
        int sayac = 0, bolum;
        for (bolum = 2; bolum < sayi; bolum++) {
            if (sayi == 2) {
                System.out.println(sayi + " Sayisi ASALdır !");
                break;
            }
            //eğer küsürat 0 ise tam olarak bölünmüş demektir
            else if (sayi % bolum == 0) {

                sayac++;
                break;
            }
        }
        if (sayac == 0) {
            System.out.println(sayi + " Sayisi ASALdır !");
        } else{
            System.out.println(sayi + " Sayisi ASAL Değildir !");}


    return sayi;


}}







