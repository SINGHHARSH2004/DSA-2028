class Solution {

    class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    class Triplet implements Comparable<Triplet> {
        int node;
        int cost;
        int stop;

        Triplet(int node, int cost, int stop) {
            this.node = node;
            this.cost = cost;
            this.stop = stop;
        }

        public int compareTo(Triplet t) {
            return Integer.compare(this.cost, t.cost);
        }
    }

    public int findCheapestPrice(int n, int[][] flights,
                                 int src, int dst, int k) {

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
        int[][] dist = new int[n][k + 2];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        dist[src][0] = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        pq.add(new Triplet(src, 0, 0));

        while (!pq.isEmpty()) {

            Triplet top = pq.remove();

            int node = top.node;
            int cost = top.cost;
            int stop = top.stop;

            if (node == dst) {
                return cost;
            }
            if (stop == k + 1) {
                continue;
            }

            for (Pair p : adj.get(node)) {

                int newCost = cost + p.cost;
                int newStop = stop + 1;

                if (newCost < dist[p.node][newStop]) {

                    dist[p.node][newStop] = newCost;

                    pq.add(
                        new Triplet(
                            p.node,
                            newCost,
                            newStop
                        )
                    );
                }
            }
        }

        return -1;
    }
}