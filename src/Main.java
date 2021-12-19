import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input=new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz:");
        n1=input.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam="+(n1+n2));
                break;
            case 2:
                System.out.println("Cikarma=" +(n1-n2));
                break;
            case 3:
                System.out.println("Carpma="+(n1*n2));
                break;
            case 4:
                if (n2!=0){
                    System.out.println("Bolme="+  (n1/n2));
                }else {
                    System.out.println("0' a bolunmez");
                }
                break;
            default:
                System.out.println("Lutfen dogru secim yapin");

        }

    }
}
