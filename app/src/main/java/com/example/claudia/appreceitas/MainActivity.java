package com.example.claudia.appreceitas;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt2 = findViewById(R.id.bolo);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,boloActivity.class);
                startActivity(it);
            }
        });

        txt3 = findViewById(R.id.torta);
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,tortaActivity.class);
                startActivity(it);
            }
        });
        txt4 = findViewById(R.id.pudim);
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,pudimActivity.class);
                startActivity(it);
            }
        });




    }

}
