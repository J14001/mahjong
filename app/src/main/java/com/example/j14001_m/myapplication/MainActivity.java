package com.example.j14001_m.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    //手配
    //31東　32南　33西　34北　35白　36発　37中
    public static int [] pi ={1,2,3,7,8,9,22,23,24,14,15,16,18,18};
    //public static int [] pi ={2,2,3,3,4,4,5,5,22,22,22,31,31,31};

    //public static int [] pi ={2,2,6,6,12,12,8,8,24,24,33,33,36,36};
    //public static int [] pi ={1,11,21,9,19,29,31,32,33,34,35,36,37,36};


    //自分で入力するもの
    //ドラと積み棒
    public static int dora = 0;
    public static int tumibo = 0;
    //場風(31: 東、32: 南、33: 西、34: 北)
    public static int bakaze = 31;
    public static int zikaze = 31;

    //自分で入力
    public static boolean menzentumo = false;
    public static boolean riti = false;
    public static boolean dabururiti = false;
    public static boolean ippatu = false;
    public static boolean rinsyan = false;
    public static boolean tyankan = false;
    public static boolean haitei = false;
    public static boolean hotei = false;
    public static boolean tiho = false;
    public static boolean tenho = false;
    public static boolean tumo = true;

    public static boolean naki = false;
    //待ち方
    public static boolean ryanmen =true;
    public static boolean syabo = false;
    public static boolean tanki = false;

    //役の数
    int yakuCnt = 0;
    int yakuCnt1 = 0;
    int yakuCnt2 = 0;

    //刻子の配列
    public static int kotu[] = new int[4];
    //順子の配列
    public static int syuntu[] = new int[12];
    //kind:牌の種類分け
    public static int kind[] = new int[38];

    //役の名前
    public static String yakuname = null;

    String str = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;

    //kindのコピー・判定で使っていく
    int tmp[] = new int[38];

    //牌の数
    int hai = 0;

    //あがりの判定
    int sum = 0;
    //国士無双のあがり判定
    int kokusisum = 0;
    //七対子のあがり判定
    int titoisum = 0;

    //刻子・順子の数　役判定で使用する
    public static int Cntkotu = 0;
    public static int Cntsyuntu = 0;

    //頭・刻子・順子の重複のチェック
    int Checkatama =0;
    int Checkkotu = 0;
    int Checksyuntu = 0;
    int Checkatama1 =0;
    int Checkkotu1 = 0;
    int Checksyuntu1 = 0;
    int Checkatama2=0;
    int Checkkotu2 = 0;
    int Checksyuntu2 = 0;

    //点数の比較
    int score = 0;
    int score1 = 0;
    int score2 = 0;

    //点数の比較
    int hu = 0;
    int hu1 = 0;
    int hu2 = 0;

    //頭の判定・重複させないようにする
    public static int atama =0;

    //刻子と順子の配列の添え字
    int kotuNo = 0;
    int syuntuNo = 0;

    //あがりフラグ
    boolean agari = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView textView = (TextView)this.findViewById(R.id.yaku);
        TextView textView1 = (TextView)this.findViewById(R.id.hu);
        TextView textView2 = (TextView)this.findViewById(R.id.han);
        TextView textView3 = (TextView)this.findViewById(R.id.score);
        TextView textView4 = (TextView)this.findViewById(R.id.all);



        HuCalcu hucalcu = new HuCalcu();
        YakuCnt yakucnt = new YakuCnt();
        MajonCalcu majoncalcu = new MajonCalcu();


        //1～9：マンズ,11～19：ピンズ,21～29：ソーズ,31～37:東南西北白発中
        for (int i = 1; i < 38; i++) {
            //10,20,30とばす
            if (i % 10 == 0) {
                i = i + 1;
            }

            //kind:牌の種類分け
            for (int j = 1; j <= pi.length; j++) {
                if (i == pi[j - 1]) {
                    kind[i] = kind[i] + 1;
                }
            }
        }

        //牌の数の確認
        for (int i = 1; i < 38; i++) {
            hai = kind[i] + hai;
        }

        Log.d("合計数", "" + hai);

        //牌の数が14枚
        if (hai == 14) {

            //刻子・順子の順番で判定
            for (int i = 1; i < 38; i++) {

                Checkatama = 0;
                Checkkotu =0;
                Checksyuntu =0;

                resethensu();
                resetArray();

                //頭の判定
                if (tmp[i] >= 2) {
                    tmp[i] = tmp[i] - 2;
                    Checkatama = i;
                    atama = Checkatama;

                } else {
                    continue;
                }

                for (int j = 1; j < 38; j++) {
                    //刻子の判定
                    if (tmp[j] >= 3) {
                        tmp[j] = tmp[j] - 3;
                        Checkkotu = Checkkotu + 1;
                        Cntkotu = Checkkotu;

                        kotu[kotuNo] = j;
                        kotuNo = kotuNo+1;
                    }
                }

                //31~37を除外して字牌の処理
                for (int j = 1; j < 38 - 8; j++) {
                    //順子の判定
                    if ((tmp[j] >= 1) && (tmp[j + 1] >= 1) && (tmp[j + 2] >= 1)) {
                        tmp[j] = tmp[j] - 1;
                        tmp[j + 1] = tmp[j + 1] - 1;
                        tmp[j + 2] = tmp[j + 2] - 1;

                        syuntu[syuntuNo] = j;
                        syuntu[syuntuNo+1] = j+1;
                        syuntu[syuntuNo + 2] = j + 2;
                        syuntuNo = syuntuNo+3;

                        //[2,3,4,2,3,4,4,4,5,5,5,6,6,6]の時に2回目の234をとばしてしまう
                        j = j - 1;

                        Checksyuntu = Checksyuntu + 1;
                        Cntsyuntu = Checksyuntu;
                    }
                }
                for (int k = 1; k < 38; k++) {
                    sum = sum + tmp[k];
                }

                //あがりの判定
                if (sum == 0) {
                    Log.d("頭は", "" + Checkatama);
                    Log.d("刻子の数は", "" + Checkkotu);
                    Log.d("順子の数は", "" + Checksyuntu);
                    Log.d("あがり", "です");

                    //刻子・順子の数
                    //hyozi();

                    score = pinhutumohantei();
                    yakuCnt=yakucnt.cnt();

                    //hu = hucalcu.tujouCalcu();
                    score = majoncalcu.Calcu(hu,yakuCnt,zikaze,tumo);

                    str = yakuname;


                    agari = true;
                    break;
                }
            }

            //順子・刻子の順番で判断
            for (int i = 1; i < 38; i++) {

                Checkatama1=0;
                Checkkotu1 =0;
                Checksyuntu1 =0;

                resethensu();
                resetArray();

                //頭の判定
                if (tmp[i] >= 2) {
                    tmp[i] = tmp[i] - 2;
                    Checkatama1 = i;
                    atama = Checkatama1;
                } else {
                    continue;
                }

                //31～37を除外して字牌の処理
                for (int j = 1; j < 38 - 8; j++) {
                    //順子の判定
                    if ((tmp[j] >= 1) && (tmp[j + 1] >= 1) && (tmp[j + 2] >= 1)) {
                        tmp[j] = tmp[j] - 1;
                        tmp[j + 1] = tmp[j + 1] - 1;
                        tmp[j + 2] = tmp[j + 2] - 1;

                        syuntu[syuntuNo] = j;
                        syuntu[syuntuNo+1] = j+1;
                        syuntu[syuntuNo + 2] = j + 2;
                        syuntuNo = syuntuNo+3;

                        //[2,3,4,2,3,4,4,4,5,5,5,6,6,6]の時に2回目の234をとばしてしまう
                        j = j - 1;
                        Checksyuntu1 = Checksyuntu1 + 1;
                        Cntsyuntu = Checksyuntu1;
                    }
                }

                for (int j = 1; j < 38; j++) {
                    //刻子の判定
                    if (tmp[j] >= 3) {
                        tmp[j] = tmp[j] - 3;
                        Checkkotu1 = Checkkotu1 + 1;

                        kotu[kotuNo] = j;
                        kotuNo = kotuNo+1;
                        Cntkotu = Checkkotu1;
                    }
                }

                for (int k = 1; k < 38; k++) {
                    sum = sum + tmp[k];
                }

                //あがりの判定
                //あがりの形が重複しない判定
                if (sum == 0 && !(Checkatama == Checkatama1 && Checkkotu == Checkkotu1 && Checksyuntu == Checksyuntu1) ) {
                    Log.d("頭は", "" + Checkatama1);
                    Log.d("刻子の数は", "" + Checkkotu1);
                    Log.d("順子の数は", "" + Checksyuntu1);
                    Log.d("あがり1", "です");

                    //刻子・順子の数
                    //hyozi();

                    yakuCnt1=yakucnt.cnt();

                    hu1 = hucalcu.tujouCalcu();
                    score1 = majoncalcu.Calcu(hu1,yakuCnt1,zikaze,tumo);

                    str1 = yakuname;

                    agari = true;
                    break;
                }
            }

            //刻子・順子の順番
            //刻子を一つだけ抜き出した上で順子を抜き出し、再び刻子を抜き出すというチェックする
            //222334455567発発の場合うまくいかないため
            for (int i = 1; i < 38; i++) {

                Checkatama2 = 0;
                Checkkotu2 =0;
                Checksyuntu2 =0;

                resethensu();
                resetArray();

                //頭の判定
                if (tmp[i] >= 2) {
                    tmp[i] = tmp[i] - 2;
                    Checkatama2 = i;
                    atama = Checkatama2;

                }
                else {
                    continue;
                }

                //刻子を一つだけ抜き出たす
                boolean one1 = false;
                for (int j = 1; j < 38; j++) {
                    //刻子の判定
                    if (!one1 && tmp[j] >= 3) {
                        tmp[j] = tmp[j] - 3;
                        Checkkotu2 = Checkkotu2 + 1;
                        one1 = true;

                        kotu[kotuNo] = j;
                        kotuNo = kotuNo+1;
                        Cntkotu = Checkkotu2;
                    }
                }

                //31~37を除外して字牌の処理
                for (int j = 1; j < 38 - 8; j++) {
                    //順子の判定
                    if ((tmp[j] >= 1) && (tmp[j + 1] >= 1) && (tmp[j + 2] >= 1)) {
                        tmp[j] = tmp[j] - 1;
                        tmp[j + 1] = tmp[j + 1] - 1;
                        tmp[j + 2] = tmp[j + 2] - 1;

                        syuntu[syuntuNo] = j;
                        syuntu[syuntuNo+1] = j+1;
                        syuntu[syuntuNo + 2] = j + 2;
                        syuntuNo = syuntuNo+3;

                        //[2,3,4,2,3,4,4,4,5,5,5,6,6,6]の時に2回目の234をとばしてしまうため、必要
                        j = j - 1;
                        Checksyuntu2 = Checksyuntu2 + 1;
                        Cntsyuntu = Checksyuntu2;
                    }
                }

                for (int k = 1; k < 38; k++) {
                    sum = sum + tmp[k];
                }
                //あがりの判定
                //あがりの形が重複しない判定
                if (sum == 0 && Checkatama2 != Checkatama && Checkatama2 != Checkatama1 && Checkkotu2 != Checkkotu && Checkkotu2 != Checkkotu1 && Checksyuntu2 != Checksyuntu &&  Checksyuntu2 !=Checksyuntu1) {
                    Log.d("頭は", "" + Checkatama2);
                    Log.d("刻子の数は", "" + Checkkotu2);
                    Log.d("順子の数は", "" + Checksyuntu2);
                    Log.d("あがり2", "です");

                    //刻子・順子の数
                    //hyozi();

                    yakuCnt2=yakucnt.cnt();

                    hu2 = hucalcu.tujouCalcu();
                    score2 = majoncalcu.Calcu(hu2,yakuCnt2,zikaze,tumo);

                    str2 = yakuname;
                    agari = true;
                    break;
                }
            }

            if (score > score1 && score > score2 && score > 0){
                textView.setText(str);
                textView1.setText(String.valueOf(hu+"符"));
                textView2.setText(String.valueOf(yakuCnt+"翻"));
                textView3.setText(String.valueOf(score+"点"));
                if (tumo){
                    textView4.setText("オール");
                }
            }
            else if (score1 > score && score1 > score2 && score > 0){
                textView.setText(str1);
                textView1.setText(String.valueOf(hu1+"符"));
                textView2.setText(String.valueOf(yakuCnt1+"翻"));
                textView3.setText(String.valueOf(score1+"点"));
                if (tumo){
                    textView4.setText("オール");
                }
            }
            else if (score2 > score && score2 > score1&& score > 0){
                textView.setText(str2);
                textView1.setText(String.valueOf(hu2+"符"));
                textView2.setText(String.valueOf(yakuCnt2+"翻"));
                textView3.setText(String.valueOf(score2+"点"));
                if (tumo){
                    textView4.setText("オール");
                }
            }


            //例外処理 国士無双
            tmp = kind.clone();
            yakuname = null;
            kokusisum = 0;
            //一回しか通らないようにする
            boolean one = false;

            for (int m = 1; m < 38; m++) {
                switch (m) {
                    case 1:
                    case 9:
                    case 11:
                    case 19:
                    case 21:
                    case 29:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:

                        if (!one && tmp[m] == 2) {
                            tmp[m] = tmp[m] - 2;
                            one = true;
                        }
                        else if (tmp[m] == 1) {
                            tmp[m] = tmp[m] - 1;
                        }
                }
            }

            for (int k = 1; k < 38; k++) {
                kokusisum = kokusisum + tmp[k];
            }

            //あがりの判定
            if (kokusisum == 0) {
                Log.d("あがり", "です");

                yakuCnt=yakucnt.cntkokusi();
                str3 = yakuname;
                score = majoncalcu.Calcu(0,yakuCnt,zikaze,tumo);

                textView.setText(str3);
                textView2.setText(String.valueOf(yakuCnt+"翻"));
                textView3.setText(String.valueOf(score+"点"));
                if (tumo){
                    textView4.setText("オール");
                }
                agari = true;
            }


            //例外処理 七対子
            tmp = kind.clone();
            yakuname = null;
            titoisum=0;

            for (int l = 1; l < 38; l++) {
                //頭の判定
                if (tmp[l] == 2) {
                    tmp[l] = tmp[l] - 2;
                }
                continue;
            }

            for (int k = 1; k < 38; k++) {
                titoisum = titoisum + tmp[k];
            }

            //あがりの判定
            if (titoisum == 0 && agari==false) {

                yakuCnt=yakucnt.cnttitoi();
                str4 = yakuname;

                hu = hucalcu.titoiCalcu();
                score = majoncalcu.Calcu(25,yakuCnt,zikaze,tumo);

                textView.setText(str4);
                textView1.setText(String.valueOf(hu+"符"));
                textView2.setText(String.valueOf(yakuCnt+"翻"));
                textView3.setText(String.valueOf(score+"点"));
                if (tumo){
                    textView4.setText("オール");
                }

                agari = true;
            }

            if(agari == false){
                textView.setText("あがりの形ではないです");
            }
        }
        else{
            textView.setText("牌の数がおかしいです");

        }
    }


    void resetArray(){
        kotuNo = 0;
        syuntuNo =0;
        //syuntuとkotuの配列の初期化
        for (int j = 0; j<syuntu.length;j++){
            syuntu[j] = 0;
        }
        for (int k = 0;k<kotu.length;k++){
            kotu[k] =0;
        }
    }

    void resethensu(){
        sum = 0;
        atama = 0;
        Cntkotu =0;
        Cntsyuntu =0;
        tmp = kind.clone();
        yakuname = null;

    }


    int pinhuKekka(){
        YakuCnt yakucnt = new YakuCnt();
        yakuCnt=yakucnt.pinhutumo();

        MajonCalcu majoncalcu = new MajonCalcu();;

        score = majoncalcu.Calcu(20,yakuCnt,zikaze,true);
        return score;
    }

    void hyozi(){

        for (int j =0; j<kotuNo;j++){
            Log.d("刻子は"+kotu[j], "です");
        }

        for (int k =0; k<syuntuNo;k++){
            Log.d("順子は"+syuntu[k], "です");
        }
    }
    int pinhutumohantei(){

        Yakuhantei yakuhantei = new Yakuhantei();
        Log.d("pinhu", "です");
        int i=yakuhantei.pinhutumo();
        int a = 0;
        hu = 20;

        int sum = i;
        if (sum == 2) {
           a = pinhuKekka();
        }
        return  a;
    }

}
