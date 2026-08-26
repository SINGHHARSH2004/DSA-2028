class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1' && !vis[i][j]) {
                    bfs(i, j, grid, vis);
                    count++;
                }
            }
        }

        return count;
    }

    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    void bfs(int i, int j, char[][] grid, boolean[][] vis) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(i, j));
        vis[i][j] = true;  // important

        while (!queue.isEmpty()) {

            Pair front = queue.remove();

            int row = front.row;
            int col = front.col;

            if (row > 0 &&
                !vis[row - 1][col] &&
                grid[row - 1][col] == '1') {

                queue.add(new Pair(row - 1, col));
                vis[row - 1][col] = true;
            }

            if (row + 1 < m &&
                !vis[row + 1][col] &&
                grid[row + 1][col] == '1') {

                queue.add(new Pair(row + 1, col));
                vis[row + 1][col] = true;
            }

            if (col > 0 &&
                !vis[row][col - 1] &&
                grid[row][col - 1] == '1') {

                queue.add(new Pair(row, col - 1));
                vis[row][col - 1] = true;
            }

            if (col + 1 < n &&
                !vis[row][col + 1] &&
                grid[row][col + 1] == '1') {

                queue.add(new Pair(row, col + 1));
                vis[row][col + 1] = true;
            }
        }
    }
}