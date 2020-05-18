package com.samir.appporct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText valBrutoDig, valPorctDig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valBrutoDig = findViewById(R.id.editValBruto);
        valPorctDig = findViewById(R.id.editPorct);

    }

    public void abrirTela(View v){
        if(valBrutoDig.getText().length() != 0 && valPorctDig.getText().length() != 0) {

            double valBruto = Double.parseDouble(valBrutoDig.getText().toString());
            double valPorct = Double.parseDouble(valPorctDig.getText().toString());

            double resu = ((valBruto * valPorct) / 100) + valBruto;
            String resuString = Double.toString(resu);

            Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
            intent.putExtra("resultado", resuString);
            startActivity(intent);

        }else{
            Toast.makeText(MainActivity.this, "Digite algum valor", Toast.LENGTH_LONG).show();
        }
    }

}
