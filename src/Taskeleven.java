public class Taskeleven {
    public static void main(String[] args) {
        int a = 53 ;
        int b = 0 ;
        for (int i = 1 ; i <= a ; i++){
            if (a % i == 0) {
                b++;
            }
        }if ( b == 2 ) {
            System.out.println("число " + a + " простое");
        }else {
            System.out.println("число " + a + " сложное");
        }
    }
}
