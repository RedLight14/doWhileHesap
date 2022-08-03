import java.util.Scanner;

public class doWhileHesap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x,topla=0;

        do {
            System.out.print("Sayi giriniz : ");
            x = inp.nextInt();
            if(x%2==0&&x%4==0)
            {
                topla+=x;
            }
        }while(x%2==1);
        System.out.print("toplam : "+topla);
    }
    }
