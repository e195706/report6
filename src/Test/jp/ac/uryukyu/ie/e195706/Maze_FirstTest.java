package jp.ac.uryukyu.ie.e195706;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maze_FirstTest {
    /*
    * 迷路が正しく生成されているかどうかの確認*/
    @Test
    void maze_Desktop() {
        Maze_First check = new Maze_First();
        check.Maze_Desktop();
        assertEquals(check.GOAL,check.maze[5][5]);
    }
}