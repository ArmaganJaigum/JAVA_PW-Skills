package backTracking;

public class ratMazeOptimized {
    public static void main(String[] args) {   // This is optimised code here we use constant time
        int rows = 3;
        int cols = 4;
        int[][] maze = {{1,0,1,1},
                       {1,1,1,1},
                       {1,1,0,1}};
        print(0,0,rows-1,cols-1,"",maze);
    }

    private static void print(int sr, int sc, int er, int ec, String s,int[][] maze) {
        if (sr<0 || sc<0) return;
        if (sr>er || sc>ec) return;
        if (sr==er && sc==ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) return;  // blocked
        if (maze[sr][sc] == -1) return;  // this was already visited

        // check
        maze[sr][sc] = -1;
        // go right
        print(sr,sc+1,er,ec,s+"R",maze);
        // go Down
        print(sr+1,sc,er,ec,s+"D",maze);
        // go Left
        print(sr,sc-1,er,ec,s+"R",maze);
        // go up
        print(sr-1,sc,er,ec,s+"D",maze);

        // Backtracking
        maze[sr][sc] = 1;
    }
}
