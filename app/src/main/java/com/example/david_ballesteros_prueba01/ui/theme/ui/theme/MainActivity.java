package com.example.david_ballesteros_prueba01.ui.theme.ui.theme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material3.TopAppBarDefaults;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.david_ballesteros_prueba01.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = this.findViewById(R.id.button2);
        btn.setOnClickListener((view) -> {
            Toast.makeText(this, " R.id.button", Toast.LENGTH_SHORT).show();
            double divider = ( (EditText) this.findViewById(R.id.editTextNumber)).getText();


        });
    }

}