package edu.kis.vh.nursery.stackImplementation;

public class IntLinkedList implements IntLinkedListInterface {


	private final int POP_RETURN_VALUE_IF_LIST_IS_EMPTY = -1;
	private final int TOP_RETURN_VALUE_IF_LIST_IS_EMPTY = -1;
	private Node last;
	int i;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return TOP_RETURN_VALUE_IF_LIST_IS_EMPTY;
		return last.VALUE;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return POP_RETURN_VALUE_IF_LIST_IS_EMPTY;
		int ret = last.VALUE;
		last = last.prev;
		return ret;
	}

}
