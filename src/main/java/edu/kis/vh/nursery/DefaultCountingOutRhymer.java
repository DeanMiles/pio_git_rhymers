package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImplementation.IntArrayStack;

public class DefaultCountingOutRhymer {

    public edu.kis.vh.nursery.stackImplementation.IntArrayStack IntArrayStack;
    private IntArrayStack intArrayStack = new IntArrayStack();

    public static boolean callCheck() {
        return edu.kis.vh.nursery.stackImplementation.IntArrayStack.callCheck();
    }

    public boolean isFull() {
        return IntArrayStack.isFull();
    }

    public static int peekaboo() {
        return edu.kis.vh.nursery.stackImplementation.IntArrayStack.peekaboo();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public void setTotal(int total) {
        intArrayStack.setTotal(total);
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public int countOut() {
        return intArrayStack.countOut();
    }
}
