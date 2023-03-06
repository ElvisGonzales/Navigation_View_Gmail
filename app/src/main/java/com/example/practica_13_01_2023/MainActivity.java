package com.example.practica_13_01_2023;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        //setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuactionbar , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //case R.id.mnuNuevo:
            //    Toast.makeText(this.getApplicationContext(),"Ha presionado opción Nuevo ",Toast.LENGTH_LONG).show();
            //    return true;
            //case R.id.mnuBuscar:
            //    Toast.makeText(this.getApplicationContext(),"Ha presionado opción Buscar " ,Toast.LENGTH_LONG).show();
            //    return true;
            //case R.id.mnuSetting:
             //   Toast.makeText(this.getApplicationContext(),"Ha presionado opción Setting" ,Toast.LENGTH_LONG).show();
             //   return true;
            default:
                return super.onOptionsItemSelected(item);
            }


    }

    public void onClick(View view) {
    Snackbar.make(view, "Se presionó el FAB", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show();
    }
}