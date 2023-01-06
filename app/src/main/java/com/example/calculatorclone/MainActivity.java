package com.example.calculatorclone;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    Button btn_addition,btn_multiplication,btn_substraction,btn_division,btn_clear,btn_dot,btn_absolute,btn_equal,btn_percentage,btn_back;
    TextView edit_result,edit_input,txt_calculator;
    String data;
    Boolean equal_active;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_addition = findViewById(R.id.btn_addition);
        btn_multiplication = findViewById(R.id.btn_multiplication);
        btn_division = findViewById(R.id.btn_division);
        btn_substraction = findViewById(R.id.btn_substraction);
        btn_percentage = findViewById(R.id.btn_percentage);

        btn_absolute = findViewById(R.id.btn_absolute);
        btn_equal = findViewById(R.id.btn_equal);
        btn_dot = findViewById(R.id.btn_dot);
        btn_clear = findViewById(R.id.btn_clear);
        btn_back = findViewById(R.id.btn_back);

        edit_result = findViewById(R.id.edit_result);
        edit_input = findViewById(R.id.edit_input);
        txt_calculator = findViewById(R.id.txt_calculator);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("");
                data = edit_input.getText().toString();
                edit_input.setText(data +"9");
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str =edit_input.getText().toString();
                int len = str.length();
                if(edit_input.getText().toString()==""){
                    edit_input.setText("");
                }
                else if(str.charAt(len-1)==46){
                    edit_input.setText(data+".");
                }else if(str.charAt(len-1)=='x' || str.charAt(len-1)==43 || str.charAt(len-1)=='-' || str.charAt(len-1)=='÷'){
                    if(str.charAt(len-1)=='x'){
                        edit_input.setText(data+"x");
                    }else if(str.charAt(len-1)=='+'){
                        edit_input.setText(data+"+");
                    }else if(str.charAt(len-1)=='-'){
                        edit_input.setText(data+"-");
                    }else if(str.charAt(len-1)=='÷'){
                        edit_input.setText(data+"÷");
                    }
                }
                else{
                    txt_calculator.setText("");
                    data = edit_input.getText().toString();
                    edit_input.setText(data +".");
                }

            }
        });



        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_calculator.setText("Calculator");
                edit_input.setText("");
                edit_result.setText("");
            }
        });



        btn_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edit_input.getText().toString();
                int len = str.length();
                if(edit_input.getText().toString()=="-"){
                    edit_input.setText("");
                }else if(edit_input.getText().toString()=="") {
                    edit_input.setText("");
                }else if(str.charAt(len-1)=='x' || str.charAt(len-1)=='.' || str.charAt(len-1)=='-' || str.charAt(len-1)=='÷'|| str.charAt(len-1)=='+' || str.charAt(len-1)=='%'){
                    if(str.charAt(len-1)=='x'){
                        edit_input.setText(data+"+");
                    }else if(str.charAt(len-1)=='.'){
                        edit_input.setText(data+".");
                    }else if(str.charAt(len-1)=='-'){
                        edit_input.setText(data+"+");
                    }else if(str.charAt(len-1)=='÷'){
                        edit_input.setText(data+"+");
                    }
                    else if(str.charAt(len-1)=='+'){
                        edit_input.setText(data+"+");
                    }else if(str.charAt(len-1)=='%'){
                        edit_input.setText(data+"+");
                    }
                }else{
                        data = edit_input.getText().toString();
                        edit_input.setText(data +"+");

                }

            }
        });
        btn_substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edit_input.getText().toString();
                int len = str.length();
                if(edit_input.getText().toString()==""){
                    edit_input.setText("-");
                }else if(str.charAt(len-1)=='x' || str.charAt(len-1)=='.' || str.charAt(len-1)=='-' || str.charAt(len-1)=='÷'|| str.charAt(len-1)=='+' || str.charAt(len-1)=='%'){
                    if(str.charAt(len-1)=='x'){
                        edit_input.setText(data+"-");
                    }else if(str.charAt(len-1)=='.'){
                        edit_input.setText(data+".");
                    }else if(str.charAt(len-1)=='-'){
                        edit_input.setText(data+"-");
                    }else if(str.charAt(len-1)=='÷'){
                        edit_input.setText(data+"-");
                    }else if(str.charAt(len-1)=='+'){
                        edit_input.setText(data+"-");
                    }else if(str.charAt(len-1)=='%'){
                        edit_input.setText(data+"-");
                    }
                }
                else if(str.charAt(len-1)==45){
                    edit_input.setText("-");
                }else{

                    data = edit_input.getText().toString();
                    edit_input.setText(data +"-");
                }
            }
        });
        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edit_input.getText().toString();
                int len = str.length();
                if(edit_input.getText().toString()==""){
                    edit_input.setText("");
                }else if(str.charAt(len-1)=='x' || str.charAt(len-1)=='.' || str.charAt(len-1)=='-' || str.charAt(len-1)=='÷'|| str.charAt(len-1)=='+' || str.charAt(len-1)=='%'){
                    if(str.charAt(len-1)=='x'){
                        edit_input.setText(data+"x");
                    }else if(str.charAt(len-1)=='.'){
                        edit_input.setText(data+".");
                    }else if(str.charAt(len-1)=='-'){
                        edit_input.setText(data+"x");
                    }else if(str.charAt(len-1)=='÷'){
                        edit_input.setText(data+"x");
                    }else if(str.charAt(len-1)=='+'){
                        edit_input.setText(data+"x");
                    }else if(str.charAt(len-1)=='%'){
                        edit_input.setText(data+"x");
                    }
                }else{
                    data = edit_input.getText().toString();
                    edit_input.setText(data +"x");
                }
            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edit_input.getText().toString();
                int len = str.length();
                if(edit_input.getText().toString()==""){
                    edit_input.setText("");
                }else if(str.charAt(len-1)=='x' || str.charAt(len-1)=='.' || str.charAt(len-1)=='-' || str.charAt(len-1)=='÷'|| str.charAt(len-1)=='+' || str.charAt(len-1)=='%'){
                    if(str.charAt(len-1)=='x'){
                        edit_input.setText(data+"÷");
                    }else if(str.charAt(len-1)=='.'){
                        edit_input.setText(data+".");
                    }else if(str.charAt(len-1)=='-'){
                        edit_input.setText(data+"÷");
                    }else if(str.charAt(len-1)=='÷'){
                        edit_input.setText(data+"÷");
                    }else if(str.charAt(len-1)=='+'){
                        edit_input.setText(data+"÷");
                    }else if(str.charAt(len-1)=='%'){
                        edit_input.setText(data+"÷");
                    }
                }else{
                    data = edit_input.getText().toString();
                    edit_input.setText(data +"÷");
                }

            }
        });
        btn_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edit_input.getText().toString();
                int len = str.length();
                if(edit_input.getText().toString()==""){
                    edit_input.setText("");
                }else if(str.charAt(len-1)=='x' || str.charAt(len-1)=='.' || str.charAt(len-1)=='-' || str.charAt(len-1)=='÷'|| str.charAt(len-1)=='+' || str.charAt(len-1)=='%'){
                    if(str.charAt(len-1)=='x'){
                        edit_input.setText(data+"%");
                    }else if(str.charAt(len-1)=='.'){
                        edit_input.setText(data+".");
                    }else if(str.charAt(len-1)=='-'){
                        edit_input.setText(data+"%");
                    }else if(str.charAt(len-1)=='÷'){
                        edit_input.setText(data+"%");
                    }else if(str.charAt(len-1)=='+'){
                        edit_input.setText(data+"%");
                    }else if(str.charAt(len-1)=='%'){
                        edit_input.setText(data+"%");
                    }
                }else{
                    data = edit_input.getText().toString();
                    edit_input.setText(data +"%");
                }

            }
        });


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_input.getText().toString().length()==1)
                {
                    edit_input.setText("");
                    txt_calculator.setText("Calculator");
                }else if(edit_input.getText().toString()==""){
                    edit_input.setText("");
                }else {
                    String str = edit_input.getText().toString();
                    data = str.substring(0,str.length()-1);
                    edit_input.setText(data);
                }

            }
        });
        btn_absolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edit_input.getText().toString();
                if(str.charAt(0)!=45){
                    edit_input.setText("-"+str);
                }else if(str.charAt(0)==45){
                    edit_input.setText(str.substring(1,str.length()));
                }
            }
        });



        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               data = edit_input.getText().toString();
               int len = data.length();
               data = data.replaceAll("x","*");
               data = data.replaceAll("%","/100");
               data = data.replaceAll("÷","/");

               if(edit_input.getText().toString().isEmpty()){
                    edit_result.setText("");
               }else{
                   if(data.charAt(len-1)==43 || data.charAt(len-1)==45 || data.charAt(len-1)==47 || data.charAt(len-1)==42 || data.charAt(len-1)==46 ){
                       edit_result.setText("");
                   }else{
                       equal_active = true;
                       String final_result = "";

                       Context rhino = Context.enter();
                       rhino.setOptimizationLevel(-1);

                       Scriptable scriptable = rhino.initStandardObjects();
                       final_result = rhino.evaluateString(scriptable , data ,"javascript",1,null).toString();

                       data = edit_result.getText().toString();
                       edit_result.setText(final_result);

                   }

               }

            }
        });



    }
}