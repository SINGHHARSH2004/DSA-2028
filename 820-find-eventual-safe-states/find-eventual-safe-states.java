class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>>adj=new ArrayList<>();
        int [] indegree=new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
        for(int ele:graph[i]){
            adj.get(ele).add(i);
            indegree[i]++;
        }
        }
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                queue.add(i);
            }    
        }
        List<Integer>ans=new ArrayList<>();
        while(queue.size()>0){
            int front=queue.poll();
            ans.add(front);
            for(int ele:adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0){
                    queue.add(ele);
                }
            }
        }
         Collections.sort(ans);
        return ans;
    }
}