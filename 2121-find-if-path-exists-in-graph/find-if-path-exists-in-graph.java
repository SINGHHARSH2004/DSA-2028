class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();
            adj.add(list);
        }

        for(int i=0;i<edges.length;i++){
            int a=edges[i][0],b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[]visited=new boolean[n];
        visited[source]=true;
        bfs(visited,source,adj);
        if(visited[destination]==false){
            return false;
        }
        return true;
    }

    private void bfs(boolean[]visited,int source,List<List<Integer>>adj){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(source);
        while(!queue.isEmpty()){
            int front=queue.poll();
            for(int ele:adj.get(front)){
            if(!visited[ele]){
                visited[ele]=true;
                queue.add(ele);
            }
        }
        }
    }
}
