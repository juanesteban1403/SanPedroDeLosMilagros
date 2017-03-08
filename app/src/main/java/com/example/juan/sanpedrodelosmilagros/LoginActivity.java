package com.example.juan.sanpedrodelosmilagros;

import android.app.Activity;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.data;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button login, register;
    String Username, Password,Correo;
    @Override
    //para saber cual es la primera actividad miero en la carpeta manifest
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);

        //Para extraer los datos van en Bundle
        //Bundle extras = getIntent().getExtras();

        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivityForResult(intent, 1234);
            }
        });
        //para abrir los  metodos de sobre carga ctrl o
        //ara evitar toast para verificar log.d(@"nombre", data.getextras
        // ()
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals(Username)&&password.getText().toString().equals(Password)){
                    Intent intent =new Intent(LoginActivity.this,MainActivity.class);
                    intent.putExtra("username",Username);
                    intent.putExtra("password",Password);
                    //intent.putExtra("email",Correo);
                    startActivity(intent);
                }

            }
        });
    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if(requestCode==1234&& resultCode==RESULT_OK){
                Username=data.getExtras().getString("username");
                Password=data.getExtras().getString("password");

                Log.d("nombre",data.getExtras().getString("username"));
                Log.d("correo",data.getExtras().getString("email"));
                Toast.makeText(this, data.getExtras().getString("username"), Toast.LENGTH_SHORT).show();
            }
            if(requestCode==1234&& resultCode==RESULT_CANCELED){
                Toast.makeText(this,"Error en login", Toast.LENGTH_SHORT).show();
            }
        }

}
