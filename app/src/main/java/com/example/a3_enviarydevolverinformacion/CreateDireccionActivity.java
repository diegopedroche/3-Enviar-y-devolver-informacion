package com.example.a3_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a3_enviarydevolverinformacion.modelos.Direccion;

public class CreateDireccionActivity extends AppCompatActivity {

    private EditText txtCalle;
    private EditText txtNumero;
    private EditText txtCiudad;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_direccion);
        inicializaVistas();

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Direccion dir = new Direccion(
                        txtCalle.getText().toString(),
                        Integer.parseInt(txtNumero.getText().toString()),
                        txtCiudad.getText().toString()
                );
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("DIR", dir);
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    private void inicializaVistas() {
        txtCiudad = findViewById(R.id.txtCiudadCreateDir);
        txtCalle = findViewById(R.id.txtCalleCreateDir);
        txtNumero = findViewById(R.id.txtNumeroCreateDir);
        btnCrear = findViewById(R.id.btnCrearCreateDir);
    }
}