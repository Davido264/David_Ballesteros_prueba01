package com.example.david_ballesteros_prueba01.ui.theme.ui.theme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material3.TopAppBarDefaults;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.david_ballesteros_prueba01.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = this.findViewById(R.id.button2);
        btn.setOnClickListener((view) -> {
            double divider = Double.parseDouble(((EditText) this.findViewById(R.id.editTextNumber)).getText().toString());
            double divisor = Double.parseDouble(((EditText) this.findViewById(R.id.editTextNumber2)).getText().toString());

            TextView txt1 = this.findViewById(R.id.textView6);
            TextView txt2 = this.findViewById(R.id.textView7);
            TextView txt3 = this.findViewById(R.id.textView8);

            int result = (int) (divider/divisor);
            int mod = (int) (divider % divisor);

            txt1.setText(String.format("%d",result));
            txt2.setText(String.format("%d",mod));
        });
    }

}