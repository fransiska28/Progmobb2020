package com.e.trackeractivity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.trackeractivity.Model.MahasiswaDebugging;
import com.e.trackeractivity.R;

import java.util.ArrayList;
import java.util.List;

public class DebuggingRecyclerAdapter extends RecyclerView.Adapter<DebuggingRecyclerAdapter.ViewHolder> {
    private Context context;
    private List<MahasiswaDebugging> mahasiswaDebuggingList;

    public DebuggingRecyclerAdapter(Context context) {
        this.context = context;
        mahasiswaDebuggingList = new ArrayList<>();
    }

    public List<MahasiswaDebugging> getMahasiswaDebuggingList() {
        return mahasiswaDebuggingList;
    }

    public void setMahasiswaDebuggingList(List<MahasiswaDebugging> mahasiswaDebuggingList) {
        this.mahasiswaDebuggingList = mahasiswaDebuggingList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DebuggingRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_list_debugging,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DebuggingRecyclerAdapter.ViewHolder holder, int position) {
        MahasiswaDebugging m = mahasiswaDebuggingList.get(position);
    }

    @Override
    public int getItemCount() {
        return mahasiswaDebuggingList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNama, tvNim, tvNoTelp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvNim = itemView.findViewById(R.id.tvNim);
            tvNoTelp = itemView.findViewById(R.id.tvNoTelp);
        }
    }
}
