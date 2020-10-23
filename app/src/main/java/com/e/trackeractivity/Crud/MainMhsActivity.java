package com.e.trackeractivity.Crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.trackeractivity.MainActivity;
import com.e.trackeractivity.R;

public class MainMhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mhs);

        Button btnLihatMhs = (Button)findViewById(R.id.buttonGetMhs);
        Button btnTbhMhs = (Button)findViewById(R.id.buttonAddMhs);
        Button btnHapusMhs = (Button)findViewById(R.id.buttonHapusMhs);

        btnLihatMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMhsActivity.this, MahasiswaGetAllActivity.class);

                startActivity(intent);
            }
        });
        btnTbhMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMhsActivity.this, MahasiswaAddActivity.class);

                startActivity(intent);
            }
        });
        btnHapusMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMhsActivity.this, HapusMhsActivity.class);

                startActivity(intent);
            }
        });
    }
}
