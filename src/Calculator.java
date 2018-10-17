import java.util.*;


public class Calculator {

    private long first;
    private long secound;
    private int arrCount;
    private ArrayList<Long> in = new ArrayList<Long>();
    private ArrayList<String> met = new ArrayList<String>();


    public Calculator() {

        this.first = first;
        this.secound = secound;

    }


    public void calculator() {

        Scanner reader = new Scanner(System.in);
        arrCount = 0;


        while (true) {

            //input int + method
            in.add(reader.nextLong());
            met.add(reader.next());

            //check size of arrays
            arrCount++;

            //break loop and calculate result if '=' appears and set suitable size of arrCount
            if (met.contains("=")) {
                arrCount--;

                calculate();

                in.clear();
                met.clear();

            }

        }


    }

    public void calculate() {

        int pa = 1;
        int pb = 0;
        long result = in.get(0);

        arrCount--;

        while (arrCount >= 0) {

            if (met.get(pb).equals("=")) {

                break;
            }

            if (met.get(pb).equals("+")) {

                result = sum(result, in.get(pa));
                pa++;
                pb++;

            }

            if (met.get(pb).equals("-")) {

                result = subt(result, in.get(pa));
                pa++;
                pb++;
            }

            if (met.get(pb).equals("*")) {

                result = mult(result, in.get(pa));
                pa++;
                pb++;
            }

            if (met.get(pb).equals("/")) {

                result = div(result, in.get(pa));
                pa++;
                pb++;
            }

            if (met.get(pb).equals("%")) {

                result = mod(result, in.get(pa));
                pa++;
                pb++;
            }

            arrCount--;
        }

        System.out.println(result);

    }

    public long sum(long one, long two) {

        first = one;
        secound = two;
        long sumOf;
        sumOf = one + two;

        return sumOf;

    }

    public long subt(long one, long two) {

        first = one;
        secound = two;
        long subtOf;
        subtOf = one - two;

        return subtOf;
    }

    public long mult(long one, long two) {

        first = one;
        secound = two;
        long multOf;
        multOf = one * two;

        return multOf;
    }

    public long div(long one, long two) {

        first = one;
        secound = two;
        long divOf;
        divOf = one / two;

        return divOf;
    }

    public long mod(long one, long two) {

        first = one;
        secound = two;
        long modOf;
        modOf = one % two;

        return modOf;
    }

}
