package com.example.j14001_m.myapplication;

import android.util.Log;


import static com.example.j14001_m.myapplication.MainActivity.*;

/**
 * Created by J14001_M on 2018/01/15.
 */

//三槓子と四槓子と三暗刻

public class Yakuhantei {


    //1ハン
    //平和
    int pinhu() {
        int atama = 0;

        //順子が4つかつ鳴いていない
        if (Cntsyuntu == 4 && !naki) {
            //雀頭が字牌の有無の判定
            for (int i = 31; i < 38; i++) {
                if (kind[i] == 2) {
                    atama = i;
                    break;
                }
            }

            //平和はオタ風ならok
            if (ryanmen && atama != bakaze && atama != zikaze) {

                if (yakuname == null) {
                    yakuname = "平和"+1;
                    Log.d("平和", "です");
                    return 1;
                } else {
                    yakuname = yakuname + "\n平和"+1;
                    Log.d("平和", "です");
                    return 1;
                }
            }
        }
        return 0;
    }

    int tanyao() {

        for (int i = 1; i < 38; i++) {

            //1・9又は字牌だったら
            if (i % 10 == 1 || i % 10 == 9 || i > 30) {
                //1・9又は字牌があったら
                if (kind[i] > 0) {
                    return 0;
                }
            }
        }

        if (yakuname == null) {
            Log.d("断幺九", "です");
            yakuname = "断幺九"+1;
            return 1;
        } else {
            yakuname = yakuname + "\n断幺九"+1;
            Log.d("断幺九", "です");
            return 1;
        }
    }


    int ipeko() {
        for (int i = 0; i < 9; i++) {
            //中身が0じゃなく比較する順子の最初の値が同じだったら
            if (syuntu[i] == syuntu[i + 3] && syuntu[i] != 0 && !naki) {

                if (yakuname == null) {
                    yakuname = "一盃口"+1;
                    Log.d("一盃口", "です");
                    return 1;
                } else {

                    yakuname = yakuname + "\n一盃口"+1;
                    Log.d("一盃口", "です");
                    return 1;
                }
            }
        }
        return 0;
    }


    int ryanpeko() {
        if (Cntsyuntu == 4 && !naki) {
            int i = 0;
            if ((syuntu[i] == syuntu[i + 3] && syuntu[i + 1] == syuntu[i + 4] && syuntu[i + 2] == syuntu[i + 5]) && (syuntu[i + 6] == syuntu[i + 9] && syuntu[i + 7] == syuntu[i + 10] && syuntu[i + 8] == syuntu[i + 11])) {
                if (yakuname == null) {
                    yakuname = "二盃口"+3;
                    Log.d("二盃口", "です");
                    return 3;
                } else {
                    yakuname = yakuname + "\n二盃口"+3;
                    Log.d("二盃口", "です");
                    return 3;
                }
            }
        }
        return 0;
    }

    //2ハン
    int toitoi() {
        if (Cntkotu == 4) {

            if (yakuname == null) {
                yakuname = "対々和"+2;
                Log.d("対々和", "です");
                return 2;
            } else {
                yakuname = yakuname + "\n対々和"+2;
                Log.d("対々和", "です");
                return 2;
            }
        }
        return 0;
    }

    int sananko() {
        if (Cntkotu >= 3) {
            if (yakuname == null) {
                yakuname = "三暗刻"+2;
                Log.d("三暗刻", "です");
                return 2;
            } else {
                yakuname = yakuname + "\n三暗刻"+2;
                Log.d("三暗刻", "です");
                return 2;
            }

        }
        return 0;
    }



