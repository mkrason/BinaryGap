package mk;

public class Solution {

    public int solution(int n) {

        String strBin = Integer.toBinaryString(n);
        int lastOne = strBin.lastIndexOf("1");
        int firstOne = strBin.indexOf("1");
        int i = firstOne;
        int maxGap = 0;

        while (i < lastOne) {
            int first = strBin.indexOf("1", i++);
            int second = strBin.indexOf("1", i);
            int gap = second - first;
            if (gap > maxGap) {
                maxGap = gap;
            }
        }

        if (maxGap > 0) {
            maxGap--;
        }

        return maxGap;
    }
}
