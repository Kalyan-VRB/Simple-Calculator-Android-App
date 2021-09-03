package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button ac;
    private Button mod;
    private Button eq;
    private ImageButton bs;
    private Button dec;
    private TextView exp;
    private TextView res;
    private boolean symbol;
    private boolean decimal;
    private ImageButton guide;

    private long backPressedTime;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.oneBtn);
        two = findViewById(R.id.twoBtn);
        three = findViewById(R.id.threeBtn);
        four = findViewById(R.id.fourBtn);
        five = findViewById(R.id.fiveBtn);
        six = findViewById(R.id.sixBtn);
        seven = findViewById(R.id.sevenBtn);
        eight = findViewById(R.id.eightBtn);
        nine = findViewById(R.id.nineBtn);
        zero = findViewById(R.id.zeroBtn);
        add = findViewById(R.id.plusBtn);
        sub = findViewById(R.id.minusBtn);
        mul = findViewById(R.id.mulBtn);
        div = findViewById(R.id.divBtn);
        ac = findViewById(R.id.clearBtn);
        mod = findViewById(R.id.moduloBtn);
        eq = findViewById(R.id.equalBtn);
        bs = findViewById(R.id.backSpaceBtn);
        dec = findViewById(R.id.pointBtn);
        exp = findViewById(R.id.expression);
        res = findViewById(R.id.result);
        guide = findViewById(R.id.questionBtn);

        exp.setText("");
        res.setText("");

        res.setTextSize(35);
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),GuideActivity.class));
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "0");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "1");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "2");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "3");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "4");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "5");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "6");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "7");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "8");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                exp.setText(exp.getText().toString() + "9");
                symbol = false;
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText("= "+String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                    res.setText("ERROR");
                }
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if (!decimal || exp.getText().toString() == null) {
                    exp.setText(exp.getText().toString() + ".");
                    symbol = !symbol;
                    decimal = !decimal;
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if (!symbol || exp.getText().toString() == null) {
                    exp.setText(exp.getText().toString() + "+");
                    symbol = !symbol;
                    decimal = false;
                }
                else{
                    CharSequence name = exp.getText().toString();
                    exp.setText(name.subSequence(0,name.length()-1)+"+");
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if (!symbol || exp.getText().toString() == null) {
                    exp.setText(exp.getText().toString() + "-");
                    symbol = !symbol;
                    decimal = false;
                }
                else{
                    CharSequence name = exp.getText().toString();
                    exp.setText(name.subSequence(0,name.length()-1)+"-");
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if (!symbol) {
                    exp.setText(exp.getText().toString() + "*");
                    symbol = !symbol;
                    decimal = false;
                }
                else{
                    CharSequence name = exp.getText().toString();
                    exp.setText(name.subSequence(0,name.length()-1)+"*");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if (!symbol) {
                    exp.setText(exp.getText().toString() + "/");
                    symbol = !symbol;
                    decimal = false;
                }
                else{
                    CharSequence name = exp.getText().toString();
                    exp.setText(name.subSequence(0,name.length()-1)+"/");
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if (!symbol) {
                    exp.setText(exp.getText().toString() + "%");
                    symbol = !symbol;
                    decimal = false;
                }
                else{
                    CharSequence name = exp.getText().toString();
                    exp.setText(name.subSequence(0,name.length()-1)+"%");
                }
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(50);
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                if (exp.getText().toString().length() > 0) {
                    try {
                        String ab = exp.getText().toString();
                        if (ab.length() > 0) {
                            res.setText("= "+String.valueOf(engine.eval(ab)));
                        }
                    } catch (ScriptException e) {
                        e.printStackTrace();
                        res.setText("ERROR");
                    }
                    CharSequence name = exp.getText().toString();
                    if (!(name.charAt(name.length() - 1) == '+' || name.charAt(name.length() - 1) == '-' || name.charAt(name.length() - 1) == '*' || name.charAt(name.length() - 1) == '/' || name.charAt(name.length() - 1) == '%')) {
                        symbol = false;
                    }
                    if (name.charAt(name.length() - 1) == '.')
                        decimal = false;

                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                exp.setText(null);
                res.setText(null);
                symbol = false;
                decimal = false;
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if (exp.getText().length() > 0) {
                    CharSequence name = exp.getText().toString();
                    if (name.charAt(name.length() - 1) == '+' || name.charAt(name.length() - 1) == '-' || name.charAt(name.length() - 1) == '*' || name.charAt(name.length() - 1) == '/' || name.charAt(name.length() - 1) == '%') {
                        symbol = false;
                    }
                    if (name.charAt(name.length() - 1) == '.')
                        decimal = false;
                    exp.setText(name.subSequence(0, name.length() - 1));
                } else {
                    exp.setText(null);
                    res.setText(null);
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        if(backPressedTime +2000 >System.currentTimeMillis()){
            backToast.cancel();
            finishAffinity();
            return;
        }
        else{
            backToast = Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_LONG);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}