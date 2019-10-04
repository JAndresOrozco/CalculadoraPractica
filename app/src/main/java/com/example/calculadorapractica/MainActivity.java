package com.example.calculadorapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public EditText pantalla;
    public double operando1, operando2, res;
    int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla =(EditText)findViewById(R.id.caja);
    }
    public void btn1(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn2(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "2";
        pantalla.setText(cap);
    }

    public void btn3(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "3";
        pantalla.setText(cap);
    }

    public void btn4(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "4";
        pantalla.setText(cap);
    }

    public void btn5(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "5";
        pantalla.setText(cap);
    }

    public void btn6(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "6";
        pantalla.setText(cap);
    }

    public void btn7(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "7";
        pantalla.setText(cap);
    }

    public void btn8(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "8";
        pantalla.setText(cap);
    }

    public void btn9(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "9";
        pantalla.setText(cap);
    }

    public void btn0(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "0";
        pantalla.setText(cap);
    }
    public void btnpunto(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + ".";
        pantalla.setText(cap);
    }

    public void suma(View view) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {}
            pantalla.setText(" ");
            operacion = 1;

    }

    public void resta(View view) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {}
            pantalla.setText(" ");
            operacion = 2;

    }

    public void multiplicacion(View view) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {}
            pantalla.setText(" ");
            operacion = 3;

    }

    public void division(View view) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {}
            pantalla.setText(" ");
            operacion = 4;

    }

    public void porcentaje(View view) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {}
            pantalla.setText(" ");
            operacion = 5;

    }
    @SuppressLint("SetTextI18n")
    public void igual(View view){
        try {
            String aux2=pantalla.getText().toString();
            operando2=Double.parseDouble(aux2);
        }catch(NumberFormatException nfc){}
            pantalla.setText(" ");

            if(operacion ==1){
                res = operando1 + operando2;

            }else if(operacion==2){
                res=operando1-operando2;

            }else if(operacion==3){
                res=operando1*operando2;

            }else if(operacion==4){
                if(operando2==0) {
                    pantalla.setText("Error");
                }else{
                    res=operando1/operando2;
                }
            }else if(operacion == 5){
                res= operando2*(operando1/100.0);
            }


        pantalla.setText(""+res);
        operando1=res;
    }
    public void clear(View view){
        pantalla.setText("");
        operando1 = 0.0;
        operando2 = 0.0;
        res= 0.0;
    }

    @Override
    public void onClick(View v) {

    }
}
