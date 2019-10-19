package com.example.cybersec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English extends AppCompatActivity {

    Button pass_page_but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        pass_page_but = findViewById(R.id.pass_page_button);


        pass_page_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pass_page_call = new Intent(English.this, Password_Button_Page.class);
                startActivity(pass_page_call);
            }
        });
    }
}
