class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});

        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int steps = current[2];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols || maze[newRow][newCol] == '+') {
                    continue;
                }

                if (newRow == 0 || newRow == rows - 1 || newCol == 0 || newCol == cols - 1) {
                    return steps + 1;
                }

                maze[newRow][newCol] = '+';
                queue.offer(new int[]{newRow, newCol, steps + 1});
            }
        }

        return -1;
    }
}
