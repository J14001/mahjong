package com.example.j14001_m.myapplication;


/**
 * Created by J14001_M on 2018/01/31.
 */

public class YakuCnt {
    Yakuhantei yakuhantei = new Yakuhantei();

    //通常の役の場合
    int cnt(){
        //役満
        int yaku1= yakuhantei.suanko();
        int yaku2= yakuhantei.daisangen();
        int yaku3= yakuhantei.ryuiso();
        int yaku4= yakuhantei.tuiso();
        int yaku5= yakuhantei.syosusi();
        int yaku6= yakuhantei.daisusi();
        int yaku7= yakuhantei.tyurenpoto();
        int yaku8= yakuhantei.tiho() ;
        int yaku9= yakuhantei.tenho();
        int yaku10 = 0;
        int yaku11 = 0;
        int yaku12 = 0;
        int yaku13 = 0;
        int yaku14 = 0;
        int yaku15 = 0;
        int yaku16 = 0;
        int yaku17 = 0;
        int yaku18 = 0;
        int yaku19 = 0;
        int yaku20 = 0;
        int yaku21 = 0;
        int yaku22 = 0;
        int yaku23 = 0;
        int yaku24 = 0;
        int yaku25 = 0;
        int yaku26 = 0;
        int yaku27 = 0;
        int yaku28 = 0;
        int yaku29 = 0;
        int yaku30 = 0;
        int yaku31 = 0;
        int yaku32 = 0;
        int yaku33 = 0;
        int yaku34 = 0;
        int yaku35 = 0;
        int yaku36 = 0;
        int yaku37 = 0;
        int yaku38 = 0;
        int yaku39 = 0;
        int yaku40 = 0;

        //役の翻数
        int sum =0;


        //役満だったら判定をしない
        if (yaku1 == 0 && yaku2 == 0 && yaku3 == 0 && yaku4 == 0 && yaku5 == 0 && yaku6 == 0 && yaku7 == 0 && yaku8 == 0 && yaku9 == 0 ) {

            yaku10 = yakuhantei.ryanpeko();
            if (yaku10 == 0) {
                yaku11=yakuhantei.ipeko();
            }

            yaku12 = yakuhantei.menzentumo();
            yaku13 = yakuhantei.pinhu();
            yaku14 = yakuhantei.tanyao();
            yaku15 = yakuhantei.toitoi();
            yaku16 = yakuhantei.sananko();
            yaku17 = yakuhantei.sansyokudoko();
            yaku18 = yakuhantei.sansyokudoujun();
            yaku19 = yakuhantei.ikkitukan();
            yaku20 = yakuhantei.tyanta();
            yaku21 = yakuhantei.honitu();
            yaku22 =yakuhantei.juntyan();
            yaku23 = yakuhantei.honroto();
            yaku24 = yakuhantei.tinitu();
            yaku25 = yakuhantei.renpuhai();
            yaku26 = yakuhantei.ton();
            yaku27 = yakuhantei.nan();
            yaku28 = yakuhantei.sya();
            yaku29 = yakuhantei.pe();
            yaku30 = yakuhantei.riti();
            yaku31 = yakuhantei.dabururiti();
            yaku32 = yakuhantei.ippatu();
            yaku33 = yakuhantei.rinsyan();
            yaku34 = yakuhantei.tyankan();
            yaku35 = yakuhantei.haitei();
            yaku36 = yakuhantei.hotei() ;
            yaku37 = yakuhantei.haku();
            yaku38 = yakuhantei.hatu();
            yaku39 = yakuhantei.tyun();
            yaku40 = yakuhantei.dora();

        }
        //ドラがつかない場合
        else {
            sum = yaku1+yaku2+yaku3+yaku4+yaku5+yaku6+yaku7+yaku8+yaku9;
            return sum;
        }

        sum = yaku1+yaku2+yaku3+yaku4+yaku5+yaku6+yaku7+yaku8+yaku9+yaku10
                +yaku11+yaku12+yaku13+yaku14+yaku15+yaku16+yaku17+yaku18+yaku19+yaku20
                +yaku21+yaku22+yaku23+yaku24+yaku25+yaku26+yaku27+yaku28+yaku29+yaku30
                +yaku31+yaku32+yaku33+yaku34+yaku35+yaku36+yaku37+yaku38+yaku39+yaku40;

        return sum;
    }

    //国士無双の場合
    int cntkokusi(){

        int sum = 0;

        //役満
        int yaku1=yakuhantei.kokusimuso();
        int yaku2=yakuhantei.tenho();
        int yaku3=yakuhantei.tiho();

        sum = yaku1+yaku2+yaku3;

        return sum;
    }

    //七対子の場合
    int cnttitoi(){
        int yaku1 = yakuhantei.tuiso();
        int yaku2 = 0;
        int yaku3 = 0;
        int yaku4 = 0;
        int yaku5 = 0;
        int yaku6 = 0;
        int yaku7 = 0;
        int yaku8 = 0;
        int yaku9 = 0;
        int yaku10 = 0;
        int yaku11 = 0;
        int yaku12 = 0;
        int yaku13 = 0;
        int sum =0;

        //役満だったら判定をしない
        if (yaku1 == 0) {
            yaku2 = yakuhantei.titoi();
            yaku3 = yakuhantei.tanyao();
            yaku4 = yakuhantei.honitu();
            yaku5 = yakuhantei.honroto();
            yaku6 = yakuhantei.tinitu();
            yaku7 = yakuhantei.menzentumo();
            yaku8 = yakuhantei.riti();
            yaku9 = yakuhantei.dabururiti();
            yaku10 = yakuhantei.ippatu();
            yaku11 = yakuhantei.haitei();
            yaku12 = yakuhantei.hotei();
            yaku13 = yakuhantei.dora();
        }

        else {
            sum = yaku1;
            return sum;
        }
        sum = yaku1+yaku2+yaku3+yaku4+yaku5+yaku6+yaku7+yaku8+yaku9+yaku10+yaku11+yaku12+yaku13;
        return sum;
    }

    //平和ツモの場合
    int pinhutumo(){
        int yaku1 = 0;
        int yaku2 = 0;
        int yaku3 = 0;
        int yaku4 = 0;
        int yaku5 = 0;
        int yaku6 = 0;
        int yaku7 = 0;
        int yaku8 = 0;
        int yaku9 = 0;
        int yaku10 = 0;
        int yaku11 = 0;
        int yaku12 = 0;
        int yaku13 = 0;
        int yaku14 = 0;
        int yaku15 = 0;
        int yaku16 = 0;

        int sum = 0;

        //yaku1 = yakuhantei.menzentumo();
        yaku2 = yakuhantei.ipeko();
        yaku3 = yakuhantei.tanyao();
        yaku4 = yakuhantei.honitu();
        yaku5 = yakuhantei.ryanpeko();
        yaku6 = yakuhantei.tinitu();
        yaku7 = yakuhantei.juntyan();
        yaku8 = yakuhantei.riti();
        yaku9 = yakuhantei.dabururiti();
        yaku10 = yakuhantei.ippatu();
        yaku11 = yakuhantei.haitei();
        yaku12 = yakuhantei.sansyokudoujun();
        yaku13 = yakuhantei.ikkitukan();
        yaku14 = yakuhantei.tyanta();
        //yaku15 = yakuhantei.pinhu();
        yaku16 = yakuhantei.dora();
        sum = yaku1+yaku2+yaku3+yaku4+yaku5+yaku6+yaku7+yaku8+yaku9+yaku10+yaku11+yaku12+yaku13+yaku14+yaku15+yaku16;

        return sum;
    }
}
