package com.e.trackeractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.e.trackeractivity.Pertemuan2.CardActivity;
import com.e.trackeractivity.Pertemuan2.ListActivity;
import com.e.trackeractivity.Pertemuan2.RecyclerActivity;
import com.e.trackeractivity.Pertemuan4.DebuggingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variable
        final TextView txtView = (TextView)findViewById(R.id.mainActivityTextView);
        Button mybtn = (Button)findViewById(R.id.button1);
        final EditText myEditText = (EditText)findViewById(R.id.editText1);
        Button btnHelp = (Button)findViewById(R.id.btnHelp);

        //Pertemuan2
        Button btnList = (Button)findViewById(R.id.buttonListView);
        Button btnRecycler = (Button)findViewById(R.id.buttonRecyclerView);
        Button btnCard = (Button)findViewById(R.id.buttonCardView);

        //pertemuan4
        Button btnPertemuan = (Button) findViewById(R.id.btnPertemuan);

        //action
        txtView.setText(R.string.text_hello_world);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("Coba Klik",myEditText.getText().toString());
                txtView.setText(myEditText.getText().toString());
            }
        });
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                Bundle b = new Bundle();

                b.putString("help_string",myEditText.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
        });
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
        btnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });
        btnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardActivity.class);
                startActivity(intent);
            }
        });
        btnPertemuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DebuggingActivity.class);
                startActivity(intent);
            }
        });
    }
}
