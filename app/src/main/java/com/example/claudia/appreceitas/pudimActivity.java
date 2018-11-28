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

public class pudimActivity extends AppCompatActivity {
    final String[] tiposPudim = new String[]{
            "pudim de pão","pudim de coco","pudim de laranja","pudim de chocolate","pudeim de leite condensado"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pudim);

        ListView listView = (ListView) findViewById(R.id.listaDePudins);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_expandable_list_item_2,
                android.R.id.text1,
                tiposPudim
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(),pudimPaoActivity.class);
                intent.putExtra("name",tiposPudim[position]);

                if (position == 0) {
                    startActivity(new Intent(pudimActivity.this, pudimPaoActivity.class));
                }
                if (position ==1) {
                    startActivity(new Intent(pudimActivity.this, pudimCocoActivity.class));
                }
                if (position ==2) {
                    startActivity(new Intent(pudimActivity.this, pudimLaranjaActivity.class));
                }
                if (position ==3) {
                    startActivity(new Intent(pudimActivity.this, pundinChocolateActivity.class));
                }
                if (position ==4) {
                    startActivity(new Intent(pudimActivity.this, pudimLeiteActivity.class));
                }
            }
        });



    }
}
