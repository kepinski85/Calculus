import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        Calculator calc = new Calculator();

        ArrayList<Integer> in = new ArrayList<Integer>();
        ArrayList<String> met = new ArrayList<String>();

        int arrCount = 0;

        while (true) {

            in.add(reader.nextInt());
            met.add(reader.next());

            arrCount++;

            if (met.contains("=")) {
                arrCount--;
                break;
            }
        }

        System.out.println(in.size());
        System.out.println(met.size());
        System.out.println(arrCount);

    }
}