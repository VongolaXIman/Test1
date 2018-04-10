package com.kango.test1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int size=30;//private is better

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

        //printout = findViewById(R.id.textView);
    }

    public void printresult(View v){
        String i = id.getText().toString();
        String n = name.getText().toString();
        String e = email.getText().toString();

        /*printout.setTextSize(size);
          printout.setText(i + "\n " + n + "\n " + e);*/

        //Toast.makeText(this, i + "\n " + n + "\n " + e, Toast.LENGTH_LONG).show();//short

        new AlertDialog.Builder(this)
                .setMessage(getText(R.string.studentid) + ": " + i + "\n " + n + getText(R.string.hello) + "\n " + getText(R.string.uemail) + ": " + e)
                .setTitle(R.string.title)
                .setPositiveButton(getText(R.string.ok),new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d("執行跳轉","604410984段為康");
                        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                        startActivity(intent);
                    }
                })
                .setNeutralButton(getText(R.string.nothing),null)
                .setNegativeButton(getText(R.string.cancel),null)
                .show();
    }

    public void printresult2(View v){
        String i = id.getText().toString();
        String n = name.getText().toString();
        String e = email.getText().toString();

        Toast.makeText(this, getText(R.string.studentid) + ": " + i + "\n " + n + getText(R.string.hello) + "\n " + getText(R.string.uemail) + ": " + e, Toast.LENGTH_LONG).show();
    }
}