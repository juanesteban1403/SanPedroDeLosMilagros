package com.example.juan.sanpedrodelosmilagros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText correo,Rusername,Rpassword,RRpassword;
    Button Rregister,Rcancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        correo=(EditText)findViewById(R.id.correo);
        Rusername=(EditText)findViewById(R.id.Rusername);
        Rpassword=(EditText)findViewById(R.id.Rpassword);
        RRpassword=(EditText)findViewById(R.id.RRpassword);
        Rregister=(Button)findViewById(R.id.Rregistro);
        Rcancelar=(Button)findViewById(R.id.Rcancelar);

        Rregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent;
                setResult(RESULT_CANCELED,intent);
                }
        });

        Rregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.putExtra("username",Rusername.getText().toString());
                intent.putExtra("password",Rpassword.getText().toString());
                intent.putExtra("email",correo.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }

}
