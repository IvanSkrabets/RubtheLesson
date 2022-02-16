public class TaskThree {
    public static void main(String[] args) {
        double a = 0.5 ;
        int b = 0;
        for (int i = 1 ; i <= 256 ; i*=2){
            a = a*2 ;
            b+=a ;
            System.out.println(a);
        }
        System.out.println(b);
    }
}
