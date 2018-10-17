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


    public void calculator () {

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
                //System.out.println(in);
                //System.out.println(met);
                calculate();
                in.clear();
                met.clear();


            }

        }


    }

    public void calculate() {

        int pa = 0;
        int pb = 0;
        long result = 0;

        if (met.get(0).equals("+")) {

            result = sum(in.get(0), in.get(1));
            pb++;
            pb++;
            pa++;
        }

        if (met.get(0).equals("-")) {

            result = subt(in.get(0), in.get(1));
            pb++;
            pb++;
            pa++;
        }

        if (met.get(0).equals("*")) {

            result = mult(in.get(0), in.get(1));
            pb++;
            pb++;
            pa++;
        }

        if (met.get(0).equals("/")) {

            result = div(in.get(0), in.get(1));
            pb++;
            pb++;
            pa++;
        }

        if (met.get(0).equals("%")) {

            result = mod(in.get(0), in.get(1));
            pb++;
            pb++;
            pa++;
        }

        arrCount--;
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
