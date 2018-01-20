package mk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void test1041() {
        int checkBinaryGap = 1041;
        int result = solution.solution(checkBinaryGap);
        assertTrue(5 == result);
    }

    @Test
    public void test9() {
        int checkBinaryGap = 9;
        int result = solution.solution(checkBinaryGap);
        assertTrue(2 == result);
    }

    @Test
    public void test529() {
        int checkBinaryGap = 529;
        int result = solution.solution(checkBinaryGap);
        assertTrue(4 == result);
    }

    @Test
    public void test20() {
        int checkBinaryGap = 20;
        int result = solution.solution(checkBinaryGap);
        assertTrue(1 == result);
    }

    @Test
    public void test1024() {
        int checkBinaryGap = 1024;
        int result = solution.solution(checkBinaryGap);
        assertTrue(0 == result);
    }

    @Test
    public void test16() {
        int checkBinaryGap = 16;
        int result = solution.solution(checkBinaryGap);
        assertTrue(0 == result);
    }

}