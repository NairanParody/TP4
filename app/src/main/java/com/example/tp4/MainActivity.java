package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMainRegistrar,btnMainIngresar;
    private TextView edtMainEmail, edtMainClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViews();
    }

    private void findViews(){
        btnMainIngresar = findViewById(R.id.btnMainIngresar);
        btnMainRegistrar = findViewById(R.id.btnMainRegistrar);
        edtMainEmail = findViewById(R.id.edtMainEmail);
        edtMainClave = findViewById(R.id.edtMainClave);

        btnMainRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar= new Intent("android.intent.action.REGISTRO");
                startActivity(registrar);
            }
        });

        btnMainIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = edtMainEmail.getText().toString();
                String clave = edtMainClave.getText().toString();
                if(usuario.equals("nairan@ites") && clave.equals("1234")){
                    Intent principal= new Intent("android.intent.action.PRINCIPAL" );
                    startActivity(principal);
                    edtMainEmail.setText(" ");
                    edtMainClave.setText(" ");
                }else{
                    Toast.makeText(MainActivity.this, "Usuario o Contraseña INCORRECTA", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}