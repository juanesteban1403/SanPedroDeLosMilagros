package com.example.juan.sanpedrodelosmilagros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {
    TextView tUsername;
    Intent intent;
    String username,correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        tUsername = (TextView) findViewById(R.id.tUsename);

        Bundle extras = getIntent().getExtras();
        tUsername.setText(extras.getString("username"));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case R.id.mPerfil:
                intent = new Intent(PerfilActivity.this, PerfilActivity.class);
                intent.putExtra("username", username);

                intent.putExtra("email",correo);
                startActivity(intent);

                break;
            case R.id.mLogOut:
                intent = new Intent(PerfilActivity.this, LoginActivity.class);
                startActivity(intent);
                intent.putExtra("username",username);
                intent.putExtra("email",correo);
                finish();
                break;
            case R.id.mHoteles:
                intent = new Intent(PerfilActivity.this, TodoActivity.class);
                startActivity(intent);
                intent.putExtra("username",username);
                intent.putExtra("email",correo);
                finish();
                break;
            case R.id.mRes:
                intent = new Intent(PerfilActivity.this, Todo2Activity.class);
                startActivity(intent);
                intent.putExtra("username",username);
                intent.putExtra("email",correo);
                finish();
                break;
            case R.id.mtursm:
                intent = new Intent(PerfilActivity.this, Todo3Activity.class);
                startActivity(intent);
                intent.putExtra("username",username);
                intent.putExtra("email",correo);
                finish();
                break;

        }


        return true;
    }
}