    int sansyokudoko() {
        //下一桁が一緒になったらカウント
        int sum = 0;
        if (Cntkotu >= 3) {
            for (int i = 0; i <= 1; i++) {
                for (int j = 0; j <= 3; j++) {
                    if (kotu[i] == kotu[j] % 10) {
                        sum = sum + 1;

                        if (sum == 3) {

                            if (yakuname == null) {
                                yakuname = "三色同刻"+2;
                                Log.d("三色同刻", "です");
                                return 2;
                            } else {
                                yakuname = yakuname + "\n三色同刻"+2;
                                Log.d("三色同刻", "です");
                                return 2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return 0;
    }



    int sansyokudoujun() {
        int sum = 0;

        if (Cntsyuntu >= 3) {
            if (syuntu[0] % 10 == syuntu[3] % 10 && syuntu[3] % 10 == syuntu[6] % 10 && !naki) {

                if (yakuname == null) {
                    yakuname = "三色同順"+2;
                    Log.d("三色同順", "です");
                    return 2;
                } else {
                    yakuname = yakuname + "\n三色同順"+2;
                    Log.d("三色同順", "です");
                    return 2;
                }

            } else if (syuntu[3] % 10 == syuntu[6] % 10 && syuntu[6] % 10 == syuntu[9] % 10 && !naki) {
                if (yakuname == null) {
                    yakuname = "三色同順"+2;
                    Log.d("三色同順", "です");
                    return 2;
                } else {
                    yakuname = yakuname + "\n三色同順"+2;
                    Log.d("三色同順", "です");
                    return 2;
                }

            } else if (syuntu[0] % 10 == syuntu[6] % 10 && syuntu[6] % 10 == syuntu[9] % 10 && !naki) {
                if (yakuname == null) {
                    yakuname = "三色同順"+2;
                    Log.d("三色同順", "です");
                    return 2;
                } else {
                    yakuname = yakuname + "\n三色同順"+2;
                    Log.d("三色同順", "です");
                    return 2;
                }

            } else if (syuntu[0] % 10 == syuntu[3] % 10 && syuntu[3] % 10 == syuntu[9] % 10 && !naki) {
                if (yakuname == null) {
                    yakuname = "三色同順"+2;
                    Log.d("三色同順", "です");
                    return 2;
                } else {
                    yakuname = yakuname + "\n三色同順"+2;
                    Log.d("三色同順", "です");
                    return 2;
                }

            } else if (syuntu[0] % 10 == syuntu[3] % 10 && syuntu[3] % 10 == syuntu[6] % 10 && naki) {
                if (yakuname == null) {
                    yakuname = "三色同順"+1;
                    Log.d("三色同順", "です");
                    return 1;
                } else {
                    yakuname = yakuname + "\n三色同順"+1;
                    Log.d("三色同順", "です");
                    return 1;
                }

            } else if (syuntu[3] % 10 == syuntu[6] % 10 && syuntu[6] % 10 == syuntu[9] % 10 && naki) {
                if (yakuname == null) {
                    yakuname = "三色同順"+1;
                    Log.d("三色同順", "です");
                    return 1;
                } else {
                    yakuname = yakuname + "\n三色同順"+1;
                    Log.d("三色同順", "です");
                    return 1;
                }

            } else if (syuntu[0] % 10 == syuntu[6] % 10 && syuntu[6] % 10 == syuntu[9] % 10 && naki) {
                if (yakuname == null) {
                    yakuname = "三色同順"+1;
                    Log.d("三色同順", "です");
                    return 1;
                } else {
                    yakuname = yakuname + "\n三色同順"+1;
                    Log.d("三色同順", "です");
                    return 1;
                }
            } else if (syuntu[0] % 10 == syuntu[3] % 10 && syuntu[3] % 10 == syuntu[9] % 10 && naki) {
                if (yakuname == null) {
                    yakuname = "三色同順"+1;
                    Log.d("三色同順", "です");
                    return 1;
                } else {
                    yakuname = yakuname + "\n三色同順"+1;
                    Log.d("三色同順", "です");
                    return 1;
                }
            }
        }
        return 0;
    }


    int ikkitukan() {
        if (Cntsyuntu >= 3) {
            //最初の牌種を記憶
            for (int i = 0; i <= 3; i += 3) {
                if (syuntu[i] % 10 == 1 && syuntu[i + 1] % 10 == 2 && syuntu[i + 2] % 10 == 3 && syuntu[i + 3] % 10 == 4 && syuntu[i + 4] % 10 == 5
                        && syuntu[i + 5] % 10 == 6 && syuntu[i + 6] % 10 == 7 && syuntu[i + 7] % 10 == 8 && syuntu[i + 8] % 10 == 9 && !naki) {

                    if (yakuname == null) {
                        yakuname = "一気通貫"+2;
                        Log.d("一気通貫", "です");
                        return 2;
                    } else {
                        yakuname = yakuname + "\n一気通貫"+2;
                        Log.d("一気通貫", "です");
                        return 2;
                    }

                }
                //鳴いていたら
                else if (syuntu[i] % 10 == 1 && syuntu[i + 1] % 10 == 2 && syuntu[i + 2] % 10 == 3 && syuntu[i + 3] % 10 == 4 && syuntu[i + 4] % 10 == 5
                        && syuntu[i + 5] % 10 == 6 && syuntu[i + 6] % 10 == 7 && syuntu[i + 7] % 10 == 8 && syuntu[i + 8] % 10 == 9 && naki) {
                    if (yakuname == null) {
                        yakuname = "一気通貫"+1;
                        Log.d("一気通貫", "です");
                        return 1;
                    } else {
                        yakuname = yakuname + "\n一気通貫"+1;
                        Log.d("一気通貫", "です");
                        return 1;
                    }
                }
            }
        }
        return 0;
    }


    int tyanta() {

        int sum = 0;
        //字牌のフラグ
        boolean jihai = false;

        //刻子が1.9牌のとき
        for (int i = 0; i <= 3; i++) {
            if (kotu[i] % 10 == 1 || kotu[i] % 10 == 9) {
                sum = sum + 1;
            }
        }

        //順子に1.9牌が入っている場合
        for (int j = 0; j < 12; j++) {
            //123の真ん中の部分を飛ばす
            if (j == 1 || j == 4 || j == 7 || j == 10) {
                continue;
            }

            if (syuntu[j] % 10 == 1 || syuntu[j] % 10 == 9) {
                sum = sum + 1;
            }
        }

        //字牌の有無の判定
        for (int i = 31; i < 38; i++) {
            if (kind[i] >= 2) {
                jihai = true;
            }
        }

        if (sum == 4 && jihai && !naki) {

            if (yakuname == null) {
                yakuname = "混全帯幺九"+2;
                Log.d("混全帯幺九", "です");
                return 2;
            } else {
                yakuname = yakuname + "\n混全帯幺九"+2;
                Log.d("混全帯幺九", "です");
                return 2;
            }

        }
        //鳴いたら
        else if (sum == 4 && jihai && !naki) {
            if (yakuname == null) {
                yakuname = "混全帯幺九"+1;
                Log.d("混全帯幺九", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n混全帯幺九"+1;
                Log.d("混全帯幺九", "です");
                return 1;
            }

        }
        return 0;
    }


    //3ハン
    int honitu() {
        int syurui = 0;
        int i = 1;
        //字牌のフラグ
        boolean jihai = false;

        for (; i < 38; i++) {
            if (kind[i] >= 1) {
                break;
            }
        }
        //最初の牌種を記憶
        syurui = i / 10;

        //最初の牌が字牌かの判断
        if (syurui == 3) {
            return 0;
        }
        //最初の牌種と違うならFALSE
        for (; i < 38; i++) {
            if (kind[i] >= 1) {
                if (i / 10 != syurui && i < 30) {
                    return 0;
                } else if (i > 30 && !jihai) {
                    jihai = true;
                }
            }
        }
        if (jihai && !naki) {

            if (yakuname == null) {
                yakuname = "混一色"+3;
                Log.d("混一色", "です");
                return 3;
            } else {
                yakuname = yakuname + "\n混一色"+3;
                Log.d("混一色", "です");
                return 3;
            }
        }
        //鳴いたら
        else if (jihai && naki) {

            if (yakuname == null) {
                yakuname = "混一色"+2;
                Log.d("混一色", "です");
                return 2;
            } else {
                yakuname = yakuname + "\n混一色"+2;
                Log.d("混一色", "です");
                return 2;
            }
        }
        return 0;
    }

    int juntyan() {
        //1.9牌が面子のカウント
        int sum = 0;
        //刻子が1.9牌のとき
        for (int i = 0; i <= 3; i++) {
            if (kotu[i] % 10 == 1 || kotu[i] % 10 == 9) {
                sum = sum + 1;
            }
        }

        //順子に1.9牌が入っている場合
        for (int j = 0; j < 12; j++) {
            //123の真ん中の部分を飛ばす
            if (j == 1 || j == 4 || j == 7 || j == 10) {
                continue;
            }
            if (syuntu[j] % 10 == 1 || syuntu[j] % 10 == 9) {
                sum = sum + 1;
            }
        }
        if (sum == 4 && !naki) {

            if (yakuname == null) {
                yakuname = "純全帯幺九"+3;
                Log.d("純全帯幺九", "です");
                return 3;
            } else {
                yakuname = yakuname + "\n純全帯幺九"+3;
                Log.d("純全帯幺九", "です");
                return 3;
            }

        } else if (sum == 4 && naki) {

            if (yakuname == null) {
                yakuname = "純全帯幺九"+2;
                Log.d("純全帯幺九", "です");
                return 2;
            } else {
                yakuname = yakuname + "\n純全帯幺九"+2;
                Log.d("純全帯幺九", "です");
                return 2;
            }

        }
        return 0;
    }


    //4ハン
    int syosangen() {
        boolean toitu = false;
        int anko = 0;
        //35白36発37中
        for (int i = 35; i < 38; i++) {
            if (toitu == false && kind[i] == 2) {
                toitu = true;
            } else if (kind[i] == 3) {
                anko = anko + 1;
            }
        }
        if (anko == 2 && toitu) {

            if (yakuname == null) {
                yakuname = "小三元"+2;
                Log.d("小三元", "です");
                return 2;
            } else {
                yakuname = yakuname + "\n小三元"+2;
                Log.d("小三元", "です");
                return 2;
            }

        } else {
            return 0;
        }
    }

    int honroto() {
        boolean jihai = false;
        boolean routou = false;

        for (int i = 1; i < 38; i++) {
            if (i % 10 > 1 && i % 10 < 9 && i < 30) {
                if (kind[i] > 0) {
                    break;
                }
            }
            if ((i % 10 == 1 || i % 10 == 9) && i < 30 && routou == false) {
                routou = true;
            } else if (i > 30 && jihai == false) {
                //字牌を記憶
                jihai = true;
            }
        }
        //1・9牌と字牌があるかの判定
        if (routou && jihai) {
            if (yakuname == null) {
                yakuname = "混老頭"+2;
                Log.d("混老頭", "です");
                return 2;
            } else {
                yakuname = yakuname + "\n混老頭"+2;
                Log.d("混老頭", "です");
                return 2;
            }
        }
        return 0;
    }


    //6ハン
    int tinitu() {
        int syurui = 0;
        int i = 1;
        for (; i < 38; i++) {
            if (kind[i] >= 1) {
                break;
            }
        }
        //最初の牌種を記憶
        syurui = i / 10;
        //字牌の判断
        if (syurui == 3) {
            return 0;
        }
        //最初の牌種と違うならFALSE

        for (; i < 38; i++) {
            if (kind[i] >= 1) {
                if (i / 10 != syurui) {
                    return 0;
                }
            }
        }
        if (!naki) {
            if (yakuname == null) {
                yakuname = "清一色"+5;
                Log.d("清一色", "です");
                return 5;
            } else {
                yakuname = yakuname + "\n清一色"+5;
                Log.d("清一色", "です");
                return 5;
            }
        }
        if (yakuname == null) {
            yakuname = "清一色"+4;
            Log.d("清一色", "です");
            return 4;
        } else {
            yakuname = yakuname + "\n清一色"+4;
            Log.d("清一色", "です");
            return 4;
        }
    }

    //13ハン
    int suanko() {
        if (Cntkotu == 4 && !naki) {
            if (menzentumo || tanki) {

                if (yakuname == null) {
                    yakuname = "四暗刻";
                    Log.d("四暗刻", "です");
                    return 13;
                } else {
                    yakuname = yakuname + "\n四暗刻";
                    Log.d("四暗刻", "です");
                    return 13;
                }

            }
        }
        return 0;
    }


    int daisangen() {
        if (kind[35] >= 3 && kind[36] >= 3 && kind[37] >= 3) {

            if (yakuname == null) {
                yakuname = "大三元";
                Log.d("大三元", "です");
                return 13;
            } else {
                yakuname = yakuname + "\n大三元";
                Log.d("大三元", "です");
                return 13;
            }

        }
        return 0;
    }


    int ryuiso() {
        int sum = 14;
        for (int i = 1; i < 38; i++) {
            if (i == 22 || i == 23 || i == 24 || i == 26 || i == 28 || i == 36) {

                sum = sum - kind[i];
            }
        }
        if (sum == 0) {

            if (yakuname == null) {
                yakuname = "緑一色";
                Log.d("緑一色", "です");
                return 13;
            } else {
                yakuname = yakuname + "\n緑一色";
                Log.d("緑一色", "です");
                return 13;
            }
        }
        return 0;
    }

    int tuiso() {
        int sum = 0;
        int sum1 = 0;
        //31東32南33西34北
        for (int i = 31; i < 38; i++) {
            if (kind[i] >= 3) {
                sum = sum + 1;
            } else if (kind[i] >= 2) {
                sum1 = sum1 + 1;
            }

            if (sum == 4) {

                if (yakuname == null) {
                    yakuname = "字一色";
                    Log.d("字一色", "です");
                    return 13;
                } else {
                    yakuname = yakuname + "\n字一色";
                    Log.d("字一色", "です");
                    return 13;
                }
            }

            //七対子の場合
            if (sum1 == 7) {
                if (yakuname == null) {
                    yakuname = "字一色";
                    Log.d("字一色", "です");
                    return 13;
                } else {
                    yakuname = yakuname + "\n字一色";
                    Log.d("字一色", "です");
                    return 13;
                }

            }
        }
        return 0;
    }

    int tinroto() {
        boolean toitu = false;
        int anko = 0;

        for (int i = 1; i < 38; i++) {
            if (toitu == false && (kind[1] == 2 || kind[9] == 2 || kind[11] == 2 || kind[19] == 2 || kind[21] == 2 || kind[29] == 2)) {
                toitu = true;
            } else if (kind[1] == 3 || kind[9] == 3 || kind[11] == 3 || kind[19] == 3 || kind[21] == 3 || kind[29] == 3) {
                anko = anko + 1;
            } else {
                return 0;
            }
        }

        if (yakuname == null) {
            yakuname = "清老頭";
            Log.d("清老頭", "です");
            return 13;
        } else {
            yakuname = yakuname + "\n清老頭";
            Log.d("清老頭", "です");
            return 13;
        }

    }

    int syosusi() {
        boolean toitu = false;
        int anko = 0;
        //31東32南33西34北
        for (int i = 31; i < 35; i++) {
            if (toitu == false && kind[i] == 2) {
                toitu = true;
            } else if (kind[i] == 3) {
                anko = anko + 1;
            }
        }
        if (anko == 3 && toitu) {

            if (yakuname == null) {
                yakuname = "小四喜";
                Log.d("小四喜", "です");
                return 13;
            } else {
                yakuname = yakuname + "\n小四喜";
                Log.d("小四喜", "です");
                return 13;
            }
        }
        else {
            return 0;
        }
    }

    int daisusi() {
        //31東32南33西34北
        for (int i = 31; i < 35; i++) {
            if (kind[i] < 3) {
                return 0;
            }
        }

        if (yakuname == null) {
            yakuname = "大四喜";
            Log.d("大四喜", "です");
            return 13;
        } else {
            yakuname = yakuname + "\n大四喜";
            Log.d("大四喜", "です");
            return 13;
        }
    }

    int tyurenpoto() {
        int syurui = 0;

        for (int i = 31; i < 38; i++) {
            if (kind[i] > 0) {
                return 0;
            }
        }
        if (kind[1] >= 3 && kind[9] >= 3) {
            //マンズ
            syurui = 0;
        } else if (kind[11] >= 3 && kind[19] >= 3) {
            //ピンズ
            syurui = 1;
        } else if (kind[21] >= 3 && kind[29] >= 3) {
            //ソーズ
            syurui = 2;
        } else {
            return 0;
        }
        for (int i = syurui * 10 + 1; i <= syurui * 10 + 9; i++) {
            switch (i % 10) {
                case 1:
                case 9:
                    if (kind[i] < 3)
                        return 0;
                    break;

                default:
                    if (kind[i] < 1)
                        return 0;
                    break;
            }
        }

        if (yakuname == null) {
            yakuname = "九蓮宝燈";
            Log.d("九蓮宝燈", "です");
            return 13;
        } else {
            yakuname = yakuname + "\n九蓮宝燈";
            Log.d("九蓮宝燈", "です");
            return 13;
        }
    }

    //特殊な形のため判別
    //七対子と国士無双
    int titoi() {
        if (yakuname == null) {
            yakuname = "七対子"+2;
            Log.d("七対子", "です");
            return 2;
        } else {
            yakuname = yakuname + "\n七対子"+2;
            Log.d("七対子", "です");
            return 2;
        }
    }

    int kokusimuso() {
        if (yakuname == null) {
            yakuname = "国士無双";
            Log.d("国士無双", "です");
            return 13;
        } else {
            yakuname = yakuname + "\n国士無双";
            Log.d("国士無双", "です");
            return 13;
        }
    }

    int menzentumo() {
        if (menzentumo) {

            if (yakuname == null) {
                yakuname = "門前清自摸和"+1;
                Log.d("門前清自摸和", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n門前清自摸和"+1;
                Log.d("門前清自摸和", "です");
                return 1;
            }

        }
        return 0;
    }

    int renpuhai() {

        for (int i = 31; i < 35; i++) {
            if (kind[i] >= 3) {
                if (i == bakaze && i == zikaze) {
                    if (yakuname == null) {
                        yakuname = "連風牌"+2;
                        Log.d("連風牌", "です");
                        return 2;
                    } else {
                        yakuname = yakuname + "\n連風牌"+2;
                        Log.d("連風牌", "です");
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    int ton() {
        if (kind[31] >= 3 && (zikaze == 31 || bakaze == 31) && !(zikaze == 31 && bakaze == 31)) {

            if (yakuname == null) {
                yakuname = "役牌 東"+1;
                Log.d("役牌 東", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n役牌 東"+1;
                Log.d("役牌 東", "です");
                return 1;
            }

        }
        return 0;
    }

    int nan() {
        if (kind[32] >= 3 && (zikaze == 32 || bakaze == 32) && !(zikaze == 32 && bakaze == 32)) {
            if (yakuname == null) {
                yakuname = "役牌 南"+1;
                Log.d("役牌 南", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n役牌 南"+1;
                Log.d("役牌 南", "です");
                return 1;
            }
        }
        return 0;
    }


    int sya() {
        if (kind[33] >= 3 && zikaze == 33) {
            if (yakuname == null) {
                yakuname = "役牌 西"+1;
                Log.d("役牌 西", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n役牌 西"+1;
                Log.d("役牌 西", "です");
                return 1;
            }
        }
        return 0;
    }


    int pe() {
        if (kind[34] >= 3 && zikaze == 34) {
            if (yakuname == null) {
                yakuname = "役牌 北"+1;
                Log.d("役牌 北", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n役牌 北"+1;
                Log.d("役牌 北", "です");
                return 1;
            }
        }
        return 0;
    }

    int haku() {
        if (kind[35] >= 3) {
            if (yakuname == null) {
                yakuname = "役牌 白"+1;
                Log.d("役牌 白", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n役牌 白"+1;
                Log.d("役牌 白", "です");
                return 1;
            }
        }
        return 0;
    }

    int hatu() {
        if (kind[36] >= 3) {
            if (yakuname == null) {
                yakuname = "役牌 発"+1;
                Log.d("役牌 発", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n役牌 発"+1;
                Log.d("役牌 発", "です");
                return 1;
            }
        }
        return 0;
    }

    int tyun() {
        if (kind[37] >= 3) {
            if (yakuname == null) {
                yakuname = "役牌 中"+1;
                Log.d("役牌 中", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n役牌 中"+1;
                Log.d("役牌 中", "です");
                return 1;
            }
        }
        return 0;
    }


    //手配からでは判断できない役
    int riti() {
        if (riti) {

            if (yakuname == null) {
                yakuname = "立直"+1;
                Log.d("立直", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n立直"+1;
                Log.d("立直", "です");
                return 1;
            }
        }
        return 0;
    }

    int dabururiti() {
        if (dabururiti) {
            if (yakuname == null) {
                yakuname = "ダブル立直"+2;
                Log.d("ダブル立直", "です");
                return 2;
            } else {
                yakuname = yakuname + "\nダブル立直"+2;
                Log.d("ダブル立直", "です");
                return 2;
            }
        }
        return 0;
    }



    int ippatu() {
        if (ippatu) {
            if (yakuname == null) {
                yakuname = "一発"+1;
                Log.d("一発", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n一発"+1;
                Log.d("一発", "です");
                return 1;
            }

        }
        return 0;
    }

    int rinsyan() {
        if (rinsyan) {

            if (yakuname == null) {
                yakuname = "嶺上開花"+1;
                Log.d("嶺上開花", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n嶺上開花"+1;
                Log.d("嶺上開花", "です");
                return 1;
            }
        }
        return 0;
    }

    int tyankan() {
        if (tyankan) {
            if (yakuname == null) {
                yakuname = "槍槓"+1;
                Log.d("槍槓", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n槍槓"+1;
                Log.d("槍槓", "です");
                return 1;
            }

        }
        return 0;
    }

    int haitei() {
        if (haitei) {

            if (yakuname == null) {
                yakuname = "海底摸月"+1;
                Log.d("海底摸月", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n海底摸月"+1;
                Log.d("海底摸月", "です");
                return 1;
            }
        }
        return 0;
    }

    int hotei() {
        if (hotei) {
            if (yakuname == null) {
                yakuname = "河底撈魚"+1;
                Log.d("河底撈魚", "です");
                return 1;
            } else {
                yakuname = yakuname + "\n河底撈魚"+1;
                Log.d("河底撈魚", "です");
                return 1;
            }

        }
        return 0;
    }

    int tiho() {
        if (tiho) {

            if (yakuname == null) {
                yakuname = "地和";
                Log.d("地和", "です");
                return 13;
            } else {
                yakuname = yakuname + "\n地和";
                Log.d("地和", "です");
                return 13;
            }


        }
        return 0;
    }

    int tenho() {
        if (tenho) {
            if (yakuname == null) {
                yakuname = "天和";
                Log.d("天和", "です");
                return 13;
            } else {
                yakuname = yakuname + "\n天和";
                Log.d("天和", "です");
                return 13;
            }
        }
        return 0;
    }
    int dora() {
        if (dora >0) {
            if (yakuname == null) {
                yakuname = "ドラ"+dora;
                Log.d("ドラ", "です");
                return dora;
            } else {
                yakuname = yakuname + "\nドラ"+dora;
                Log.d("ドラ", "です");
                return dora;
            }
        }
        return 0;
    }

    //平和ツモの判定
    int pinhutumo() {
        int atama = 0;
        //順子が4つかつ鳴いていない
        if (Cntsyuntu == 4 && !naki) {
            //雀頭が字牌の有無の判定
            for (int i = 31; i < 38; i++) {
                if (kind[i] == 2) {
                    atama = i;
                    break;
                }
            }
            //平和はオタ風ならok
            if (ryanmen && atama != bakaze && atama != zikaze) {
                    if (menzentumo) {
                            return 2;
                        }
                    }
                    return 0;
            }
        return 0;
    }
}