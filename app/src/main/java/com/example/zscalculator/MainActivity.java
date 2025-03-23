package com.example.zscalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8,btn_9, btn_add, btn_minus, btn_plus, btn_chu, btn_clean, btn_deng;
    private EditText ans;
    private Boolean is_cal = false;
    private double op_left = 0, op_right = 0, result = 0;
    private char op = '%';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_chu = (Button) findViewById(R.id.btn_chu);
        btn_clean = (Button) findViewById(R.id.btn_clean);
        btn_deng = (Button) findViewById(R.id.btn_deng);
        ans = findViewById(R.id.edit_text);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_cal){
                    ans.setText("");
                    is_cal = false;
                }
                ans.setText(ans.getText().toString() + "9");
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st_pre = ans.getText().toString();
                if(st_pre.equals(""))   return;
                op_left = Double.parseDouble(st_pre);
                ans.setText("");
                op = '+';
                is_cal = false;
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st_pre = ans.getText().toString();
                if(st_pre.equals(""))   return;
                op_left = Double.parseDouble(st_pre);
                ans.setText("");
                op = '-';
                is_cal = false;
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st_pre = ans.getText().toString();
                if(st_pre.equals(""))   return;
                op_left = Double.parseDouble(st_pre);
                ans.setText("");
                op = '*';
                is_cal = false;
            }
        });
        btn_chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st_pre = ans.getText().toString();
                if(st_pre.equals(""))   return;
                op_left = Double.parseDouble(st_pre);
                ans.setText("");
                op = '/';
                is_cal = false;
            }
        });
        btn_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
            }
        });
        btn_deng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str2 = ans.getText().toString();
                if(str2.equals("")) return ;
                op_right = Double.parseDouble(str2);
                ans.setText("");
                switch (op){
                    case '+':   result = op_left + op_right;    break;
                    case '-':   result = op_left - op_right;    break;
                    case '*':   result = op_left * op_right;    break;
                    case '/':   result = op_left / op_right;    break;
                    case '%':   result = op_right;  break;
                    default:    result = 0;    break;
                }
                ans.setText(result + "");
                op = '%';
                is_cal = true;
            }
        });
    }
}