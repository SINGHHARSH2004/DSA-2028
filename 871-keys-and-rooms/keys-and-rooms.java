class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n=adj.size();
        boolean[] vis=new boolean[n];
          bfs(adj,0,vis);

          for(boolean ele:vis){
            if(ele==false){
                return false;
            }
          }
          return true;
    }
    public void bfs(List<List<Integer>> adj,int i,boolean[] vis){
        Queue<Integer>queue=new LinkedList<>();
        vis[i]=true;
        queue.offer(i);
        while(!queue.isEmpty()){
            int front=queue.poll();
            for(int ele:adj.get(front)){
                if(!vis[ele]){
                    vis[ele]=true;
                    queue.offer(ele);
                }
            }
        }
    }
}