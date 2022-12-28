import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a > b ? a : b; // тернарный оператор
        String result = a == b ? "equal"  :
                       a > b ? "more" : "Less";
        System.out.println(result);

        if (a == b) {
            result - "равно";
        } else if (a > b) {
            result = "больше";
        } else {
            result = "меньше";
        }
        // второй случай использования тернарного оператора - end

        // тернарный оператор - start
                           if (10 > 9)           "выражение верно"      "выражение не верно"

       //  String result = выражение сравнения ? сли верно выражение : если выражение не верно;

       // тернарный оператор - end

        }
}
