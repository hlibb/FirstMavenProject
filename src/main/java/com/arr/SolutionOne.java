package com.arr;

public class SolutionOne {

    public int numJewelsInStones(String jewels, String stones) {
        char[] charArr1 = jewels.toCharArray();
        char[] charArr2 = stones.toCharArray();
        int count = 0;

        for (char c1 : charArr1) {
            for (char c2 : charArr2) {
                if (c1 == c2) count++;
            }
        }
        return count;
    }
}
