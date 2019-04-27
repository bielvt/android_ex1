package com.bvidal.exercici1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    public SeekBar seekbarscdAct;
    public TextView etSeekBar;
    public Button butsig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        seekbarscdAct = (SeekBar) findViewById(R.id.sbedat);
        etSeekBar = (TextView) findViewById(R.id.txtsbedat);
        etSeekBar.setText(String.valueOf(seekbarscdAct.getMin()));
        seekbarscdAct.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                etSeekBar.setText(Integer.toString(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        butsig = (Button) findViewById(R.id.btnsiguiente);

            butsig.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(SecondActivity.this, ThirdActivity.class);
                    startActivity(a);
                }
            });


    }
}
