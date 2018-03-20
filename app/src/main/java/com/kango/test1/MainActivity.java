package com.kango.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int size=15;//private is better

    private EditText id;
    private EditText name;
    private EditText email;

    private Button send;

    private TextView printout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findviews();

    }

    private void findviews() {
        id = findViewById(R.id.editText);
        name = findViewById(R.id.editText2);
        email = findViewById(R.id.editText3);

        send = findViewById(R.id.button);

        printout = findViewById(R.id.textView);
    }

    public void printresult(View v){
        String i = id.getText().toString();
        String n = name.getText().toString();
        String e = email.getText().toString();
        printout.setTextSize(size);
        printout.setText(i + n + e);
    }
}