class Solution {
    int dest;
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dest = graph.length - 1;

        ArrayList<Integer> path = new ArrayList<>();
        path.add(0);

        dfs(graph, 0, path);
        return ans;
    }

    private void dfs(int[][] graph, int node, ArrayList<Integer> path) {
        if (node == dest) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int next : graph[node]) {
            path.add(next);
            dfs(graph, next, path);
            path.remove(path.size() - 1);
        }
    }
}