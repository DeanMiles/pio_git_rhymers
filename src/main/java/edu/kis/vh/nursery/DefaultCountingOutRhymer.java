package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == -1;
    }

    boolean isFull() {
        return total == 11;
    }

    int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
