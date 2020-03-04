package edu.kis.vh.nursery.stackImplementation;

public class IntArrayStack {

	private static final int NUMBER_ARRAY_SIZE_ELEMENTS_COUNT = 12;
	private static final int[] numbers = new int[NUMBER_ARRAY_SIZE_ELEMENTS_COUNT];
	private static final int INITIAL_TOTAL_VALUE = -1;
	private static final int PEEKABOO_EMPTY_VALUE = -1;
	private final int COUNT_OUT_EMPTY_VALUE = -1;

	public IntArrayStack(int total) {
		this.total = total;
	}

	public IntArrayStack() {
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	private static int total = INITIAL_TOTAL_VALUE;


	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}
	public static boolean callCheck() {
		return total == PEEKABOO_EMPTY_VALUE;
	}

	public boolean isFull() {
		return total == NUMBER_ARRAY_SIZE_ELEMENTS_COUNT-1;
	}

	public static int peekaboo() {
		if (callCheck())
			return PEEKABOO_EMPTY_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return COUNT_OUT_EMPTY_VALUE;
		return numbers[total--];
	}
}
