package Backtracking;

import java.util.ArrayList;

public class countPathForMaze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathRetDiagonal("",3,3));
//        path("",3,3);

        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
pathRest("",board,0,0);
    }
    static int count(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);

        return left+right;
    }

    static void path(String s,int r,int c){
        if(r==1&&c==1){
            System.out.println(s);

        }
        if(r>1){
            path(s+"D",r-1,c);
        }
        if(c>1){
            path(s+"R",r,c-1);
        }
    }

//    Using ArrayList
    static ArrayList<String> pathRet(String s, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(s+"D",r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(s+"R",r,c-1));
        }
        return list;
    }

    //    Using ArrayList and including diagonal path
    static ArrayList<String> pathRetDiagonal(String s, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(pathRetDiagonal(s+"Diag",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathRetDiagonal(s+"D",r-1,c));
        }
        if(c>1){
            list.addAll(pathRetDiagonal(s+"R",r,c-1));
        }
        return list;
    }

    static void pathRest(String s,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(s);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r< maze.length-1){
            pathRest(s+"D",maze,r+1,c);
        }
        if(c< maze.length-1){
            pathRest(s+"R",maze,r,c+1);
        }
    }
}
