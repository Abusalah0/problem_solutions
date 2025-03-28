class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean [] vis = new boolean[rooms.size()];   
        vis[0] = true;

        Stack<Integer> keys = new Stack();
        keys.add(0);

        while(!keys.isEmpty())
        {
            int cur = keys.pop();
            for (int n: rooms.get(cur))
            {
                if (!vis[n])
                {
                    vis[n] = true;
                    keys.add(n);
                }
            }
        }
        for(boolean visited: vis)
        {
            if (!visited)
                return false;
        }

        return true;

    }
}