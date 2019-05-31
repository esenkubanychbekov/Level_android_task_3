package com.esen.kubanychbekov.returndata;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    MyAdapter adapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.texttView);
        recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
    }

    public void onClick(View v){
        if (v == button){
            Intent intent = new Intent(this, SecondActivity.class);
            startActivityForResult(intent,22);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 22){
            if (resultCode == RESULT_OK){
                String text = data.getStringExtra(SecondActivity.RESULT_KEY);
                textView.setText(text);

                adapter.data.add(text);
                adapter.notifyDataSetChanged();
            }
        }

    }
}
