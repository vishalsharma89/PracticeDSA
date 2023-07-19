package Backtracking;

import java.util.Arrays;

public class allPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path= new int[board.length][board[0].length];
        allPath("",board,0,0);
        allPathPrint("",board,0,0,path,1);
    }

    static void allPath(String s,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(s);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;//at start
        if(r< maze.length-1){
            allPath(s+"D",maze,r+1,c);
        }
        if(c< maze.length-1){
            allPath(s+"R",maze,r,c+1);
        }
        if(c>0){
            allPath(s+"L",maze,r,c-1);
        }
        if(r>0){
            allPath(s+"U",maze,r-1,c);
        }
        maze[r][c]=true;//at end

    }


    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
