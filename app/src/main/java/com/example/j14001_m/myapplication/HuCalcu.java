package com.example.j14001_m.myapplication;

import static com.example.j14001_m.myapplication.MainActivity.*;

/**
 * Created by J14001_M on 2018/01/29.
 */


public class HuCalcu {

    //七対子の場合
    int titoiCalcu(){
        return 25;
    }

    //ツモと平和の場合
    int pinhutumoCalcu(){
        return 20;
    }

    //通常のあがりの場合
    int tujouCalcu(){
        //符の合計
        int sum = 20;

        //刻子の値
        int k = 0;

        //門前清栄和加符
        //面前でロンの場合・鳴いてロンは0
        if (naki == false && tumo == false){
            sum = sum + 10;
        }

        //ツモ(面前でもなくてもいい)
        if (tumo){

            sum = sum + 2;
        }

        //面子の符計算
        //刻子があった場合
        if (Cntkotu > 0) {
            for (int j = 0; j < 4; j++) {
                k = kotu[j];
                //1又は9又は字牌なら(鳴いてない)
                if (k != 0 && !naki && k > 30 ||(k % 10 == 1 || k % 10 == 9)) {
                    sum = sum + 8;
                }
                //2～8なら(鳴いてない)
                else if (k != 0 && !naki && !(k % 10 == 1 || k % 10 == 9)){
                    sum = sum + 4;
                }
                //1又は9又は字牌なら(鳴いている)
                else if (k != 0 && naki && k > 30 ||(k % 10 == 1 || k % 10 == 9)){
                    sum = sum + 4;
                }
                //2～8なら(鳴いている)
                else if (k != 0 && naki && !(k % 10 == 1 || k % 10 == 9)){
                    sum = sum + 2;
                }
            }
        }

        //頭の種類
        //頭が場風と自風の値と同じなら
        if (atama == bakaze && atama == zikaze){
            sum = sum +4;
        }

        //三元牌又は場風・自風が同じなら
        else if (atama == 35|| atama == 36|| atama ==37 || atama == bakaze || atama == zikaze) {
            sum = sum + 2;
        }

        //待ちの形
        //両面又はシャボ以外ペンチャン・カンチャン・ノベタンなら
        if (!ryanmen && !syabo )  {
                sum = sum + 2;
        }
        //鳴いて20符のあがり形は30符に切り上げて計算
        if (sum == 20){
            sum = sum + 10;
        }

        //切り上げ処理
        double tmp = (double)sum/10;
        tmp=Math.ceil(tmp);
        sum = (int)tmp*10;

        return sum;

    }
}