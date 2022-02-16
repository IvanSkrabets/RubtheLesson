public class TaskEight {
    public static void main(String[] args) {
        String a = "";
        for (int i = 0; i < 4; i++) {
            a = a + "*";
            System.out.println(a);
        }
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < j; k++){
                System.out.print(" ");
        }
            for (int k = j; k < 4; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

