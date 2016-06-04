package com.example.wangy.espressotest;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

    public void click(View view){

        EditText editText = (EditText) findViewById(R.id.editText);

        String s = editText.getText().toString();

        //TextView textView = (TextView) findViewById(R.id.textView);

        //textView.setText(s);


        SharedPreferences sharedPreferences = getSharedPreferences("data",MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("hhh", editText.getText().toString());


        edit.apply();

    }

    public void retrieve(View view) {

        SharedPreferences sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);
        String s = sharedPreferences.getString("hhh", "");

        String r = new StringBuilder(s).reverse().toString();
        TextView textView = (TextView) findViewById(R.id.textView);



        textView.setText("011 ESC");


    }
}
