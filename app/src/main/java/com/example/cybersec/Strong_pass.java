package com.example.cybersec;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Strong_pass extends AppCompatActivity {
    Button gen,r_set,copy,save_but1;
    EditText output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strong_pass);
        gen = findViewById(R.id.gen_but);
        output = findViewById(R.id.pass_show);
        r_set = findViewById(R.id.res_but);
        copy = findViewById(R.id.copy_but);


        save_but1 = findViewById(R.id.save_but);

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager text_copy = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("EditText",output.getText().toString());
                text_copy.setPrimaryClip(clip);

                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_LONG).show();
            }
        });

        gen.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //output.setText(Pass_gene.Pass_gen_fun());

                 int n=10;
                 String pass;
                 try
                 {
                     n = Integer.parseInt(output.getText().toString());
                     if(n<6||n>35){
                         n=10;
                         Toast.makeText(getApplicationContext(), "The number is not valid.", Toast.LENGTH_LONG).show();
                         AlertDialog.Builder err1 = new AlertDialog.Builder(Strong_pass.this);

                         err1.setTitle("Error");
                         err1.setMessage("The input is invalid");
                         err1.setCancelable(true);
                         err1.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 dialog.cancel();
                             }
                         });

                         AlertDialog err1_Call = err1.create();
                         err1_Call.show();
                     }
                 }
                 catch (Exception ex)
                 {
                     Toast.makeText(getApplicationContext(), "You did not enter a valid number.", Toast.LENGTH_LONG).show();
                     AlertDialog.Builder err2 = new AlertDialog.Builder(Strong_pass.this);

                     err2.setTitle("Error");
                     err2.setMessage("The input is empty");
                     err2.setCancelable(true);
                     err2.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                             dialog.cancel();
                         }
                     });

                     AlertDialog err2_Call = err2.create();
                     err2_Call.show();
                 }
                 //output.setText(Pass_gene.Pass_gen_fun(n));

                 output.setText(Pass_gene.Pass_gen_fun2(n, true, true, true,true));
             }
         });
        r_set.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    output.setText("");
                }
        });


        save_but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }




}
