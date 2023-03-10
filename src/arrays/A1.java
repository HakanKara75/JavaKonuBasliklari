package arrays;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
/*        Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
                Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10  */
        int[ ] a = new int[ ]{12, 5, 8, 13};
        Arrays.sort(a);
        if(a.length%2!=0){
            Integer ortadakiElemaninIndexi = a.length/2;
            System.out.println(a[ortadakiElemaninIndexi]);
        }else{
            Integer ortadakiElemaninIndexi = a.length/2;
            Integer ortadakiEleman = (a[ortadakiElemaninIndexi] + a[ortadakiElemaninIndexi -1])/2;
            System.out.println(ortadakiEleman);
    }
}
}