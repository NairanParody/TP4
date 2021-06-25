package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    private Button btnPrincipalEnviar, btnPrincipalLlamar, btnPrincipalIngresar, btnPrincipalSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        this.findViews();
    }

    private void findViews(){
        btnPrincipalEnviar = findViewById(R.id.btnPrincipalEnviar);
        btnPrincipalLlamar = findViewById(R.id.btnPrincipalLlamar);
        btnPrincipalIngresar = findViewById(R.id.btnPrincipalIngresar);
        btnPrincipalSalir = findViewById(R.id.btnPrincipalSalir);

        btnPrincipalSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnPrincipalEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("*/*");
                    intent.putExtra(Intent.EXTRA_EMAIL, "nairanparody@gmail.com");
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Consulta Presupuesto");
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
            }
        });
        btnPrincipalLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "2954551766"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        btnPrincipalIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://github.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}