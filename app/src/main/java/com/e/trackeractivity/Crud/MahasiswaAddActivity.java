package com.e.trackeractivity.Crud;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.e.trackeractivity.Model.DefaultResult;
import com.e.trackeractivity.Network.GetDataService;
import com.e.trackeractivity.Network.RetrofitClientInstance;
import com.e.trackeractivity.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MahasiswaAddActivity extends AppCompatActivity {
        ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa_add);

        final EditText edNama = (EditText)findViewById(R.id.editTextNama);
        final EditText edNim = (EditText)findViewById(R.id.editTextNim);
        final EditText edAlamat = (EditText)findViewById(R.id.editTextAlamat);
        final EditText edEmail = (EditText)findViewById(R.id.editTextEmail);
        Button btnSimpan = (Button)findViewById(R.id.buttonSimpanMhs);
        pd = new ProgressDialog(MahasiswaAddActivity.this);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd.setTitle("Mohon Menunggu");
                pd.show();

                GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                Call<DefaultResult> call = service.add_mhs(
                        edNama.getText().toString(),
                        edNim.getText().toString(),
                        edAlamat.getText().toString(),
                        edEmail.getText().toString(),
                        "Kosongkan saja diisi sembarangan karena dirandom sistem",
                        "72170158"
                );
                call.enqueue(new Callback<DefaultResult>() {
                    @Override
                    public void onResponse(Call<DefaultResult> call, Response<DefaultResult> response) {
                        pd.dismiss();
                        Toast.makeText(MahasiswaAddActivity.this, "Data Berhasil Disimpan", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<DefaultResult> call, Throwable t) {
                        pd.dismiss();
                        Toast.makeText(MahasiswaAddActivity.this, "Gagal", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
