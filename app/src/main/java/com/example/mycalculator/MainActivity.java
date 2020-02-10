package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add,sub,mul,div;
    EditText first,second;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.Plus);
        sub=(Button)findViewById(R.id.Subtract);
        mul=(Button)findViewById(R.id.Multiply);
        div=(Button)findViewById(R.id.Divide);
        first=(EditText)findViewById(R.id.First_Number);
        second=(EditText)findViewById(R.id.Second_Number);
        result=(TextView)findViewById(R.id.Result);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=first.getText().toString();
                String s2=second.getText().toString();
                double res=Double.parseDouble(s1)+Double.parseDouble(s2);
                result.setText(String.valueOf(res));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=first.getText().toString();
                String s2=second.getText().toString();
                 double res=Double.parseDouble(s1)-Double.parseDouble(s2);
                result.setText(String.valueOf(res));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=first.getText().toString();
                String s2=second.getText().toString();
                 double res=Double.parseDouble(s1)*Double.parseDouble(s2);
                result.setText(String.valueOf(res));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=first.getText().toString();
                String s2=second.getText().toString();
                 double res=Double.parseDouble(s1)/Double.parseDouble(s2);
                result.setText(String.valueOf(res));
            }
        });
    }
}
