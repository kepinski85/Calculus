import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Calculator calc = new Calculator();
        int a;
        int b;
        String method;
        String start;

        while (true) {
            a = reader.nextInt();
            method = reader.next();
            b = reader.nextInt();
            start = reader.next();


            if (start.equals("=") && method.equals("+")) {

                calc.sum(a, b);
            } else if (start.equals("=") && method.equals("-")) {

                calc.subt(a, b);
            } else if (start.equals("=") && method.equals("*")) {

                calc.mult(a, b);
            } else if (start.equals("=") && method.equals("/")) {

                calc.div(a, b);
            } else if (start.equals("=")&& method.equals("%")) {

                calc.mod(a, b);
            }

        }





}





}