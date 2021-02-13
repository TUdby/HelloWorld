package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = ((TextView) findViewById(R.id.text));
        EditText editText = ((EditText)findViewById(R.id.editText));
        // tap on button to change text color
        findViewById(R.id.changeTextColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change text color on label
                textView.setTextColor(getResources().getColor(R.color.newText));
            }
        });

        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.newBackground));
            }
        });

        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Android is Awesome!");
            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello from Tristan!");
                textView.setTextColor(getResources().getColor(R.color.mainText));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.background));
            }
        });

        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = editText.getText().toString();

                if(userText.isEmpty()){
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userText);
                    editText.setText("");
                }

            }
        });
    }
}