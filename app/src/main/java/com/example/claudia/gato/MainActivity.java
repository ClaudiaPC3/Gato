package com.example.claudia.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public Button A1, A2, A3, B1, B2, B3, C1, C2, C3;
    public Button again;

    int turno, contador, cont = 0;

    EditText J1, J2, Ganador;


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

        again = (Button)findViewById(R.id.again);
        again.setOnClickListener(this);

        J1 = (EditText)findViewById(R.id.nomj1);
        J2 = (EditText)findViewById(R.id.nomj2);
        Ganador = (EditText)findViewById(R.id.winname);



    }

    @Override
    public void onClick(View view) {
        cont ++;
        turno = cont%2;

        if(turno == 1){
            imprimirXO('X', view);
        }
        else{
            imprimirXO('0', view);
        }
    }


    public void imprimirXO(char letra, View view){

        if(view.getId() == R.id.again){
            Ganador.setEnabled(false);
            Ganador.setText("");
            J1.setText("");
            J2.setText("");
            cont = 0;

            A1.setEnabled(true);
            A1.setText("");
            A2.setEnabled(true);
            A2.setText("");
            A3.setEnabled(true);
            A3.setText("");
            B1.setEnabled(true);
            B1.setText("");
            B2.setEnabled(true);
            B2.setText("");
            B3.setEnabled(true);
            B3.setText("");
            C1.setEnabled(true);
            C1.setText("");
            C2.setEnabled(true);
            C2.setText("");
            C3.setEnabled(true);
            C3.setText("");

        }


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

        Quien_gano(letra);

    }//FIN DE IMPRIMIR

    public void Quien_gano(char letra){
        if(A1.getText().toString().equals(letra+"") && A2.getText().toString().equals(letra+"") && A3.getText().toString().equals(letra+"")){
            Imp_ganador(letra);
        }else         if(B1.getText().toString().equals(letra+"") && B2.getText().toString().equals(letra+"") && B3.getText().toString().equals(letra+"")){
            Imp_ganador(letra);
        }else         if(C1.getText().toString().equals(letra+"") && C2.getText().toString().equals(letra+"") && C3.getText().toString().equals(letra+"")){
            Imp_ganador(letra);
        }else         if(A1.getText().toString().equals(letra+"") && B2.getText().toString().equals(letra+"") && C3.getText().toString().equals(letra+"")){
            Imp_ganador(letra);
        }else         if(C1.getText().toString().equals(letra+"") && B2.getText().toString().equals(letra+"") && A3.getText().toString().equals(letra+"")){
            Imp_ganador(letra);
        }else         if(C1.getText().toString().equals(letra+"") && B1.getText().toString().equals(letra+"") && A1.getText().toString().equals(letra+"")){
            Imp_ganador(letra);
        }else         if(C2.getText().toString().equals(letra+"") && B2.getText().toString().equals(letra+"") && A2.getText().toString().equals(letra+"")){
            Imp_ganador(letra);
        }else         if(C3.getText().toString().equals(letra+"") && B3.getText().toString().equals(letra+"") && A3.getText().toString().equals(letra+"")){
            Imp_ganador(letra);
        }
    }

    public void Imp_ganador(char letra){

        String nom1 = J1.getText().toString();
        String nom2 = J2.getText().toString();

        if(letra == 'X'){
            Ganador.setText(nom1);
        }else{
            Ganador.setText(nom2);
        }

        Ganador.setEnabled(false);
        A1.setEnabled(false);
        A2.setEnabled(false);
        A3.setEnabled(false);
        B1.setEnabled(false);
        B2.setEnabled(false);
        B3.setEnabled(false);
        C1.setEnabled(false);
        C2.setEnabled(false);
        C3.setEnabled(false);
    }

}
