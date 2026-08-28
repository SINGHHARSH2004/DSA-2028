class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);

        }
        boolean[]vis=new boolean[n];
       
            bfs( adj,source,destination,vis);

        if(vis[destination]==true){
            return true;
        }
        return false;
    }
  public void  bfs( List<List<Integer>>adj,int source,int destination,boolean[] vis){
                Queue<Integer>queue=new LinkedList<>();
                vis[source]=true;
                queue.add(source);
                int n=adj.size();
                while(!queue.isEmpty()){
                    int front=queue.poll();
                    for(int ele:adj.get(front)){
                        if(!vis[ele]){
                            vis[ele]=true;
                            queue.offer(ele);
                                if(ele==destination){
                                    return ;
                                }
                        }
                    }
                }
            }
}