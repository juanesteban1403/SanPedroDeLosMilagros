package com.example.juan.sanpedrodelosmilagros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    String username,correo;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle extras=getIntent().getExtras();
        username=extras.getString("username");
        correo=extras.getString("email");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch(id){
            case R.id.mPerfil:
                intent = new Intent(MainActivity.this, PerfilActivity.class);
                intent.putExtra("username",username);
                startActivity(intent);

                break;
            case R.id.mLogOut:
                intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.mHoteles:
                intent = new Intent(MainActivity.this,DrawerTodo1Activity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.mRes:
                intent = new Intent(MainActivity.this,Todo2Activity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.mtursm:
                intent = new Intent(MainActivity.this,Todo3Activity.class);
                startActivity(intent);
                finish();
                break;



        }
        return true;
    }
}
