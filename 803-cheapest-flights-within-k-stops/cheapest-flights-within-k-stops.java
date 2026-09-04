class Solution {
    public class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public class Triplet implements Comparable<Triplet> {
        int node;
        int cost;
        int stop;

        Triplet(int node, int cost, int stop) {
            this.node = node;
            this.cost = cost;
            this.stop = stop;
        }

        public int compareTo(Triplet t) {
            if (this.stop == t.stop)
                return Integer.compare(this.cost, t.cost);
            return Integer.compare(this.stop, t.stop);
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < flights.length; i++) {
            int from = flights[i][0];
            int to = flights[i][1];
            int price = flights[i][2];

            adj.get(from).add(new Pair(to, price));
        }

        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        pq.add(new Triplet(src, 0, 0));

        while (pq.size() > 0) {
            Triplet top = pq.remove();

            int node = top.node;
            int cost = top.cost;
            int stop = top.stop;

            if (stop == k + 1)
                continue;

            for (Pair p : adj.get(node)) {
                int totalCost = cost + p.cost;

                if (totalCost < ans[p.node]) {
                    ans[p.node] = totalCost;
                    pq.add(new Triplet(p.node, totalCost, stop + 1));
                }
            }
        }

        if (ans[dst] == Integer.MAX_VALUE)
            return -1;

        return ans[dst];
    }
}