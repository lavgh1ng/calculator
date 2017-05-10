package com.example.administrator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_del_all;
    Button btn_del;
    Button btn_devide;
    Button btn_multiply;
    Button btn_subtract;
    Button btn_add;
    Button btn_mod;
    Button btn_point;
    Button btn_equal;

    TextView top_text;
    TextView btm_text;
    //定义两个操作数num1,num2
    double num1 = 0,num2 = 0;
    //op代表操作符
    int op = 0;
    //当执行加减乘除操作后标志位置1
    int op_flag = 0;
    //按=后标志位置1
    int equal_flag = 0;
    //nun1长度
    int strLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button)findViewById(R.id.button_0) ;
        btn_1 = (Button)findViewById(R.id.button_1) ;
        btn_2 = (Button)findViewById(R.id.button_2) ;
        btn_3 = (Button)findViewById(R.id.button_3) ;
        btn_4 = (Button)findViewById(R.id.button_4) ;
        btn_5 = (Button)findViewById(R.id.button_5) ;
        btn_6 = (Button)findViewById(R.id.button_6) ;
        btn_7 = (Button)findViewById(R.id.button_7) ;
        btn_8 = (Button)findViewById(R.id.button_8) ;
        btn_9 = (Button)findViewById(R.id.button_9) ;
        btn_del_all = (Button)findViewById(R.id.delete_all) ;
        btn_del = (Button)findViewById(R.id.delete) ;
        btn_devide = (Button)findViewById(R.id.button_devide) ;
        btn_multiply = (Button)findViewById(R.id.button_multiply) ;
        btn_subtract = (Button)findViewById(R.id.button_subtract) ;
        btn_add = (Button)findViewById(R.id.button_add) ;
        btn_mod = (Button)findViewById(R.id.button_mod) ;
        btn_point = (Button)findViewById(R.id.button_point) ;
        btn_equal = (Button)findViewById(R.id.button_equal) ;
        top_text = (TextView) findViewById(R.id.top_text);
        btm_text = (TextView) findViewById(R.id.bottom_text);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_del_all.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_devide.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_subtract.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_mod.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        top_text.setOnClickListener(this);
        btm_text.setOnClickListener(this);
    }

    public void onClick(View v){
        String str = btm_text.getText().toString();
        switch (v.getId()){
            case R.id.button_0:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "0";
                btm_text.setText(str);
                op_flag = 0;
                break;
            case R.id.button_1:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "1";
                btm_text.setText(str);
                op_flag = 0;
                break;
            case R.id.button_2:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "2";
                btm_text.setText(str);
                op_flag = 0;
                break;
            case R.id.button_3:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "3";
                btm_text.setText(str);
                op_flag = 0;
                break;
            case R.id.button_4:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "4";
                btm_text.setText(str);
                op_flag = 0;
                break;
            case R.id.button_5:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "5";
                btm_text.setText(str);
                op_flag = 0;
                break;
            case R.id.button_6:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "6";
                btm_text.setText(str);
                op_flag = 0;
                break;
            case R.id.button_7:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "7";
                btm_text.setText(str);
                op_flag = 0;
                break;
            case R.id.button_8:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "8";
                btm_text.setText(str);
                op_flag = 0;
                break;
            case R.id.button_9:
                if (equal_flag  == 1){
                    top_text.setText(str);
                    str = "";
                    equal_flag = 0;
                }
                str += "9";
                btm_text.setText(str);
                op_flag = 0;
                break;

            case R.id.button_point:
                if (op_flag == 0 && str.equals("") == false){
                    str += ".";
                    btm_text.setText(str);
                    equal_flag = 0;
                    op_flag = 1;
                }
                break;

            case R.id.button_add:
                if (op_flag == 0 && str.equals("") == false){
                    str += "+";
                    strLength = str.length();
                    btm_text.setText(str);
                    equal_flag = 0;
                    op_flag = 1;
                    op = 1;
                }
                break;
            case R.id.button_subtract:
                if (op_flag == 0 && str.equals("") == false){
                    str += "-";
                    strLength = str.length();
                    btm_text.setText(str);
                    equal_flag = 0;
                    op_flag = 1;
                    op = 2;
                }
                break;
            case R.id.button_multiply:
                if (op_flag == 0 && str.equals("") == false){
                    str += "X";
                    strLength = str.length();
                    btm_text.setText(str);
                    equal_flag = 0;
                    op_flag = 1;
                    op = 3;
                }
                break;
            case R.id.button_devide:
                if (op_flag == 0 && str.equals("") == false){
                    str += "÷";
                    strLength = str.length();
                    btm_text.setText(str);
                    equal_flag = 0;
                    op_flag = 1;
                    op = 4;
                }
                break;
            case R.id.button_mod:
                if (op_flag == 0 && str.equals("") == false){
                    str += "%";
                    strLength = str.length();
                    btm_text.setText(str);
                    equal_flag = 0;
                    op_flag = 1;
                    op = 5;
                }
                break;

            case R.id.button_equal:
                if(op == 0 || str.equals("") == true || op_flag == 1)
                    break;
                else {
                    String str1 = str.substring(0,strLength-1);
                    String str2 = str.substring(strLength,str.length());
                    num1 = Double.valueOf(str1);
                    num2 = Double.valueOf(str2);
                    switch (op){
                        case 1:
                            num1 += num2;
                            break;
                        case 2:
                            num1 -= num2;
                            break;
                        case 3:
                            num1 *= num2;
                            break;
                        case 4:
                            num1 /= num2;
                            break;
                        case 5:
                            num1 %= num2;
                            break;
                    }
                    top_text.setText(str+"=");
                    btm_text.setText(""+num1);
                    reset();
                    equal_flag = 1;
                }
                break;

            case R.id.delete_all:
                reset();
                str = "";
                top_text.setText(str);
                btm_text.setText(str);
                break;
            case R.id.delete:
                if (str.equals("")==false){
                    reset();
                    btm_text.setText(str.substring(0,str.length()-1));
                    strLength -= 1;
                }
                break;
        }
    }
    public void reset () {
        num1 = 0;
        num2 = 0;
        op = 0;
        op_flag = 0;
        equal_flag = 0;
    }
}
