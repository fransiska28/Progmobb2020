package com.e.trackeractivity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.trackeractivity.Model.Mahasiswa;
import com.e.trackeractivity.R;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaCRUDRecyclerAdapter extends RecyclerView.Adapter<MahasiswaCRUDRecyclerAdapter.ViewHolder> {
    private Context context;
    private List<Mahasiswa> mahasiswaList;

    public MahasiswaCRUDRecyclerAdapter(Context context) {
        this.context = context;
        mahasiswaList = new ArrayList<>();
    }

    public MahasiswaCRUDRecyclerAdapter(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MahasiswaCRUDRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.litem_list_recycler,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaCRUDRecyclerAdapter.ViewHolder holder, int position) {
        Mahasiswa m = mahasiswaList.get(position);

        holder.tvNama.setText(m.getNama());
        //holder.tvNoTelp.setText(m.getNoTelp());
        holder.tvNim.setText(m.getNim());
    }

    @Override
    public int getItemCount() {
        return mahasiswaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNama, tvNim, tvNoTelp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvNim = itemView.findViewById(R.id.tvNim);
            //tvNoTelp = itemView.findViewById(R.id.tvNoTelp);
        }
    }
}
