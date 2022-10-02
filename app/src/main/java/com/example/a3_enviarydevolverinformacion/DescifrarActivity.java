package com.example.a3_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.a3_enviarydevolverinformacion.modelos.Usuario;

public class DescifrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descifrar);

        Intent intent = this.getIntent();

        Bundle bundle = intent.getExtras();

        if (bundle != null){
            Usuario user = (Usuario) bundle.getSerializable("USER");
            Toast.makeText(this,user.toString(),Toast.LENGTH_SHORT).show();
        }
    }
}