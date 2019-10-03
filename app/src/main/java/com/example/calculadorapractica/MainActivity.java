package com.example.calculadorapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    public EditText pantalla;
    public double operando1, operando2, res;
    int operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn1(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn2(View view) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn3(View v) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn4(View v) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn5(View v) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn6(View v) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn7(View v) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn8(View v) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn9(View v) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void btn0(View v) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }
    public void btnpunto(View v) {
        String cap = pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void suma(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
            pantalla.setText("");
            operacion = 1;
        }
    }

    public void resta(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
            pantalla.setText("");
            operacion = 2;
        }
    }

    public void multiplicacion(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
            pantalla.setText("");
            operacion = 3;
        }
    }

    public void division(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
            pantalla.setText("");
            operacion = 4;
        }
    }

    public void porcentaje(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
            pantalla.setText("");
            operacion = 5;
        }
    }
    public void igual(View v){
        try {
            String aux2=pantalla.getText().toString();
            operando2=Double.parseDouble(aux2);
        }catch(NumberFormatException nfc){
            pantalla.setText("");

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
        }

        pantalla.setText(""+res);
        operando1=res;
    }
    public void clear(View v){
        pantalla.setText("");
        operando1 = 0.0;
        operando2 = 0.0;
        res= 0.0;
    }
}
