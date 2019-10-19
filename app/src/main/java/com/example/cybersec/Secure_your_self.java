package com.example.cybersec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secure_your_self extends AppCompatActivity {
    Button vpn_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secure_your_self);
        vpn_b = findViewById(R.id.vpn_but);
        vpn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vpn_call = new Intent(Secure_your_self.this,VPN.class);
                startActivity(vpn_call);
            }
        });
    }
}
