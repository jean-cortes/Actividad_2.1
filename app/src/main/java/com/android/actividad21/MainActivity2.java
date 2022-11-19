package com.android.actividad21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView nombreImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recibir_activity);

        nombreImagen = findViewById(R.id.txtRecibir);

        Intent intent = getIntent();

        String nombreImagenPar = intent.getExtras().getString("NombreImagenPar");
        nombreImagen.setText("Nombre de la Imagen" + nombreImagenPar);

    }

}
