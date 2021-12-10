import java.util.Scanner;

public class Main {
    /* Java ile Matematik, Fizik, Kimya, Türkçe,Müzik derslerinin sinav puanlarini kullanicidan alan ve
    ortalamalarini hesaplayip ekrana bastirilan programi yazin.*/

    /*Ayni program içerisinde koşullu ifadeler kullanilarak, eğer kullanicinin ortalamasi 55'dan buyuk ise ekrana
    "Sinifi Gecti" , küçük ise "Sinifta Kaldi" yazsin.*/
    /*Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/



    public static void main(String[] args) {


        int mat, fizik, kimya, turkce, muzik;




        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat=sc.nextInt();
        int ders1=(mat>100 || mat<0) ?0:mat;        // eğer matematik 100den buyuk ya da 0 dan küçük ise  0 olarak al, tersi ise girilen notu(ders1'i) al.

        System.out.print("Fizik notunuz: ");
        fizik = sc.nextInt();
        int ders2=(fizik>100 || fizik<0) ? 0:fizik;

        System.out.print("Kimya notunuz: ");
        kimya = sc.nextInt();
        int ders3=(kimya>100 || kimya<0) ? 0:kimya;

        System.out.print("Turkce notunuz: ");
        turkce = sc.nextInt();
        int ders4=(turkce>100 || turkce<0 ) ? 0:turkce;

        System.out.print("Muzik notunuz: ");
        muzik = sc.nextInt();
        int ders5=(muzik>100 || muzik<0) ? 0:muzik;




        int toplam = (ders1+ders2+ders3+ders4+ders5);

        double ort = toplam / 5.0;

        if (ort>=55&&ort<=100)
            System.out.println("Tebrikler...Sınıfı Geçtiniz.");

        else if (ort>=0&&ort<55)
            System.out.println("Sınıfta Kaldınız....");

        System.out.println("Ortalamanız: "+ort);

    }
}