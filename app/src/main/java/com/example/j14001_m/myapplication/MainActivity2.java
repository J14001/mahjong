package com.example.j14001_m.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.j14001_m.myapplication.MainActivity.*;


/**
 * Created by J14001_M on 2018/02/06.
 */

public class MainActivity2 extends Activity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener{

    private TextView textView;
    private TextView textView2;

    //カウント変数
    int i =0;
    int j =0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(this);

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(this);

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(this);

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup3.setOnCheckedChangeListener(this);

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
        radioGroup4.setOnCheckedChangeListener(this);

        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radioGroup5);
        radioGroup5.setOnCheckedChangeListener(this);

        Button button1=(Button)findViewById(R.id.button);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button button5=(Button)findViewById(R.id.button5);

        /**ボタンが押されたらonClickが動作するよう設定**/
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        final CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox.setChecked(false);

        final CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox1.setChecked(false);

        //一発のチェック
        checkBox.setOnClickListener(new View.OnClickListener() {
            // タップされると呼び出される
            @Override
            public void onClick(View v) {
                // チェックステータス取得
                boolean check = checkBox.isChecked();

                if(check){
                    ippatu = true;
                }

            }
        });

        //門前ツモのチェック
         checkBox1.setOnClickListener(new View.OnClickListener() {
            // タップされると呼び出される
            @Override
            public void onClick(View v) {
                // チェックステータス取得

                boolean check1 = checkBox1.isChecked();
                if (check1){
                    menzentumo = true;
                }

            }
        });

    }

        //ボタンがクリックされた時に呼ばれるメソッド
        public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.button:
                        i = i + 1;
                        textView.setText(String.valueOf(i));
                    break;

                    case R.id.button2:
                        if (i > 0) {
                            i = i - 1;
                            textView.setText(String.valueOf(i));
                        }
                        break;

                    case R.id.button3:
                        j = j + 1;
                        textView2.setText(String.valueOf(j));
                        break;

                    case R.id.button4:
                        if (j > 0) {
                            j = j - 1;
                            textView2.setText(String.valueOf(j));
                        }
                        break;

                    case R.id.button5:
                        dora = i;
                        tumibo = j;

                        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                        startActivity(intent);
                        break;
                }
            }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int groupId = radioGroup.getId();

        if(groupId == R.id.radioGroup) {
            riti = false;
            dabururiti = false;
        }
        if(groupId == R.id.radioGroup1) {

            rinsyan = false;
            tyankan = false;
            haitei = false;
            hotei = false;
            tiho = false;
            tenho = false;

        }

        if(groupId == R.id.radioGroup3) {

            zikaze = 31;
        }

        if(groupId == R.id.radioGroup4) {

            tumo = false;

        }

        if(groupId == R.id.radioGroup5) {

            ryanmen = false;
            syabo = false;
            tanki = false;

        }

        switch(i) {
            case R.id.radioButton2:
                riti = true;
                break;

            case R.id.radioButton3:
                dabururiti = true;
                break;

            case R.id.radioButton5:
                tenho = true;
                break;

            case R.id.radioButton6:
                tiho = true;
                break;

            case R.id.radioButton7:
                rinsyan = true;
                break;

            case R.id.radioButton8:
                tyankan = true;
                break;

            case R.id.radioButton9:
                haitei = true;
                break;

            case R.id.radioButton10:
                hotei = true;
                break;

            case R.id.radioButton11:
                bakaze = 31;
                break;

            case R.id.radioButton12:
                bakaze = 32;
                break;

            case R.id.radioButton13:
                zikaze = 31;
                break;

            case R.id.radioButton14:
                zikaze = 32;
                break;

            case R.id.radioButton15:
                zikaze = 33;
                break;

            case R.id.radioButton16:
                zikaze = 34;
                break;

            case R.id.radioButton17:
                tumo = true;
                break;

            case R.id.radioButton18:
                tumo = false;
                break;

            case R.id.radioButton19:
                ryanmen = true;
                break;

            case R.id.radioButton20:
                syabo = true;
                break;

            case R.id.radioButton21:
                tanki = true;
                break;

            case R.id.radioButton22:
                ryanmen = false;
                syabo = false;
                tanki = false;
                break;

        }
    }
}