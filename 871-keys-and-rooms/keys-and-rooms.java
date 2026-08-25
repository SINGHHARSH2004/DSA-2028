class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n=adj.size();
        boolean[] visited=new boolean[n];
        visited[0]=true;
        bfs(0,adj,visited);
        for(boolean ele:visited){
            if(ele==false){
                return false;
            }
        }
        return true;
    }
   private void  bfs(int start,List<List<Integer>>adj,boolean[]visited ){
    Queue<Integer> queue=new LinkedList<>();
    queue.offer(start);
    while(queue.size()>0){
        int front=queue.remove();
        for(int ele:adj.get(front)){
            if(!visited[ele]){
                visited[ele]=true;
                queue.add(ele);
            }
        }
    }
   }
}