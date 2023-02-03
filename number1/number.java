package number1;

public class number {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            System.out.print('"');
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
                if (j+1 <= 5)
                    System.out.print(" ");

            }
            System.out.println('"');
        }
    }
}
