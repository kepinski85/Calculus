import java.util.*;


public class Calculator {

    private long first;
    private long secound;


    public Calculator() {

        this.first = first;
        this.secound = secound;

    }


    public void input() {

        Scanner reader = new Scanner(System.in);


        ArrayList<Integer> in = new ArrayList<Integer>();
        ArrayList<String> met = new ArrayList<String>();

        int arrCount = 0;

        while (true) {

            //input int + method
            in.add(reader.nextInt());
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


    public void sum(long one, long two) {

        first = one;
        secound = two;
        long sumOf;
        sumOf = one + two;

        System.out.println(sumOf);

    }

    public void subt(long one, long two) {

        first = one;
        secound = two;
        long subtOf;
        subtOf = one - two;

        System.out.println(subtOf);
    }

    public void mult(long one, long two) {

        first = one;
        secound = two;
        long multOf;
        multOf = one * two;

        System.out.println(multOf);
    }

    public void div(long one, long two) {

        first = one;
        secound = two;
        long divOf;
        divOf = one / two;

        System.out.println(divOf);
    }

    public void mod(long one, long two) {

        first = one;
        secound = two;
        long modOf;
        modOf = one % two;

        System.out.println(modOf);
    }


}
