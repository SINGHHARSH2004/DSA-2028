class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>>adj=new ArrayList<>();
        int[]  indegree= new int[n];
        boolean[] vis=new boolean[n];
            for(int i=1;i<=n;i++){
                adj.add(new ArrayList<>());
            }
            for(int[] edge:pre){
                int u=edge[0];
                int v=edge[1];
                adj.get(v).add(u);
                indegree[u]++;
            }

            //khan's algo

            Queue<Integer>queue=new LinkedList<>();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(indegree[i]==0){
                    queue.add(i);
                    vis[i]=true;
                }
            }
            while(!queue.isEmpty()){
                int front=queue.poll();
                ans.add(front);
                for(int ele:adj.get(front)){
                    indegree[ele]--;
                    if(indegree[ele]==0){
                        queue.offer(ele);
                        vis[ele]=true;
                    }
                }
            }
            if(ans.size()==n){
                return true;
            }
            return false;
    }
}