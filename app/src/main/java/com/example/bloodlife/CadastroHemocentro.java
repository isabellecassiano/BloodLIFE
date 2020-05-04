package com.example.bloodlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroHemocentro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_hemocentro);

        Bundle pacote = new Bundle();


        EditText editNomeHemo = findViewById(R.id.editNomeHemo);
        String nome = editNomeHemo.getText().toString();
        pacote.putString("nomeHemo", nome);

        EditText editSenha = findViewById(R.id.editSenhaHemo);
        String senhaHemo = editSenha.getText().toString();
        pacote.putString("senhaHemo", senhaHemo);

        EditText editCnpj = findViewById(R.id.editCnpj);
        String cnpj = editCnpj.getText().toString();
        pacote.putString("cnpjHemo", cnpj);

        EditText editLocalizacao = findViewById(R.id.editLocalizacao);
        String localizacao = editLocalizacao.getText().toString();
        pacote.putString("localizacaoHemo", localizacao);

        EditText editTelefoneHemo = findViewById(R.id.editTelefoneHemo);
        String telefoneHemo = editTelefoneHemo.getText().toString();
        pacote.putString("telefoneHemo", telefoneHemo);

        Intent perfilHemocentro = new Intent(getApplicationContext(), Perfil_Hemocentro.class);
        perfilHemocentro.putExtras(pacote);
        startActivity(perfilHemocentro);


    }

    public void TelaInicial(View view) {
        Button CriarConta = findViewById(R.id.botaoCadastrarHemo);
        Intent TelaCadastroHemocentro = new Intent(getApplicationContext(), Perfil_Hemocentro.class);
        startActivity(TelaCadastroHemocentro);
    }
}
