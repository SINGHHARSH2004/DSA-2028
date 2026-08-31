class Solution {
    public int networkDelayTime(int[][] times, int n, int src) {

        ArrayList<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // u -> v with weight wt
        for (int[] ele : times) {
            int u = ele[0];
            int v = ele[1];
            int wt = ele[2];

            adj.get(u).add(new int[]{v, wt});
        }
        int[] ans = new int[n + 1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        PriorityQueue<int[]> queue =
            new PriorityQueue<>((a, b) -> a[1] - b[1]);
        queue.add(new int[]{src, 0});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0];
            int time = curr[1];
            if (time > ans[node]) {
                continue;
            }
            for (int[] nei : adj.get(node)) {
                int nextNode = nei[0];
                int wt = nei[1];
                int totalTime = time + wt;
                if (totalTime < ans[nextNode]) {
                    ans[nextNode] = totalTime;
                    queue.add(new int[]{nextNode, totalTime});
                }
            }
        }
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (ans[i] == Integer.MAX_VALUE) {
                return -1;
            }
            maxTime = Math.max(maxTime, ans[i]);
        }
        return maxTime;
    }
}