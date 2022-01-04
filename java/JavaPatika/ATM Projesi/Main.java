import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;


        System.out.print("Kullanıcı Adınız :");
        userName = input.nextLine();
        System.out.print("Parolanız : ");
        password = input.nextLine();

        System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

        System.out.println("1-Para yatırma\n" +
                "2-Para Çekme\n" +
                "3-Bakiye Sorgula\n" +
                "4-Çıkış");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

        while (true) {


            if (userName.equals("patika") && password.equals("dev123")) {

                select = input.nextInt();

                if (select == 4) {
                    System.out.println("Sistemden Çıkılıyor... Yine Bekleriz");
                    break;
                }
                switch (select) {

                    case 1:
                        System.out.print("Yatirmak istediğiniz Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Yeni Bakiyeniz: " + balance);

                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        break;

                    case 2:
                        System.out.print("Çekeceğiniz Para Miktarı: ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiyeniz Yetersiz.. Bakiyeniz: " + balance);
                        } else {
                            balance -= price;
                            System.out.println("Yeni Bakiyeniz: " + balance);
                        }
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        break;

                    case 3:
                        System.out.println("Bakiyeniz:" + balance);

                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                        break;

                    default:
                        System.out.println("Geçersiz İşlem Seçtiniz...");

                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                }
            }

            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }


            }

        }
    }
}













