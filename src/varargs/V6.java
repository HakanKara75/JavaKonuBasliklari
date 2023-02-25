package varargs;

public class V6 {
    public static void main(String[] args) {
        System.out.println(avg(1.2, 4.8));
        System.out.println(avg(1.2, 4.8, 6));
    }
    public static double avg(double i, double j) {
        System.out.print("Good ");
        return (i+j)/2;
    }
    public static double avg(double... k) {
        System.out.print("Bad ");
        double sum = 0;
        for(int i=0; i<k.length; i++) {
            sum = sum + k[i];
        }
        return sum/k.length;
    }

/*    Output?
    A) Good 3.0
    Bad 4.0
    B) Good 3
    Bad 4
    C) Compile Time Error
    D) Bad 3.0
    Bad 4.0 */
}