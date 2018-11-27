package com.example.claudia.appreceitas;

import android.content.Intent;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class boloActivity extends AppCompatActivity {
    final String[] tiposBolo = new String[]{
            "bolo de cenoura","bolo de chocolate","bolo de coco","pão de ló","bolo de laranja"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolo);

        ListView listView = (ListView) findViewById(R.id.listaDeBolos);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_expandable_list_item_2,
                android.R.id.text1,
                tiposBolo
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(),BoloCenouraActivity.class);
                intent.putExtra("name",tiposBolo[position]);
               // startActivity(new Intent(boloActivity.this,BoloCenouraActivity.class));
                if (position == 0) {
                    startActivity(new Intent(boloActivity.this, BoloCenouraActivity.class));
                }
                if (position ==1) {
                    startActivity(new Intent(boloActivity.this, BoloChocolateActivity.class));
                }
                if (position ==2) {
                    startActivity(new Intent(boloActivity.this,BoloCocoActivity.class));
                }
                if (position ==3) {
                    startActivity(new Intent(boloActivity.this,PaoDeLoActivity.class));
                }
                if (position ==4) {
                    startActivity(new Intent(boloActivity.this,BoloLaranjaActivity.class));
                }
            }
        });



    }
}
