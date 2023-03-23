public class Solution {
    public int calculatePascalLayerTotal(int n) {
        if (n < 0) {
            return -1;
        }
        int[] prevRow = {1};
        int total = 1;
        for (int i = 1; i <= n; i++) {
            int[] row = new int[i + 1];
            row[0] = 1;
            for (int j = 1; j < i; j++) {
                row[j] = prevRow[j - 1] + prevRow[j];
            }
            row[i] = 0;
            prevRow = row;
            for (int j = 0; j <= i; j++) {
                total += row[j];
            }
        }
        return total;
    }
}
