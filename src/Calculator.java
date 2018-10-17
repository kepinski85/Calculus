import java.util.*;


public class Calculator {

    private long first;
    private long secound;
    private int arrCount = 0;
    private ArrayList<Long> in = new ArrayList<Long>();
    private ArrayList<String> met = new ArrayList<String>();


    public Calculator() {

        this.first = first;
        this.secound = secound;

    }


    public void input() {

        Scanner reader = new Scanner(System.in);


        while (true) {

            //input int + method
            in.add(reader.nextLong());
            met.add(reader.next());

            //check size of arrays
            arrCount++;

            //break loop if '=' appears and set suitable size of arrCount
            if (met.contains("=")) {
                arrCount--;
                break;
            }
        }

        System.out.println(in);
        System.out.println(met);
    }

    public void calculate() {

        while (arrCount >= 0) {

            int pa = 0;
            int pb = 0;

            if (met.get(pa).equals("+")) {

                sum(in.get(pb), in.get(pb + 1));
                pb++;
                pb++;
                pa++;
            }

            if (met.get(pa).equals("-")) {

                subt(in.get(pb), in.get(pb + 1));
                pb++;
                pb++;
                pa++;
            }

            if (met.get(pa).equals("*")) {

                mult(in.get(pb), in.get(pb + 1));
                pb++;
                pb++;
                pa++;
            }

            if (met.get(pa).equals("/")) {

                div(in.get(pb), in.get(pb + 1));
                pb++;
                pb++;
                pa++;
            }

            if (met.get(pa).equals("%")) {

                mod(in.get(pb), in.get(pb + 1));
                pb++;
                pb++;
                pa++;
            }


            arrCount--;
        }


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
