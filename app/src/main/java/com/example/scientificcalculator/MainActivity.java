package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_input, tv_output;
    Button sin, cos, tan, btn_i, btn_e, btn_pi, btn_square, btn_cube, btn_root, btn_log, btn_ln, btn_factorial, btn_ncr, btn_npr, btn_modulas, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, point, btn_exp, btn_del, btn_ac, multiply, divide, minus, plus, ans, equal;
    boolean valid = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_input = findViewById(R.id.tv_input);
        tv_output = findViewById(R.id.tv_output);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        btn_i = findViewById(R.id.btn_i);
        btn_e = findViewById(R.id.btn_e);
        btn_pi = findViewById(R.id.btn_pi);
        btn_square = findViewById(R.id.btn_square);
        btn_cube = findViewById(R.id.btn_cube);
        btn_root = findViewById(R.id.btn_root);
        btn_log = findViewById(R.id.btn_log);
        btn_ln = findViewById(R.id.btn_ln);
        btn_factorial = findViewById(R.id.btn_factorial);
        btn_ncr = findViewById(R.id.btn_ncr);
        btn_npr = findViewById(R.id.btn_npr);
        btn_modulas = findViewById(R.id.btn_modulas);
        point = findViewById(R.id.point);
        btn_exp = findViewById(R.id.btn_exp);
        btn_root = findViewById(R.id.btn_root);
        btn_del = findViewById(R.id.btn_del);
        btn_ac = findViewById(R.id.btn_ac);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        ans = findViewById(R.id.ans);
        equal = findViewById(R.id.equal);


        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText()+"0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "9");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_input.getText().toString();
                if( !val.contains(".")){
                    tv_input.setText( val + ".");
                }

            }
        });


        btn_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inpval = Double.parseDouble(tv_input.getText().toString());
                tv_output.setText(String.valueOf(Math.sqrt(inpval)));



            }
        });

        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inpval = Double.parseDouble(tv_input.getText().toString());
                tv_output.setText(String.valueOf(Math.pow(inpval,2)));
            }
        });

        btn_cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inpval = Double.parseDouble(tv_input.getText().toString());
                tv_output.setText(String.valueOf(Math.pow(inpval,3)));
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText("");
                tv_output.setText("");
            }
        });

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String val = tv_input.getText().toString();
                if (val != null && val.length()>0){
                    val = (val.substring(0, val.length() - 1));
                    tv_input.setText(val);

                }
                else{
                    tv_output.setText("Empty");

                }



            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = (tv_input.getText().toString());
                if(!(val.endsWith("+")||val.endsWith("÷")||val.endsWith("x")||val.endsWith("-")) ){
                    tv_input.setText(val+ 'x');

                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = (tv_input.getText().toString() );
                if(!(val.endsWith("+")||val.endsWith("÷")||val.endsWith("x")||val.endsWith("-"))){
                    tv_input.setText(val + '÷');

                }

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = (tv_input.getText().toString() );
                if(!(val.endsWith("+")||val.endsWith("÷")||val.endsWith("x")||val.endsWith("-"))){
                    tv_input.setText(val + '+');

                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = (tv_input.getText().toString());
                if(!(val.endsWith("+")||val.endsWith("÷")||val.endsWith("x")||val.endsWith("-"))){
                    tv_input.setText(val+ '-');

                }
            }
        });







    }

}

