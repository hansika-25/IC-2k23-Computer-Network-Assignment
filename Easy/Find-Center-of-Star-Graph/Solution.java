class Solution {
    public int findCenter(int[][] edges) {
        
        // Check if the first node of both edges is the center
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        }

        // Otherwise, the second node of the first edge is the center
        return edges[0][1];
    }
}