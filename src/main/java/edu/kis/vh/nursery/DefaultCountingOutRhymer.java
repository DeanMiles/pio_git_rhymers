package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int NUMBER_ARRAY_SIZE_ELEMENTS_COUNT = 12;
    private final int[] NUMBERS = new int[NUMBER_ARRAY_SIZE_ELEMENTS_COUNT];
    private final int INITIAL_TOTAL_VALUE = -1;
    private final int PEEKABOO_EMPTY_VALUE = -1;
    private final int COUNT_OUT_EMPTY_VALUE = -1;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total = INITIAL_TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == INITIAL_TOTAL_VALUE;
    }

    boolean isFull() {
        return total == NUMBER_ARRAY_SIZE_ELEMENTS_COUNT-1;
    }

    int peekaboo() {
        if (callCheck())
            return PEEKABOO_EMPTY_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return COUNT_OUT_EMPTY_VALUE;
        return NUMBERS[total--];
    }

}
