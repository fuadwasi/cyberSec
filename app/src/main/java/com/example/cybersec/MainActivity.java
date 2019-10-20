package com.example.cybersec;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button ent,bn_b;
    NetworkInfo wifiCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



        ent = findViewById(R.id.en_but);
        bn_b =findViewById(R.id.bn_but);
        ConnectivityManager connectionManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        wifiCheck = connectionManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        if (wifiCheck.isConnected()) {
            // Do whatever here
            //Toast.makeText(getApplicationContext(), "Is your network Secured?", Toast.LENGTH_LONG).show();

            WifiManager wifiManagera = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            WifiInfo wifiInfoa = wifiManagera.getConnectionInfo();
            String wifinamea = wifiInfoa.getSSID();

            AlertDialog.Builder wifiAlt = new AlertDialog.Builder(MainActivity.this);
            wifiAlt.setIcon(R.drawable.caution);
            wifiAlt.setTitle("Wifi Security Check");
            wifiAlt.setMessage("You are connected to a wifi connection.\n\nSSID: "+wifinamea+".\n\nIs your network Secured?");
            wifiAlt.setCancelable(true);
            wifiAlt.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            AlertDialog wifiAltCall = wifiAlt.create();
            wifiAltCall.show();

        }

        ent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ent_call = new Intent(MainActivity.this, Enter_page.class);
                startActivity(ent_call);
            }
        });

        bn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn_call = new Intent(MainActivity.this,English.class);
                startActivity(bn_call);
            }
        });



    }
    public void onBackPressed()
    {
        AlertDialog.Builder exAlt = new AlertDialog.Builder(MainActivity.this);

        exAlt.setCancelable(true);
        exAlt.setMessage("Do you want to exit?");
        exAlt.setTitle("Exit");

        exAlt.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        exAlt.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog exitAltcall = exAlt.create();
        exitAltcall.show();
    }
}
