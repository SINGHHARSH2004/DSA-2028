import java.util.*;

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int[][] dist = new int[m][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        dist[0][0] = 0;
        pq.offer(new int[]{0, 0, 0});

        int[][] directions = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
        };

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int effort = curr[0];
            int row = curr[1];
            int col = curr[2];
            if (effort > dist[row][col]) {
                continue;
            }
            if (row == m - 1 && col == n - 1) {
                return effort;
            }

            for (int[] dir : directions) {

                int nr = row + dir[0];
                int nc = col + dir[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                int difference = Math.abs(
                    heights[row][col] - heights[nr][nc]
                );

                int newEffort = Math.max(effort, difference);

                if (newEffort < dist[nr][nc]) {

                    dist[nr][nc] = newEffort;

                    pq.offer(new int[]{
                        newEffort,
                        nr,
                        nc
                    });
                }
            }
        }

        return 0;
    }
}