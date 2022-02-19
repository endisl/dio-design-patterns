package dsa;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class KnightMoves {

    int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    int[] dy = {-2, -1, 1, 2, -2, -1, 1, 2};
    Set<String> visited = new HashSet<>();
    public int minKnightMoves(int n, int startRow , int startCol, int y, int x) {

        //x and y here are always positive entries -> see constraints
        //x = Math.abs(x);
        //y = Math.abs(y);

        //constraints
        if ((n<4 || n>150) || (startCol<0 || startCol>=n) || (startRow<0 || startRow>=n)
                || (x<0 || x>=n) || (y<0 || y>=n) || (x==1 && y==1))
            return -1;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startRow, startCol});
        //visited.add(String.format("%s,%s",startRow,startCol));
        visited.add(startRow + "," + startCol);
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] pos = queue.poll();
                if (pos[0]==y && pos[1]==x) return count;
                addMoves(queue, pos);
            }
            count++;
        }
        return -1;
    }

    private void addMoves(Queue<int[]> queue, int[] pos) {
        for (int i = 0; i < 8; i++) {
            int nx = pos[1] + dx[i], ny = pos[0] + dy[i]; // (x,y) at positive direction; `nx >= -1 && ny >= -1` moves towards (x,y)
            if (!visited.contains(ny+","+nx) && nx >= -1 && ny >= -1) {
                queue.offer(new int[]{ny, nx});
                visited.add(ny+","+nx);
            }
        }
    }
}

//start at Origin (0,0)
/*public class McK3 {

    int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    int[] dy = {-2, -1, 1, 2, -2, -1, 1, 2};
    Set<String> visited = new HashSet<>();
    public int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited.add("0,0");
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] pos = queue.poll();
                if (pos[0]==x && pos[1]==y) return count;
                addMoves(queue, pos);
            }
            count++;
        }
        return -1;
    }

    private void addMoves(Queue<int[]> queue, int[] pos) {
        for (int i = 0; i < 8; i++) {
            int nx = pos[0] + dx[i], ny = pos[1] + dy[i]; // (x,y) at positive direction; `nx >= -1 && ny >= -1` moves towards (x,y)
            if (!visited.contains(nx+","+ny) && nx >= -1 && ny >= -1) {
                queue.offer(new int[]{nx, ny});
                visited.add(nx+","+ny);
            }
        }
    }
}*/
