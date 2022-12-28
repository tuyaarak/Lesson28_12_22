import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a > b ? a : b; // тернарный оператор


        // комментировать Ctrl + Shift + /

        /* if (a > b ) {
            max = a;

        } else {
            max = b;
          }+/

       // тернарный оператор - start
       // result = condition ? trueCase : elseCase;

       // тернарный оператор - end

        }
}
