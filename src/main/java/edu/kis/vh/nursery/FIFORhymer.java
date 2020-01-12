package edu.kis.vh.nursery;

/**
 * Class FIFORhymer used in RhymersFactory
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     *  instance created for operation and greater transparency
     */
    private final DefaultCountingOutRhymer TEMP = new DefaultCountingOutRhymer();

    /**
     * @return the number which is rejected
     */
    @Override
    public int countOut() {
        while (!callCheck())

            TEMP.countIn(super.countOut());

        int ret = TEMP.countOut();

        while (!TEMP.callCheck())

            countIn(TEMP.countOut());

        return ret;
    }
}
