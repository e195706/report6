package jp.ac.uryukyu.ie.e195706;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



class Maze_First  {
    public int IMPOTAL_OBJECT = 3;//外壁
    public int WALL = 2;//壁
    public int ROAD = 0;//道
    public int PLAYER = 1;//プレイヤー
    public int GOAL = 9;//ゴール地点
    public int xsize = 7;//迷路の横軸
    public int ysize = 7;//迷路の縦軸
    public int Move_Count =0;//入力回数

    public int UP_DOWN =1;//上下の矢印キーによる位置の変動
    public int RIGHT_LEFT = 1;//左右の矢印キーによる位置の変動


    int[][] maze = new int[ysize][xsize];//迷路の概要
    void Maze_Desktop(){//初期の迷路とプレイヤーを移動させた際に迷路を表示するメソッド
        if(Move_Count !=0){
            //プレイヤーを動かした際の迷路の変動
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
            //初期の迷路（プレイヤーが動く前の状態）
            //迷路の外周をIMPOTAL_OBJECTとし移動できないようにする
            //スタート地点をmaze[1][1]とし、ゴール地点はmaze[5][5]とする

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
    //JFrameとKeyListnerを使用
    //画面を新規に作成、表示している間は操作を受付
    //矢印キーを入力した際プレイヤーが矢印の向きと同様に１マス動くように設定
    Maze_First Mf2 = new Maze_First();
    public Player_Motion(String title, int width, int height) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//画面を閉じると終了
        setSize(width,height);//画面のサイズ
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);



        addKeyListener(this);//入力を受付
        Mf2.Maze_Desktop();
        Mf2.Move_Count++;
    }

    public void keyTyped(KeyEvent e){
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        switch (keycode){
            case KeyEvent.VK_UP:{//上の矢印キー
                if(Mf2.maze[Mf2.UP_DOWN-1][Mf2.RIGHT_LEFT] == Mf2.WALL){
                    //壁に衝突した際の処理
                    System.out.println("いけないよ");
                    break;
                }
                else if(Mf2.maze[Mf2.UP_DOWN-1][Mf2.RIGHT_LEFT] == Mf2.IMPOTAL_OBJECT){
                    //外周に衝突した際の処理
                    System.out.println("いけないよ");
                    break;
                }
                else if(Mf2.maze[Mf2.UP_DOWN-1][Mf2.RIGHT_LEFT] == Mf2.GOAL){
                    //ゴール地点に到達した際の処理
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] =0;
                    Mf2.maze[Mf2.UP_DOWN-1][Mf2.RIGHT_LEFT] =1;
                    Mf2.Maze_Desktop();
                    System.out.println("ゲームクリア！！！おめでとう！");
                    dispose();
                    System.exit(0);
                }
                else{//道の処理
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 0;
                    Mf2.UP_DOWN--;
                    Mf2.maze[Mf2.UP_DOWN][Mf2.RIGHT_LEFT] = 1;
                    Mf2.Maze_Desktop();
                    break;
                }
            }
            case KeyEvent.VK_DOWN:{//下の矢印キー
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
            case KeyEvent.VK_LEFT:{//左の矢印キー
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
            case KeyEvent.VK_RIGHT:{//右の矢印キー
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
//今回はKeyPressedのみ使用するため、KeyReleasedとKeytypedは変更しない

public class Main {
    public static void main(String[] args){
        Player_Motion gw = new Player_Motion("迷路ゲーム",1,1);
        gw.setVisible(true);
    }
}