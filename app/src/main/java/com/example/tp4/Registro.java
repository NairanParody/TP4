package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    private Button btnRegistroGuardar;
    private TextView edtRegistroNombre, edtRegistroUsuario, edtRegistroCorreo, edtRegistroClave, edtRegistroClave2;
    private SharedPreferences pref;
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

        pref = getSharedPreferences("mis_pref", Context.MODE_PRIVATE);


        btnRegistroGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = pref.edit();

                String nombre = edtRegistroNombre.getText().toString();
                String usuario= edtRegistroUsuario.getText().toString();
                String email= edtRegistroCorreo.getText().toString();
                String clave= edtRegistroClave.getText().toString();
                String clave2= edtRegistroClave2.getText().toString();

                editor.putString("nombre",nombre);
                editor.putString("usuario",usuario);
                editor.putString("email",email);
                editor.putString("clave",clave);
                editor.putString("clavesegunda",clave2);

                editor.commit();
                finish();
            }
        });
    }
}