package com.e.trackeractivity.Crud;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.trackeractivity.Model.DefaultResult;
import com.e.trackeractivity.Network.GetDataService;
import com.e.trackeractivity.Network.RetrofitClientInstance;
import com.e.trackeractivity.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HapusMhsActivity extends AppCompatActivity {
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hapus_mhs);

        final EditText edNim = (EditText)findViewById(R.id.editTextNim);
        Button btnHapus = (Button)findViewById(R.id.btnHapus);
        pd = new ProgressDialog(HapusMhsActivity.this);

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                Call<DefaultResult> call = service.delete_mhs(
                        edNim.getText().toString(),
                        "72170158"
                );
                call.enqueue(new Callback<DefaultResult>() {
                    @Override
                    public void onResponse(Call<DefaultResult> call, Response<DefaultResult> response) {
                        pd.dismiss();
                        Toast.makeText(HapusMhsActivity.this, "Data Berhasil Dihapus", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<DefaultResult> call, Throwable t) {
                        pd.dismiss();
                        Toast.makeText(HapusMhsActivity.this, "Gagal", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
