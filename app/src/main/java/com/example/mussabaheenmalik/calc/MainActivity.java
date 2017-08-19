package com.example.mussabaheenmalik.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double first=0;
    double second=0;
    double dummy= 0;
    String operator=null;
    double result = 0;
    TextView txt1,txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView)findViewById(R.id.textView);
        txt2=(TextView)findViewById(R.id.textView2);
    }
    public void display(){
        txt1.setText(" "+dummy+operator+second);
    }

    public void one(View view) {
        if(first!=0)
        {
            second = 1;
            calculation();
            display();

        }
        else
        {
            first = 1;
            txt1.setText(" "+first);
        }
    }

    public void two(View view) {
        if(first!=0)
        {
            second = 2;
            calculation();
            display();

        }
        else
        {
            first = 2;
            txt1.setText(" "+first);
        }
    }

    public void three(View view) {
        if(first!=0)
        {
            second = 3;
            calculation();
            display();

        }
        else
        {
            first = 3;
            txt1.setText(" "+first);
        }
    }

    public void four(View view) {
        if(first!=0)
        {
            second = 4;
            calculation();
            display();

        }
        else
        {
            first = 4;
            txt1.setText(" "+first);
        }
    }

    public void five(View view) {
        if(first!=0)
        {
            second = 5;
            calculation();
            display();

        }
        else
        {
            first = 5;
            txt1.setText(" "+first);
        }
    }

    public void six(View view) {
        if(first!=0)
        {
            second = 6;
            calculation();
            display();

        }
        else
        {
            first = 6;
            txt1.setText(" "+first);
        }
    }
    public void seven(View view) {
        if(first!=0)
    {
        second = 7;
        calculation();
        display();
    }
    else
    {
        first = 7;
        txt1.setText(" "+first);
    }

    }

    public void eight(View view) {
        if(first!=0)
        {
            second = 8;
            calculation();

            display();
        }
        else
        {
            first = 8;
            txt1.setText(" "+first);
        }
    }

    public void nine(View view) {
        if(first!=0)
        {
            second = 9;
            calculation();
            display();
        }
        else
        {
            first = 9;
            txt1.setText(" "+first);
        }

    }
    public void zero(View view) {
        if(first!=0)
        {
            second = 0;
            calculation();
            display();
        }
        else
        {
            first = 0;
            txt1.setText(" "+first);
        }
    }

    public void ans(View view) {
        first=0;
        second=0;
        operator = null;
        txt1.setText(" ");
        txt2.setText(" ");


    }

    public void decision(View view) {
        switch (view.getId())
        {
            case R.id.bplus :
                plus();
                break;
            case R.id.bminus :
                minus();
                break;
            case R.id.bmul :
                multipy();
                break;
            case R.id.bdiv :
                divide();
                break;
        }
    }
    public void plus() {

        operator = "+";
        txt1.setText(""+first+operator);
    }

    public void minus() {

        operator = "-";
        txt1.setText(""+first+operator);

    }

    public void multipy() {

        operator = "*";
        txt1.setText(""+first+operator);


    }

    public void divide() {
        operator = "/";
        txt1.setText(""+first+operator);

    }
    public  void calculation(){
        dummy=first;

        switch(operator) {
            case "+":

            first = first + second;
                break;
            case "-" :

            first = first - second;
                break;
            case "*" :

            first = first * second;
                break;
            case "/" :

            first = first / second;
                break;
        }
        txt2.setText(" "+first);

    }



}
