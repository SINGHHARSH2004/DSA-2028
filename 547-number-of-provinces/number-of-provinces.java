class Solution {
    public int findCircleNum(int[][] adj) {
        int count=0;
        int n=adj.length;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                bfs(adj,i,vis);
                count++;
            }
        }
        return count;
    }
    public void bfs(int[][]adj,int i,boolean[] vis){
        int n=adj.length;
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(i);
        vis[i]=true;
        while(!queue.isEmpty()){
            int front=queue.poll();
        for(int j=0;j<n;j++){
            
            if(adj[front][j]==1 && vis[j]==false){
                vis[j]=true;
                queue.offer(j);
            }
        }
        }
       
    }
}