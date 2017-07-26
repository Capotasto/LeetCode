package solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TowSumTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void answer1() throws Exception {
        int[] nums = {2, 7, 11, 15};
        assertArrayEquals(TowSum.answer1(nums, 9), new int[]{0, 1});
    }

    @Test
    public void answer1_2() throws Exception {
        int[] nums = {3, 2, 4};
        assertArrayEquals(TowSum.answer1(nums, 6), new int[]{1, 2});
    }

    @Test
    public void answer2() throws Exception {
        int[] nums = {2, 7, 11, 15};
        assertArrayEquals(TowSum.answer2(nums, 9), new int[]{0, 1});
    }

    @Test
    public void answer2_2() throws Exception {
        int[] nums = {3, 2, 4};
        assertArrayEquals(TowSum.answer2(nums, 6), new int[]{1, 2});
    }

}