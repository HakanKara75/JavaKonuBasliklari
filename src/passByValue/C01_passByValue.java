package passByValue;
import java.util.Scanner;

public class C01_passByValue {
    public static void main(String[] args) {
/*
kullanicidan bir int deger alalim
ve bu degeri 3 katina cikaran bir method olusturalim
olusturdugumuz degeri method icinde
ve main method icinde ayri ayri yazdiralim
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        katlama(sayi);
        System.out.println(sayi);//3

    }

    public static void katlama(int sayi) {
        sayi=sayi*3;
        System.out.println(sayi);//9
    }
}
