package com.esen.kubanychbekov.returndata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

   public static String RESULT_KEY = "resultKey";

    EditText editText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText= findViewById(R.id.return_edtx);
        button = findViewById(R.id.return_btn);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String text = editText.getText().toString();
               Intent intent = new Intent();
               intent.putExtra(RESULT_KEY,text);
               setResult(RESULT_OK,intent);
               finish();
           }
       });


    }
}
