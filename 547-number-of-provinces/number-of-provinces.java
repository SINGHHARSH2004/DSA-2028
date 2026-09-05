class Solution {
    public void bfs(int[][]adj,boolean[]vis,int i){
        int len=adj.length;
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(i);
        vis[i]=true;
        while(!queue.isEmpty()){
            int front=queue.poll();
            for(int j=0;j<len;j++){
                if(adj[front][j]==1 && vis[j]==false){
                    queue.offer(j);
                    vis[j]=true;
                }
            }

        }

    }
    public int findCircleNum(int[][] adj) {
        int m=adj.length;
        boolean []vis=new boolean[m];
        int count=0;
        for(int i=0;i<m;i++){
                if(!vis[i]){
                        bfs(adj,vis,i);
                        count++;
                }
                

        }
        
        return count;
    }
}