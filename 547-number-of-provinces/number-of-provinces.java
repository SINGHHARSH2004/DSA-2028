class Solution {
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int count=0;
        boolean[] vis =new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                bfs(i,vis,adj);
                count++;
            }
        }
        return  count;
    }
    private void bfs(int i,boolean[]vis,int[][] adj){
        vis[i]=true;
        int n=adj.length;
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(i);
        while(queue.size()>0){
            int front =queue.remove();
            for(int j=0;j<n;j++){
                if(adj[front][j]==1 && vis[j]==false){
                    queue.add(j);
                    vis[j]=true;
                }
            }
        }
    }
}