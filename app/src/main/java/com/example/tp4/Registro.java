package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    private Button btnRegistroGuardar;
    private TextView edtRegistroNombre, edtRegistroUsuario, edtRegistroCorreo, edtRegistroClave, edtRegistroClave2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        this.findViews();
    }

    private void findViews(){
        btnRegistroGuardar = findViewById(R.id.btnRegistroGuardar);
        edtRegistroNombre = findViewById(R.id.edtRegistroNombre);
        edtRegistroUsuario = findViewById(R.id.edtRegistroUsuario);
        edtRegistroCorreo = findViewById(R.id.edtRegistroCorreo);
        edtRegistroClave = findViewById(R.id.edtRegistroClave);
        edtRegistroClave2 = findViewById(R.id.edtRegistroClave2);

        btnRegistroGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}