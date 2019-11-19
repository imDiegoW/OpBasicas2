package com.example.opbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText numero1, numero2;
    Button btn1, btn2;
    TextView  resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);
        resultado = (TextView) findViewById(R.id.resultado);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int n1 = Integer.parseInt(numero1.getText().toString());
        int n2 = Integer.parseInt(numero2.getText().toString());
        int suma = n1+n2;
       // resultado.setText("el resultado es: " + suma);
        int resta = n1-n2;

        if (view.getId()==R.id.btn1)
        {
            resultado.setText("suma"+suma);
        }
        else if (view.getId()==R.id.btn2)
        {
            resultado.setText("resta"+resta);
        }


    }
}
