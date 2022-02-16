public class Tasktwelve {
    public static void main(String[] args) {
        int a = 59 ;
        int c = 0;
         for ( int i = 1 ; i<10 ; i++ ){
                c=c+a%10;
                a/=10;
             System.out.println(a);
            }
            System.out.println("Сумма всех чисел введенного числа равна "+c);
        }
    }

