package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.mariuszgromada.math.mxparser.*;
public class MainActivity extends AppCompatActivity {

    TextView tv_input, tv_output;
    Button sin, cos, tan, btn_shift, btn_e, btn_pi, btn_square, btn_cube, btn_root, btn_gcd,btn_lcm,btn_log, btn_ln, btn_factorial, btn_ncr, btn_npr, btn_modulas, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, point, btn_exp, btn_del, btn_ac, multiply, divide, minus, plus, ans, equal,btn_percent,btn_left_bracket,btn_right_bracket,btn_comma,btn_memory,btn_min,btn_max,btn_xn,btn_music;
    boolean valid = true;
    boolean val = true;
    String ans_val ;
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
        btn_root = findViewById(R.id.btn_root);
        btn_del = findViewById(R.id.btn_del);
        btn_ac = findViewById(R.id.btn_ac);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        ans = findViewById(R.id.ans);
        equal = findViewById(R.id.equal);
        btn_percent = findViewById(R.id.btn_percent);
        btn_left_bracket = findViewById(R.id.btn_left_bracket);
        btn_right_bracket = findViewById(R.id.btn_right_bracket);
        btn_gcd = findViewById(R.id.btn_gcd);
        btn_lcm = findViewById(R.id.btn_lcm);
        btn_comma = findViewById(R.id.btn_comma);
        btn_memory = findViewById(R.id.btn_memory);
        btn_min = findViewById(R.id.btn_min);
        btn_max = findViewById(R.id.btn_max);
        btn_xn= findViewById(R.id.btn_xn);
        btn_music = findViewById(R.id.btn_music);
        final MediaPlayer music = MediaPlayer.create(this,R.raw.music);



        btn_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                    if(btn_music.getText().toString().equals("►")){
                    if(!val){

                        music.stop();
                        btn_music.setText("♫");
                        val=true;

                    }
//                    else if(btn_music.getText().toString().equals("♫")){
                    else{

                        music.start();
                        btn_music.setText("►");
                        val=false;


                    }
                }


//            }


        });






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
                tv_input.setText(tv_input.getText()+"√(");



            }
        });


        btn_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText()+"π");



            }
        });

        btn_left_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"("));



            }
        });

        btn_right_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+")"));



            }
        });

        btn_comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+","));



            }
        });

        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"min("));



            }
        });

        btn_max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"max("));



            }
        });

        btn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"%"));



            }
        });

        btn_modulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"mod"));



            }
        });

        btn_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"!"));



            }
        });

        btn_gcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"gcd("));



            }
        });

        btn_lcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"lcm("));



            }
        });

        btn_xn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"^"));



            }
        });



        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"sin("));



            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"cos("));



            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"tan("));



            }
        });

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"log("));



            }
        });

        btn_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"ln("));



            }
        });

        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(String.valueOf(tv_input.getText()+"e"));



            }
        });


        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                double inpval = Double.parseDouble(tv_input.getText().toString());
                tv_input.setText(String.valueOf(tv_input.getText() +"²"));

            }
        });

        btn_cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                double inpval = Double.parseDouble(tv_input.getText().toString());


                tv_input.setText(String.valueOf(tv_input.getText() +"³"));
//                tv_output.setText(String.valueOf(Math.pow(inpval,3)));
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText("");
                tv_output.setText("");
//                Toast.makeText(getApplicationContext(),"Clicked Ac",Toast.LENGTH_LONG).show();
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
                    tv_input.setText(val+ '×');

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

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = (tv_input.getText().toString());
                val = val.replaceAll("×","*");
                val = val.replaceAll("÷","/");
                val = val.replaceAll("²","^2");
                val = val.replaceAll("³","^3");
                val = val.replaceAll("mod","#");
                val = val.replaceAll("log","log10");
                val = val.replaceAll("√","sqrt");
                val = val.replaceAll("π","pi ");

                Expression exp;
                exp = new Expression(val);

                String result = String.valueOf(exp.calculate());
                ans_val = result;
                tv_output.setText(result);
            }
        });

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText()+ans_val);
            }
        });

        btn_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = tv_input.getText().toString();
                SharedPreferences myshrd = getSharedPreferences("saving_data",MODE_PRIVATE);
                SharedPreferences.Editor myeditor = myshrd.edit();
                myeditor.putString("data",txt);
                myeditor.apply();

            }

        });




    }

}

