package com.example.bloodlife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class TelaCadastroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_usuario);
    }

    public void TelaInicial(View view) throws IOException {
        Bundle pacote = new Bundle();

        EditText editUsuario = findViewById(R.id.editUsuario);
        String usuario = editUsuario.getText().toString();
        pacote.putString("nomeUsuario", usuario);

        EditText editSenha = findViewById(R.id.editSenha);
        String senha = editSenha.getText().toString();
        pacote.putString("senhaUsuario", senha);

        EditText editCep = findViewById(R.id.editCep);
        String cep = editCep.getText().toString();
        pacote.putString("cepUsuario", cep);

        EditText editEmail = findViewById(R.id.editEmail);
        String email = editEmail.getText().toString();
        pacote.putString("emailUsuario", email);

        EditText editTelefone = findViewById(R.id.editTelefone);
        String telefone = editTelefone.getText().toString();
        pacote.putString("telefoneUsuario", telefone);

        EditText editCpf = findViewById(R.id.editCpf);
        String cpf = editCpf.getText().toString();
        pacote.putString("cpfUsuario", cpf);

        EditText editTipoSanguineo = findViewById(R.id.editTipoSanguineo);
        String tipo_sanguineo = editTipoSanguineo.getText().toString();
        pacote.putString("tipoSanguineoUsuario", tipo_sanguineo);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        if (radioGroup.getCheckedRadioButtonId() == R.id.radioButtonF) {
            pacote.putString("sexoUsuario", "Feminino");
        } else if (radioGroup.getCheckedRadioButtonId() == R.id.radioButtonM) {
            pacote.putString("sexoUsuario", "Masculino");
        }

        //Ronan: erro na assinatura do método DBHelper.insertIntoUsuario(usuario, senha, cep, ..);
        //Ronan: suponho que nome na assinatura é a string usuário aqui
        DBHelper.insertIntoUsuario(cpf, usuario, email, senha);

        Intent PerfilUsuario = new Intent(getApplicationContext(), PerfilUsuario.class);
        PerfilUsuario.putExtras(pacote);
        startActivity(PerfilUsuario);
    }
}
