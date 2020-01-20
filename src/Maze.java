import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Maze_Desktop{
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
    }}

class Maze_First extends Maze_Desktop {


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
        }}
    }}

class Player_Motion extends JFrame implements KeyListener {


    Maze_Desktop Mf2 = new Maze_First();




    public Player_Motion(String title, int width, int height) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        addKeyListener(this);
        Mf2.Maze_Desktop();
        System.out.println("値は"+Mf2.maze[1][6]);
        Mf2.Move_Count++;
    }

    public void keyTyped(KeyEvent e){
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        switch (keycode){
            case KeyEvent.VK_UP:{
                System.out.println("上");
                break;
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
                    break;
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
                    break;
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
                    break;
                }
                else{
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 0;
                    Mf2.RIGHT_LEFT++;
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 1;
                     Mf2.Maze_Desktop();
                    //Mf2.Maze_Desktopを行うとmaze[1][6]の値が０になる。なんで？
                     //Mf2.Maze_Desktopを行うとMf2.RIGHT_LEFTの値がリセットされる対処法は！！！？
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
        Maze_Desktop Mf = new Maze_First();
            Player_Motion gw = new Player_Motion("迷路ゲーム",1,1);
            gw.setVisible(true);
    }
}
