import java.util.*;


public class Calculator {

    private int first;
    private int secound;


    public Calculator() {

        this.first = first;
        this.secound = secound;

    }


    public void sum(int one, int two) {

        first = one;
        secound = two;
        int sumOf;
        sumOf = one + two;

        System.out.println(sumOf);

    }

    public void subt(int one, int two) {

        first = one;
        secound = two;
        int subtOf;
        subtOf = one - two;

        System.out.println(subtOf);
    }

    public void mult(int one, int two) {

        first = one;
        secound = two;
        int multOf;
        multOf = one * two;

        System.out.println(multOf);
    }

    public void div(int one, int two) {

        first = one;
        secound = two;
        int divOf;
        divOf = one / two;

        System.out.println(divOf);
    }

    public void mod(int one, int two) {

        first = one;
        secound = two;
        int modOf;
        modOf = one % two;

        System.out.println(modOf);
    }


}
