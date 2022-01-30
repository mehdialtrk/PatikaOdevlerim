
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayisi: ");
        int a=input.nextInt();
        System.out.print(duzen(a));


    }
    static int duzen(int a){
        for (int i=a;i>-5;i-=5){

            System.out.print(i+" ");

        }
        for(int j=a%5;j<a;j+=5){
            if(j==0){
                System.out.print("");
            }
            else

                System.out.print(j+" ");
        }

        return a;
    }

}
