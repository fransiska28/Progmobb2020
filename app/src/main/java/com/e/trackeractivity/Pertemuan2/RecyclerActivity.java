package com.e.trackeractivity.Pertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.e.trackeractivity.Adapter.MahasiswaRecyclerAdapter;
import com.e.trackeractivity.Model.Mahasiswa;
import com.e.trackeractivity.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rvLatihan);
        MahasiswaRecyclerAdapter mahasiswaRecyclerAdapter;

        //data dummy
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        //generate data mahasiswa
        Mahasiswa m1 = new Mahasiswa("Fransiska", "72170158", "082268097122");
        Mahasiswa m2 = new Mahasiswa("Ayu", "72170168", "082268097123");
        Mahasiswa m3 = new Mahasiswa("Gloria", "72170178", "082268097124");
        Mahasiswa m4 = new Mahasiswa("Wahyu", "72170188", "082268097125");
        Mahasiswa m5 = new Mahasiswa("Ayub", "72170198", "082268097126");

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);
        mahasiswaList.add(m3);
        mahasiswaList.add(m4);
        mahasiswaList.add(m5);

        mahasiswaRecyclerAdapter = new MahasiswaRecyclerAdapter(RecyclerActivity.this);
        mahasiswaRecyclerAdapter.setMahasiswaList(mahasiswaList);

        rv.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));
        rv.setAdapter(mahasiswaRecyclerAdapter);
    }
}
