package com.example.calculator4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn00,btnAdd,btnSub,btnMul,btnDiv,btnequ,btndot;
    Button btnclr;
    EditText edt;
    float res1,res2;
    boolean Add,Sub,Mul,Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button_one);
        btn2 = findViewById(R.id.button_two);
        btn3 = findViewById(R.id.button_three);
        btn4 = findViewById(R.id.button_four);
        btn5 = findViewById(R.id.button_five);
        btn6 = findViewById(R.id.button_six);
        btn7 = findViewById(R.id.button_seven);
        btn8 = findViewById(R.id.button_eight);
        btn9 = findViewById(R.id.button_nine);
        btn0 = findViewById(R.id.button_zero);
        btn00 = findViewById(R.id.button_doublezero);
        btnAdd = findViewById(R.id.button_plus);
        btnSub = findViewById(R.id.button_minus);
        btnMul = findViewById(R.id.button_multi);
        btnDiv = findViewById(R.id.button_divide);
        btndot = findViewById(R.id.button_point);
        btnequ = findViewById(R.id.button_equal);
        btnclr = findViewById(R.id.button_clear);
        edt = findViewById(R.id.result);

     btn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             edt.setText(edt.getText()+"1");
         }
     });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"0");
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"00");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt==null){
                    edt.setText("");
                }else {
                    res1 = Float.parseFloat(edt.getText()+"");
                    Add = true;
                    edt.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt==null){
                    edt.setText("");
                }else {
                    res1 = Float.parseFloat(edt.getText()+"");
                    Sub = true;
                    edt.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt==null){
                    edt.setText("");
                }else {
                    res1 = Float.parseFloat(edt.getText()+"");
                    Mul= true;
                    edt.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt==null){
                    edt.setText("");
                }else {
                    res1 = Float.parseFloat(edt.getText()+"");
                    Div = true;
                    edt.setText(null);
                }
            }
        });

        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(edt.getText()+"");
                if(Add==true){
                    edt.setText(res1+res2+"");
                    Add=false;
                }
                if(Sub==true){
                    edt.setText(res1-res2+"");
                    Add=false;
                }
                if(Mul==true){
                    edt.setText(res1*res2+"");
                    Add=false;
                }
                if(Div==true){
                    edt.setText(res1/res2+"");
                    Add=false;
                }
            }
        });

        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText("");
            }
        });
    }


    }

