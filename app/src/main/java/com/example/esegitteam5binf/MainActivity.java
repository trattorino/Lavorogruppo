package com.example.esegitteam5binf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void visualizza(View v){
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), "Davide", Toast.LENGTH_SHORT);
        toast.show();
    }

}