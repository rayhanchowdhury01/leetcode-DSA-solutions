class Solution {
     public static int maxPoints(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> slope1 = new HashMap<>();
            HashMap<Double, Integer> verticalSlope = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;

                double x1 = points[i][0];
                double x2 = points[j][0];
                double y1 = points[i][1];
                double y2 = points[j][1];

                if (x1 == x2) {
                    verticalSlope.put(x1, verticalSlope.getOrDefault(x1, 0) + 1);
                    res = Math.max(res, verticalSlope.get(x1));
                } else {
                    double slope = (y2 - y1) / (x2 - x1);
                    slope1.put(slope, slope1.getOrDefault(slope, 0) + 1);
                    res = Math.max(res, slope1.get(slope));
                }
            }
        }
        return res + 1;
    }
}