package com.array;

public class RangeChecking {

    public static void main(String[] args) {

        int[][] ranges = {
                {1, 2},
                {1, 9},
                {4, 8},
                {3, 6}
        };

        int n = ranges.length;

        for (int i = 0; i < n; i++) {

            boolean insideAnother = false;

            for (int j = 0; j < n; j++) {

                if (i == j) continue; // skip same range

                // check if range i is inside range j
                if (ranges[i][0] > ranges[j][0] &&
                    ranges[i][1] < ranges[j][1]) {

                    insideAnother = true;
                    break;
                }
            }

            if (insideAnother)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
