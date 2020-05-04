package com.example.bloodlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textBlood;
    public ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);
    }

    public void TelaCadastro(View view) {
        Button CriarConta = findViewById(R.id.botaoCadastro);
        Intent TelaCadastro = new Intent(getApplicationContext(), EscolhaCadastro.class);
        startActivity(TelaCadastro);

    }

    public void TelaInicial(View view) {

        Intent TelaInicial = new Intent(getApplicationContext(), PerfilUsuario.class);
        Bundle dados = new Bundle();

        EditText Usuario = findViewById(R.id.editNome);
        String usuario = Usuario.getText().toString();
        EditText Senha = findViewById(R.id.editSenha);
        String senha = Senha.getText().toString();
        Button Login = findViewById(R.id.botaoLogin);
        dados.putString("chave_nome", usuario);
        dados.putString("chave_senha", senha);

        TelaInicial.putExtras(dados);
        startActivity(TelaInicial);
    }
}
