package com.isoft.practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    EditText t1,tres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.t1);
        tres = (EditText) findViewById(R.id.tres);
    }
    public void calcular(View view)
    {
        StringTokenizer stTexto = new StringTokenizer(t1.getText().toString());
        String sCadena;
        String palabraMasGrande = "";
        int palabraMasGrandeTam = 0;
        int palabras = stTexto.countTokens();
        for (int x=0;x<palabras;x++){
            sCadena = stTexto.nextToken();
            if (sCadena.length() > palabraMasGrandeTam){
                palabraMasGrande = sCadena;
                palabraMasGrandeTam = sCadena.length();
            }
        }
        tres.setText(palabraMasGrande);
    }
}
