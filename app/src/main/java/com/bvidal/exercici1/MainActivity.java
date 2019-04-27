package com.bvidal.exercici1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button btnSecAct;
    public EditText txtuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_myicon);

        btnSecAct = (Button) findViewById(R.id.btnEnviar);
        txtuser = (EditText) findViewById(R.id.txtuser);

        btnSecAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuari = txtuser.getText().toString();

                if (usuari != null && !usuari.isEmpty()){
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "El camp de usuari és obligatori.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
