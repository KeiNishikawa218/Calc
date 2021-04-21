import java.util.Scanner;

public class Calc {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("簡易電卓です");
        System.out.println("2つの数について四則演算ができます");
        System.out.println("使い方：数字→改行→（+, -, *, /）いずれかの演算子→改行→数字の順で入力してください");

        float num1 = input.nextFloat();
        String nul = input.nextLine();
        String operator = input.nextLine();
        float num2 = input.nextFloat();

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("サポートされていない入力です");
        }

        input.close();
    }

}
