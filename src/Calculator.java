import java.util.*;


public class Calculator {

    private long first;
    private long secound;


    public Calculator() {

        this.first = first;
        this.secound = secound;

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
