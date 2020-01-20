package jp.ac.uryukyu.ie.e195706;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



class Maze_First  {
    public int IMPOTAL_OBJECT = 3;
    public int WALL = 2;
    public int ROAD = 0;
    public int PLAYER = 1;
    public int GOAL = 9;
    public int xsize = 7;
    public int ysize = 7;
    public int Move_Count =0;

    public int UP_DOWN =1;
    public int RIGHT_LEFT = 1;


    int[][] maze = new int[ysize][xsize];
    void Maze_Desktop(){
        if(Move_Count !=0){
            for(int i = 0; i < ysize; i++) {
                switch (i) {
                    case 0: {
                        for (int k = 0; k < xsize; k++) {
                            System.out.print("|" + maze[i][k]);
                        }
                        System.out.println("|");
                        break;
                    }
                    case 6: {
                        for (int k = 0; k < xsize; k++) {
                            System.out.print("|" + maze[i][k]);
                        }
                        System.out.println("|");
                        break;
                    }
                    default: {
                        for (int k = 0; k < xsize; k++) {
                            switch (k) {
                                case 0: {
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 1: {
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 6: {
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                default:
                                    System.out.print(" " + maze[i][k]);
                                    break;
                            }
                        }
                        System.out.println("|");
                        break;
                    }
                }

            }
        }
        if(Move_Count ==0){
            for(int i = 0; i < ysize; i++) {
                switch (i) {
                    case 0: {
                        for (int k = 0; k < xsize; k++) {
                            maze[i][k] = IMPOTAL_OBJECT;
                            System.out.print("|" + maze[i][k]);
                        }
                        System.out.println("|");
                        break;
                    }
                    case 1:{
                        for (int k = 0; k < xsize; k++) {
                            switch (k){
                                case 0: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 1:{
                                    maze[i][k] = PLAYER;
                                    System.out.print("|" + maze[i][k]); break; }
                                case 3:{
                                    maze[i][k] = WALL;
                                    System.out.print(" " + maze[i][k]); break;
                                }
                                case 6: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                default:
                                    maze[i][k] = ROAD;
                                    System.out.print(" " + maze[i][k]);
                                    break;
                            }
                        }
                        System.out.println("|");
                        break;
                    }
                    case 2:{
                        for (int k = 0; k < xsize; k++) {
                            switch (k) {
                                case 0: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 1: {
                                    maze[i][k] = ROAD;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 2:{
                                    maze[i][k] = WALL;
                                    System.out.print(" " + maze[i][k]);break;
                                }
                                case 6: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                default:
                                    maze[i][k] = ROAD;
                                    System.out.print(" " + maze[i][k]);
                                    break;
                            }
                        }
                        System.out.println("|");
                        break;
                            }
                    case 3:{
                        for (int k = 0; k < xsize; k++) {
                            switch (k) {
                                case 0: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 1: {
                                    maze[i][k] = ROAD;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 4:{
                                    maze[i][k] = WALL;
                                    System.out.print(" " + maze[i][k]);break;
                                }
                                case 6: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                default:
                                    maze[i][k] = ROAD;
                                    System.out.print(" " + maze[i][k]);
                                    break;
                            }
                        }
                        System.out.println("|");
                        break;
                    }
                    case 5:{
                        for (int k = 0; k < xsize; k++) {
                            switch (k){
                                case 0: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 1: {
                                    maze[i][k] = ROAD;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 3:{
                                    maze[i][k] = WALL;
                                    System.out.print(" " + maze[i][k]);
                                    break;
                                }
                                case 5:{
                                    maze[i][k] = GOAL;
                                    System.out.print(" " + maze[i][k]);
                                    break;}
                                case 6: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }

                                default:
                                    maze[i][k] = ROAD;
                                    System.out.print(" " + maze[i][k]);
                                    break;
                            }
                        }System.out.println("|");
                        break;
                    }
                    case 6: {
                        for (int k = 0; k < xsize; k++) {
                            maze[i][k] = IMPOTAL_OBJECT;
                            System.out.print("|" + maze[i][k]);
                        }
                        System.out.println("|");
                        break;
                    }
                    default: {
                        for (int k = 0; k < xsize; k++) {
                            switch (k) {
                                case 0: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 1: {
                                    maze[i][k] = ROAD;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                case 6: {
                                    maze[i][k] = IMPOTAL_OBJECT;
                                    System.out.print("|" + maze[i][k]);
                                    break;
                                }
                                default:
                                    maze[i][k] = ROAD;
                                    System.out.print(" " + maze[i][k]);
                                    break;
                            }
                        }
                        System.out.println("|");
                        break;
                    }
                }
            }
        }
    }}

class Player_Motion extends JFrame implements KeyListener {
    Maze_First Mf2 = new Maze_First();
    public Player_Motion(String title, int width, int height) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);



        addKeyListener(this);
        Mf2.Maze_Desktop();
        Mf2.Move_Count++;
    }

    public void keyTyped(KeyEvent e){
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        switch (keycode){
            case KeyEvent.VK_UP:{
                if(Mf2.maze[Mf2.UP_DOWN-1][Mf2.RIGHT_LEFT] == Mf2.WALL){
                    System.out.println("いけないよ");
                    break;
                }
                else if(Mf2.maze[Mf2.UP_DOWN-1][Mf2.RIGHT_LEFT] == Mf2.IMPOTAL_OBJECT){
                    System.out.println("いけないよ");
                    break;
                }
                else if(Mf2.maze[Mf2.UP_DOWN-1][Mf2.RIGHT_LEFT] == Mf2.GOAL){
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] =0;
                    Mf2.maze[Mf2.UP_DOWN-1][Mf2.RIGHT_LEFT] =1;
                    Mf2.Maze_Desktop();
                    System.out.println("ゲームクリア！！！おめでとう！");
                    dispose();
                    System.exit(0);
                }
                else{Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 0;
                    Mf2.UP_DOWN--;
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 1;
                    Mf2.Maze_Desktop();
                    break;
                }
            }
            case KeyEvent.VK_DOWN:{
                if(Mf2.maze[Mf2.UP_DOWN+1][Mf2.RIGHT_LEFT] == Mf2.WALL){
                    System.out.println("いけないよ");
                    break;
                }
                else if(Mf2.maze[Mf2.UP_DOWN+1][Mf2.RIGHT_LEFT] == Mf2.IMPOTAL_OBJECT){
                    System.out.println("いけないよ");
                    break;
                }
                else if(Mf2.maze[Mf2.UP_DOWN+1][Mf2.RIGHT_LEFT] == Mf2.GOAL){
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] =0;
                    Mf2.maze[Mf2.UP_DOWN+1][Mf2.RIGHT_LEFT] =1;
                    Mf2.Maze_Desktop();
                    System.out.println("ゲームクリア！！！おめでとう！");
                    dispose();
                    System.exit(0);
                }
                else{Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 0;
                    Mf2.UP_DOWN++;
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 1;
                    Mf2.Maze_Desktop();
                    break;
                }

            }
            case KeyEvent.VK_LEFT:{
                if(Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT-1] == Mf2.WALL){
                    System.out.println("いけないよ");
                }
                else if(Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT-1] == Mf2.IMPOTAL_OBJECT){
                    System.out.println("いけないよ");
                }
                else if(Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT-1] == Mf2.GOAL){
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] =0;
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT-1] =1;
                    Mf2.Maze_Desktop();
                    System.out.println("ゲームクリア！！！おめでとう！");
                    dispose();
                    System.exit(0);
                }
                else{Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 0;
                    Mf2.RIGHT_LEFT--;
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 1;
                    Mf2.Maze_Desktop();
                }
                break;
            }
            case KeyEvent.VK_RIGHT:{
                if(Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT+1] == Mf2.WALL){
                    System.out.println("いけないよ");
                }
                else if(Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT+1] == Mf2.IMPOTAL_OBJECT){
                    System.out.println("いけないよ");
                }
                else if(Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT+1] == Mf2.GOAL){
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] =0;
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT+1] =1;
                    Mf2.Maze_Desktop();
                    System.out.println("ゲームクリア！！！おめでとう！");
                    dispose();
                    System.exit(0);
                }
                else{
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 0;
                    Mf2.RIGHT_LEFT++;
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 1;
                    Mf2.Maze_Desktop();
                }
            }break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
    }

}


public class Maze {
    public static void main(String[] args){
        Player_Motion gw = new Player_Motion("迷路ゲーム",1,1);
        gw.setVisible(true);
    }
}