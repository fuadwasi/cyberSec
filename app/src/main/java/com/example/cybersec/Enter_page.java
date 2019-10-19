package com.example.cybersec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Enter_page extends AppCompatActivity {
    Button ch_pass, st_pass, em_ck, op_wi,sec_u,pas_chk, spe_chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_page);
        ch_pass = findViewById(R.id.en_but1);
        st_pass = findViewById(R.id.en_but2);
        em_ck   = findViewById(R.id.en_but3);
        op_wi   = findViewById(R.id.en_but4);
        sec_u   = findViewById(R.id.en_but5);
        pas_chk = findViewById(R.id.en_but6);
        spe_chk = findViewById(R.id.en_but7);

        ch_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Char_Call = new Intent(Enter_page.this, Char_Pass.class);
                startActivity(Char_Call);

            }
        });
        st_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent storng_call = new Intent(Enter_page.this, Strong_pass.class);
                startActivity(storng_call);
            }
        });

        em_ck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eml_but =new Intent(Enter_page.this, Email_Check.class);
                startActivity(eml_but);
            }
        });
        op_wi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent op_wi_call = new Intent(Enter_page.this, Risk_of_open.class);
                startActivity(op_wi_call);
            }
        });

        sec_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sec_call = new Intent(Enter_page.this, Secure_your_self.class);
                startActivity(sec_call);
            }
        });
        pas_chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pass_call = new Intent(Enter_page.this,Pass_Checker.class);
                startActivity(pass_call);
            }
        });
        spe_chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spe_call = new Intent(Enter_page.this,SpeedTest.class);
                startActivity(spe_call);
            }
        });

    }
}
