package com.example.calculadora_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText valor1,valor2;
    private TextView rs;
    private RadioButton rbsum, rbresta, rbmulti, rbdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.txtnumero1);
        valor2 = (EditText) findViewById(R.id.txtnumero2);
        rs = (TextView) findViewById(R.id.textView);
        rbsum = (RadioButton) findViewById(R.id.rbsuma);
        rbresta = (RadioButton) findViewById(R.id.rbresta);
        rbmulti = (RadioButton) findViewById(R.id.rbmultiplicar);
        rbdiv = (RadioButton) findViewById(R.id.rbdividir);

    }

    //Metodo para calcular la operacion
    public void calcular(View view){
        Toast.makeText(this, "Entro", Toast.LENGTH_SHORT).show();
        int vl1 = (Integer)(Integer.parseInt(this.valor1.getText().toString()));
        int vl2 = (Integer) (Integer.parseInt(this.valor2.getText().toString()));
        int resultado =0;

        if(rbsum.isChecked()){
            resultado = vl1+vl2;
        }else if(rbresta.isChecked()){
            resultado = vl1-vl2;

        }else if(rbmulti.isChecked()){
            resultado = vl1*vl2;

        }else if(rbdiv.isChecked()){
            if(vl2==0){
                Toast.makeText(this, "La división entre cero no existe", Toast.LENGTH_LONG).show();
            }
            else{
                resultado = vl1/vl2;
            }
        }else{
            Toast.makeText(this, "Por favor seleccione un tipo de operación", Toast.LENGTH_LONG).show();
        }

        rs.setText("Resultado: " + resultado);

    }

}