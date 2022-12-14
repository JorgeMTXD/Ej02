package com.example.a02_ciclodevidadelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e( "Ciclo de Vida", "Estoy ejecutando onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e( "Ciclo de Vida", "Estoy ejecutando onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e( "Ciclo de Vida", "Estoy ejecutando onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e( "Ciclo de Vida", "Estoy ejecutando onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e( "Ciclo de Vida", "Estoy ejecutando onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e( "Ciclo de Vida", "Estoy ejecutando onResume");
    }
}