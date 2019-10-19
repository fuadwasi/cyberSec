package com.example.cybersec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pass_Checker extends AppCompatActivity {
    Button pass_chk,str_reset;
    EditText pass_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass__checker);
        pass_chk= findViewById(R.id.pass_chk_but);
        str_reset=findViewById(R.id.chk_res_but);
        pass_input=findViewById(R.id.pass_in);

        pass_chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String password= pass_input.getText().toString();
                    Toast.makeText(getApplicationContext(), "Password Strength is: "+Pass_gene.Str_cal(password), Toast.LENGTH_LONG).show();
                }
                catch (Exception ex)
                {
                    Toast.makeText(getApplicationContext(), "Enter a valid Password", Toast.LENGTH_LONG).show();
                }


            }

        });
        str_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_input.setText("");
            }
        });

    }
}
