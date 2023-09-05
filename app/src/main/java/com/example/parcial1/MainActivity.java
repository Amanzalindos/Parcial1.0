package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sumar(View v){
        EditText et1 = (EditText)findViewById(R.id.edit1);
        EditText et2 = (EditText)findViewById(R.id.edit2);
        TextView et3 = (TextView) findViewById(R.id.textRes);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText(result);

    }

    public void Restar(View v){
        EditText et1 = (EditText)findViewById(R.id.edit1);
        EditText et2 = (EditText)findViewById(R.id.edit2);
        TextView et3 = (TextView) findViewById(R.id.textRes);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText(result);

    }

    public void Multiplicar(View v){
        EditText et1 = (EditText)findViewById(R.id.edit1);
        EditText et2 = (EditText)findViewById(R.id.edit2);
        TextView et3 = (TextView) findViewById(R.id.textRes);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1*n2;

        et3.setText(result);

    }

    public void Dividir(View v){
        EditText et1 = (EditText)findViewById(R.id.edit1);
        EditText et2 = (EditText)findViewById(R.id.edit2);
        TextView et3 = (TextView) findViewById(R.id.textRes);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;

        et3.setText(result);

    }
}