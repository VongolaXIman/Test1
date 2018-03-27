package com.kango.test1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int size=30;//private is better

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

        /*printout.setTextSize(size);
          printout.setText(i + "\n " + n + "\n " + e);*/

        //Toast.makeText(this, i + "\n " + n + "\n " + e, Toast.LENGTH_LONG);//short

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("學號: " + i + "\n " + n + ",您好" + "\n " + "您的email是: " + e);
        builder.setTitle("Print");
        builder.setPositiveButton("OK",null);
        builder.setNeutralButton("Nothing",null);
        builder.setNegativeButton("Cancel",null);
        builder.show();
    }
}