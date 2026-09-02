class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][]vis=new boolean[m][n];
        int maxArea=0;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    int area=0;
              area=  bfs(grid,vis,area,i,j);
               maxArea=Math.max(area,maxArea);
            }
           
             }
        }
        return maxArea;
    }
    public int bfs(int [][]grid,boolean[][]vis,int area,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]>queue=new LinkedList<>();
        queue.offer(new int[]{i,j});
        vis[i][j]=true;
        area++;
        while(!queue.isEmpty()){
            int[] curr=queue.poll();
            int row=curr[0];
            int col=curr[1];
            if(row>0){
                if(vis[row-1][col]==false && grid[row-1][col]==1){
                    queue.offer(new int[] {row-1,col});
                    vis[row-1][col]=true;
                    area++;
                }
            }

                if(row+1<m){
                if(vis[row+1][col]==false && grid[row+1][col]==1){
                    queue.offer(new int[] {row+1,col});
                    vis[row+1][col]=true;
                    area++;
                }
                }

                if(col>0){
                if(vis[row][col-1]==false && grid[row][col-1]==1){
                    queue.offer(new int[] {row,col-1});
                    vis[row][col-1]=true;
                    area++;
                }
                }

                if(col+1<n){
                if(vis[row][col+1]==false && grid[row][col+1]==1){
                    queue.offer(new int[] {row,col+1});
                    vis[row][col+1]=true;
                    area++;
                }
                }
            }
            return area;
        }
    
}