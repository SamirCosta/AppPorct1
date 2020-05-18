package com.samir.appporct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    private TextView resu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resu = findViewById(R.id.textResu);

        Bundle bundle = getIntent().getExtras();
        String stringResultado = bundle.getString("resultado");
        resu.setText(stringResultado);

    }
}
