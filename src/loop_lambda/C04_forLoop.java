package loop_lambda;

import java.util.Comparator;
import java.util.stream.IntStream;

public class C04_forLoop {
    public static void main(String[] args) {
        /*
        Soru 4) 100'den baslayarak 50'ye (dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin
         */
        int bas=100;
        int son=50;
        for (int i = bas; i >=son ; i--) {
            if (i>son){
                System.out.print(i+",");
            }else System.out.print(i);
        }
}}