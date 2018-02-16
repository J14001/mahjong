package com.example.j14001_m.myapplication;

import static com.example.j14001_m.myapplication.MainActivity.tumibo;


/**
 * Created by J14001_M on 2018/01/30.
 */


public class MajonCalcu {




    int Calcu(int mHu, int mYaku ,int kaze ,boolean tumo) {

        //親と子のツモあがりの点数
        //上が親の点数・下が子の点数
        //20符はツモの場合のみ
        if (mHu == 20 && mYaku == 2 && kaze == 31 && tumo) {

            return 700+100*tumibo;
        }
        else if (mHu == 20 && mYaku == 2 && kaze != 31 && tumo) {

            //return 1500+300*tumibo;
        }
        if (mHu == 20 && mYaku == 3 && kaze == 31 && tumo) {

            return 1300+100*tumibo;
        }
        else if (mHu == 20 && mYaku == 3 && kaze != 31 && tumo) {
            //return 2700+300*tumibo;
        }
        if (mHu == 20 && mYaku == 4 && kaze == 31 && tumo) {

            return 2600+100*tumibo;
        }
        else if (mHu == 20 && mYaku == 4 && kaze != 31 && tumo) {
            //return 5200+300*tumibo;
        }


        //25符
        if (mHu == 25 && mYaku == 3 && kaze == 31 && tumo) {
            return 1600+100*tumibo;
        }
        else if (mHu == 25 && mYaku == 3 && kaze != 31 && tumo) {
            //return 3200+300*tumibo;
        }

        if (mHu == 25 && mYaku == 4 && kaze == 31 && tumo) {
            return 3200+100*tumibo;
        }
        else if (mHu == 25 && mYaku == 4 && kaze != 31 && tumo) {
            //return 6400+300*tumibo;
        }



        //30符
        if (mHu == 30 && mYaku == 1 && kaze == 31 && tumo) {
            return 500+100*tumibo;
        }
        else if (mHu == 30 && mYaku == 1 && kaze != 31 && tumo) {
            //return 1000+300*tumibo;
        }

        if (mHu == 30 && mYaku == 2 && kaze == 31 && tumo) {
            return 1000+100*tumibo;
        }
        else if (mHu == 30 && mYaku == 2 && kaze != 31 && tumo) {
            //return 2000+300*tumibo;
        }

        if (mHu == 30 && mYaku == 3 && kaze == 31 && tumo) {
            return 2000+100*tumibo;
        }
        else if (mHu == 30 && mYaku == 3 && kaze != 31 && tumo) {
            //return 3900+300*tumibo;
        }

        if (mHu == 30 && mYaku == 4 && kaze == 31 && tumo) {
            return 4000+100*tumibo;
        }
        else if (mHu == 30 && mYaku == 4 && kaze != 31 && tumo) {
            //return 8000+300*tumibo;
        }



        //40符
        if (mHu == 40 && mYaku == 1 && kaze == 31 && tumo) {
            return 700+100*tumibo;
        }
        else if (mHu == 40 && mYaku == 1 && kaze != 31 && tumo) {
            //return 1300+300*tumibo;
        }

        if (mHu == 40 && mYaku == 2 && kaze == 31 && tumo) {
            return 1300+100*tumibo;
        }
        else if (mHu == 40 && mYaku == 2 && kaze != 31 && tumo) {
            //return 2600+300*tumibo;
        }

        if (mHu == 40 && mYaku == 3 && kaze == 31 && tumo) {
            return 2600+100*tumibo;
        }
        else if (mHu == 40 && mYaku == 3 && kaze != 31 && tumo) {
            //return 5200+300*tumibo;
        }

        if (mHu == 40 && mYaku == 4 && kaze == 31 && tumo) {
            return 4000+100*tumibo;
        }
        else if (mHu == 40 && mYaku == 4 && kaze != 31 && tumo) {

           // return 8000+300*tumibo;
        }



        //50符
        if (mHu == 50 && mYaku == 1 && kaze == 31 && tumo) {
            return 800+100*tumibo;
        }
        else if (mHu == 50 && mYaku == 1 && kaze != 31 && tumo) {
            //return 1600+300*tumibo;
        }

        if (mHu == 50 && mYaku == 2 && kaze == 31 && tumo) {
            return 1600+100*tumibo;
        }
        else if (mHu == 50 && mYaku == 2 && kaze != 31 && tumo) {
            //return 3200+300*tumibo;
        }

        if (mHu == 50 && mYaku == 3 && kaze == 31 && tumo) {
            return 3200+100*tumibo;
        }
        else if (mHu == 50 && mYaku == 3 && kaze != 31 && tumo) {
            //return 6400+300*tumibo;
        }

        if (mHu == 50 && mYaku == 4 && kaze == 31 && tumo) {
            return 4000+100*tumibo;
        }
        else if (mHu == 50 && mYaku == 4 && kaze != 31 && tumo) {
            //return 8000+300*tumibo;
        }



        //60符
        if (mHu == 60 && mYaku == 1 && kaze == 31 && tumo) {
            return 1000+100*tumibo;
        }
        else if (mHu == 60 && mYaku == 1 && kaze != 31 && tumo) {
            //return 2000+300*tumibo;
        }

        if (mHu == 60 && mYaku == 2 && kaze == 31 && tumo) {
            return 2000+100*tumibo;
        }
        else if (mHu == 60 && mYaku == 2 && kaze != 31 && tumo) {
         //   return 3900+300*tumibo;
        }

        if (mHu == 60 && mYaku >= 3 && mYaku <=4 && kaze == 31 && tumo) {
            return 4000+100*tumibo;
        }
        else if (mHu == 60 && mYaku == 3 && mYaku <=4 && kaze != 31 && tumo) {
        //    return 8000+300*tumibo;
        }


        //70符
        if (mHu == 70 && mYaku == 1 && kaze == 31 && tumo) {
            return 1200+100*tumibo;
        }
        else if (mHu == 70 && mYaku == 1 && kaze != 31 && tumo) {
            //return 2300+300*tumibo;
        }

        if (mHu == 70 && mYaku == 2 && kaze == 31 && tumo) {
            return 2300+100*tumibo;
        }
        else if (mHu == 70 && mYaku == 2 && kaze != 31 && tumo) {
            //return 4500+300*tumibo;
        }

        if (mHu == 70 && mYaku >= 3 && mYaku <=4 && kaze == 31 && tumo) {
            return 4000+100*tumibo;
        }
        else if (mHu == 70 && mYaku >= 3 && mYaku <=4 && kaze != 31 && tumo) {
            //return 8000+300*tumibo;
        }


        //満貫
        if (mYaku ==5 && kaze == 31 && tumo){
            return 4000+100*tumibo;
        }
        else if (mYaku ==5 && kaze != 31 && tumo){
            //return 8000+300*tumibo;
        }

        //跳満
        if (mYaku >=6 && mYaku<8 && kaze == 31 && tumo){
            return 6000+100*tumibo;
        }
        else if (mYaku >=6 && mYaku<8 && kaze != 31 && tumo){
            //return 12000+300*tumibo;
        }

        //倍満
        if (mYaku >=8 && mYaku<11 && kaze == 31 && tumo){
            return 8000+100*tumibo;
        }
        else if (mYaku >=8 && mYaku<11 && kaze != 31 && tumo){
            //return 16000+300*tumibo;
        }

        //三倍満
        if (mYaku >=11 && mYaku<13 && kaze == 31 && tumo){
            return 12000+100*tumibo;
        }
        else if (mYaku >=11 && mYaku<13 && kaze != 31 && tumo){
            //return 24000+300*tumibo;
        }


        //役満
        if (mYaku >=13 && mYaku<26 && kaze == 31 && tumo){
            return 16000+100*tumibo;
        }
        else if (mYaku >=13 && mYaku<26 && kaze != 31 && tumo){
            //return 32000;
        }

        //二倍役満
        if (mYaku >=26 && mYaku<39 && kaze == 31 && tumo){
            return 32000+100*tumibo;
        }
        else if (mYaku >=26 && mYaku<39 && kaze != 31 && tumo){
            //return 64000;
        }

        //三倍役満
        if (mYaku >=39 && mYaku<52 && kaze == 31 && tumo){
            return 48000+100*tumibo;
        }
        else if (mYaku >=39 && mYaku<52 && kaze != 31 && tumo){
            //return 960000;
        }

        //四倍役満
        if (mYaku >=52 && kaze == 31 && tumo){
            return 64000+100*tumibo;
        }
        else if (mYaku >=52 && kaze != 31 && tumo){
            //return 128000;
        }






        //親と子のロンあがりの点数
        //上が親の点数・下が子の点数
        //25符
        if (mHu == 25 && mYaku == 2 && kaze == 31 && !tumo) {
            return 2400+300*tumibo;
        }
        else if (mHu == 25 && mYaku == 2 && kaze != 31 && !tumo) {
            return 1600+300*tumibo;
        }

        if (mHu == 25 && mYaku == 3 && kaze == 31 && !tumo) {
            return 4800+300*tumibo;
        }
        else if (mHu == 25 && mYaku == 3 && kaze != 31 && !tumo) {
            return 3200+300*tumibo;
        }

        if (mHu == 25 && mYaku == 4 && kaze == 31 && !tumo) {
            return 9600+300*tumibo;
        }
        else if (mHu == 25 && mYaku == 4 && kaze != 31 && !tumo) {
            return 6400+300*tumibo;
        }



        //30符
        if (mHu == 30 && mYaku == 1 && kaze == 31 && !tumo) {
            return 1500+300*tumibo;
        }
        else if (mHu == 30 && mYaku == 1 && kaze != 31 && !tumo) {
            return 1000+300*tumibo;
        }

        if (mHu == 30 && mYaku == 2 && kaze == 31 && !tumo) {
            return 2900+300*tumibo;
        }
        else if (mHu == 30 && mYaku == 2 && kaze != 31 && !tumo) {
            return 2000+300*tumibo;
        }

        if (mHu == 30 && mYaku == 3 && kaze == 31 && !tumo) {
            return 5800+300*tumibo;
        }
        else if (mHu == 30 && mYaku == 3 && kaze != 31 && !tumo) {
            return 3900+300*tumibo;
        }

        if (mHu == 30 && mYaku == 4 && kaze == 31 && !tumo) {
            return 12000+300*tumibo;
        }
        else if (mHu == 30 && mYaku == 4 && kaze != 31 && !tumo) {
            return 8000+300*tumibo;
        }



        //40符
        if (mHu == 40 && mYaku == 1 && kaze == 31 && !tumo) {
            return 2000+300*tumibo;
        }
        else if (mHu == 40 && mYaku == 1 && kaze != 31 && !tumo) {
            return 1300+300*tumibo;
        }

        if (mHu == 40 && mYaku == 2 && kaze == 31 && !tumo) {
            return 3900+300*tumibo;
        }
        else if (mHu == 40 && mYaku == 2 && kaze != 31 && !tumo) {
            return 2600+300*tumibo;
        }

        if (mHu == 40 && mYaku == 3 && kaze == 31 && !tumo) {
            return 7700+300*tumibo;
        }
        else if (mHu == 40 && mYaku == 3 && kaze != 31 && !tumo) {
            return 5200+300*tumibo;
        }

        if (mHu == 40 && mYaku == 4 && kaze == 31 && !tumo) {
            return 12000+300*tumibo;
        }
        else if (mHu == 40 && mYaku == 4 && kaze != 31 && !tumo) {
            return 8000+300*tumibo;
        }




        //50符
        if (mHu == 50 && mYaku == 1 && kaze == 31 && !tumo) {
            return 2400+300*tumibo;
        }
        else if (mHu == 50 && mYaku == 1 && kaze != 31 && !tumo) {
            return 1600+300*tumibo;
        }

        if (mHu == 50 && mYaku == 2 && kaze == 31 && !tumo) {
            return 4800+300*tumibo;
        }
        else if (mHu == 50 && mYaku == 2 && kaze != 31 && !tumo) {
            return 3200+300*tumibo;
        }

        if (mHu == 50 && mYaku == 3 && kaze == 31 && !tumo) {
            return 9600+300*tumibo;
        }
        else if (mHu == 50 && mYaku == 3 && kaze != 31 && !tumo) {
            return 6400+300*tumibo;
        }

        if (mHu == 50 && mYaku == 4 && kaze == 31 && !tumo) {
            return 12000+300*tumibo;
        }
        else if (mHu == 50 && mYaku == 4 && kaze != 31 && !tumo) {
            return 8000+300*tumibo;
        }



        //60符
        if (mHu == 60 && mYaku == 1 && kaze == 31 && !tumo) {
            return 2900+300*tumibo;
        }
        else if (mHu == 60 && mYaku == 1 && kaze != 31 && !tumo) {
            return 2000+300*tumibo;
        }

        if (mHu == 60 && mYaku == 2 && kaze == 31 && !tumo) {
            return 5800+300*tumibo;
        }
        else if (mHu == 60 && mYaku == 2 && kaze != 31 && !tumo) {
            return 3900+300*tumibo;
        }

        if (mHu == 60 && mYaku >= 3 && mYaku <=4 && kaze == 31 && !tumo) {
            return 12000+300*tumibo;
        }
        else if (mHu == 60 && mYaku == 3 && mYaku <=4 && kaze != 31 && !tumo) {
            return 8000+300*tumibo;
        }


        //70符
        if (mHu == 70 && mYaku == 1 && kaze == 31 && !tumo) {
            return 3400+300*tumibo;
        }
        else if (mHu == 70 && mYaku == 1 && kaze != 31 && !tumo) {
            return 2300+300*tumibo;
        }

        if (mHu == 70 && mYaku == 2 && kaze == 31 && !tumo) {
            return 6800+300*tumibo;
        }
        else if (mHu == 70 && mYaku == 2 && kaze != 31 && !tumo) {
            return 4500+300*tumibo;
        }

        if (mHu == 70 && mYaku >= 3 && mYaku <=4 && kaze == 31 && !tumo) {
            return 12000+300*tumibo;
        }
        else if (mHu == 70 && mYaku >= 3 && mYaku <=4 && kaze != 31 && !tumo) {
            return 8000+300*tumibo;
        }


        //満貫
        if (mYaku ==5 && kaze == 31 && !tumo){
            return 12000+300*tumibo;
        }
        else if (mYaku ==5 && kaze != 31 && !tumo){
            return 8000+300*tumibo;
        }

        //跳満
        if (mYaku >=6 && mYaku<8 && kaze == 31 && !tumo){
            return 18000+300*tumibo;
        }
        else if (mYaku >=6 && mYaku<8 && kaze != 31 && !tumo){
            return 12000+300*tumibo;
        }

        //倍満
        if (mYaku >=8 && mYaku<11 && kaze == 31 && !tumo){
            return 24000+300*tumibo;
        }
        else if (mYaku >=8 && mYaku<11 && kaze != 31 && !tumo){
            return 16000+300*tumibo;
        }

        //三倍満
        if (mYaku >=11 && mYaku<13 && kaze == 31 && !tumo){
            return 36000+300*tumibo;
        }
        else if (mYaku >=11 && mYaku<13 && kaze != 31 && !tumo){
            return 24000+300*tumibo;
        }


        //役満
        if (mYaku >=13 && mYaku<26 && kaze == 31 && !tumo){
            return 48000+300*tumibo;
        }
        else if (mYaku >=13 && mYaku<26 && kaze != 31 && !tumo){
            return 32000;
        }









        //二倍役満
        if (mYaku >=26 && mYaku<39 && kaze == 31 && !tumo){
            return 96000;
        }
        else if (mYaku >=26 && mYaku<39 && kaze != 31 && !tumo){
            return 64000;
        }

        //三倍役満
        if (mYaku >=39 && mYaku<52 && kaze == 31 && !tumo){
            return 144000;
        }
        else if (mYaku >=39 && mYaku<52 && kaze != 31 && !tumo){
            return 960000;
        }

        //四倍役満
        if (mYaku >=52 && kaze == 31 && !tumo){
            return 192000;
        }
        else if (mYaku >=52 && kaze != 31 && !tumo){
            return 128000;
        }


        return 0;
    }

}
