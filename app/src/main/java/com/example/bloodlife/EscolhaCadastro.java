package com.example.bloodlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EscolhaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_cadastro);
    }

    public void TelaCadastro(View view) {
        Button botaoUsuario = findViewById(R.id.botaoUsuario);
        Intent TelaCadastro = new Intent(getApplicationContext(), TelaCadastroUsuario.class);
        startActivity(TelaCadastro);
    }

    public void TelaCadastroHemocentro(View view) {
        Button CriarConta = findViewById(R.id.botaoHemocentro);
        Intent TelaCadastro = new Intent(getApplicationContext(), CadastroHemocentro.class);
        startActivity(TelaCadastro);
    }
}
