package com.example.claudia.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public Button A1, A2, A3, B1, B2, B3, C1, C2, C3;
    int turno, contador;
    EditText J1, J2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        A1 = (Button)findViewById(R.id.A1);
        A2 = (Button)findViewById(R.id.A2);
        A3 = (Button)findViewById(R.id.A3);
        B1 = (Button)findViewById(R.id.B1);
        B2 = (Button)findViewById(R.id.B2);
        B3 = (Button)findViewById(R.id.B3);
        C1 = (Button)findViewById(R.id.C1);
        C2 = (Button)findViewById(R.id.C2);
        C3 = (Button)findViewById(R.id.C3);

        A1.setOnClickListener(this);
        A2.setOnClickListener(this);
        A3.setOnClickListener(this);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        C1.setOnClickListener(this);
        C2.setOnClickListener(this);
        C3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        contador ++;
        turno = contador%2;

        if(turno == 1){
            imprimirXO('X', view);
        }
        else{
            imprimirXO('0', view);
        }
    }

    public void imprimirXO(char letra, View view){
        if(view.getId() == R.id.A1){
            A1.setText(letra+"");
            A1.setEnabled(false);
        }
        else if(view.getId() == R.id.A2){
            A2.setText(letra+"");
            A2.setEnabled(false);
        }
        else if(view.getId() == R.id.A3){
            A3.setText(letra+"");
            A3.setEnabled(false);
        }
        else    if(view.getId() == R.id.B1){
            B1.setText(letra+"");
            B1.setEnabled(false);
        }
        else if(view.getId() == R.id.B2){
            B2.setText(letra+"");
            B2.setEnabled(false);
        }
        else if(view.getId() == R.id.B3){
            B3.setText(letra+"");
            B3.setEnabled(false);
        }
        else if(view.getId() == R.id.C1){
            C1.setText(letra+"");
            C1.setEnabled(false);
        }
        else if(view.getId() == R.id.C2){
            C2.setText(letra+"");
            C2.setEnabled(false);
        }
        else if(view.getId() == R.id.C3){
            C3.setText(letra+"");
            C3.setEnabled(false);
        }
    }

}
