package com.example.cybersec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Password_Button_Page extends AppCompatActivity {

    Button charPass, passGen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password__button__page);
        charPass = findViewById(R.id.char_but);
        passGen = findViewById(R.id.pass_cre);


        charPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent charPass_call = new Intent(Password_Button_Page.this,Char_Pass.class);
                startActivity(charPass_call);
            }
        });
        passGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passGen_call = new Intent(Password_Button_Page.this,Strong_pass.class);
                startActivity(passGen_call);
            }
        });
    }
}
