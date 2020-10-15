package com.e.trackeractivity.Pertemuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.e.trackeractivity.Adapter.DebuggingRecyclerAdapter;
import com.e.trackeractivity.Adapter.MahasiswaRecyclerAdapter;
import com.e.trackeractivity.Model.Mahasiswa;
import com.e.trackeractivity.Model.MahasiswaDebugging;
import com.e.trackeractivity.R;

import java.util.ArrayList;
import java.util.List;

public class DebuggingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debugging);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rvLatihan);
        DebuggingRecyclerAdapter debuggingRecyclerAdapter;

        //data dummy
        List<MahasiswaDebugging> mahasiswaDebuggingList = new ArrayList<MahasiswaDebugging>();

        //generate data mahasiswa
        MahasiswaDebugging m1 = new MahasiswaDebugging("Argo", "72110101", "084646464646");
        MahasiswaDebugging m2 = new MahasiswaDebugging("Halim", "72110101", "084646464646");
        MahasiswaDebugging m3 = new MahasiswaDebugging("Jong Jek Siang", "72110101", "084646464646");
        MahasiswaDebugging m4 = new MahasiswaDebugging("Katon", "72110101", "084646464646");
        MahasiswaDebugging m5 = new MahasiswaDebugging("Yetli", "72110101", "084646464646");

       mahasiswaDebuggingList.add(m1);
       mahasiswaDebuggingList.add(m2);
       mahasiswaDebuggingList.add(m3);
       mahasiswaDebuggingList.add(m4);
       mahasiswaDebuggingList.add(m5);

       debuggingRecyclerAdapter = new DebuggingRecyclerAdapter(DebuggingActivity.this);
       debuggingRecyclerAdapter.setMahasiswaDebuggingList(mahasiswaDebuggingList);

       rv.setLayoutManager(new LinearLayoutManager(DebuggingActivity.this));
       rv.setAdapter(debuggingRecyclerAdapter);
    }
}
