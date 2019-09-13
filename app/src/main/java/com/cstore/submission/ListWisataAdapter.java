package com.cstore.submission;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ListViewHolder> {
    private ArrayList<Wisata> listWisata;
    public ListWisataAdapter(ArrayList<Wisata> list) {
        this.listWisata = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_wisata, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Wisata wisata = listWisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(wisata.getPoto())
                .apply(new RequestOptions().override(80, 80))
                .into(holder.imgPhoto);
        holder.tvNama.setText(wisata.getNama());
        holder.tvAlamat.setText(wisata.getAlamat());
        holder.tvOperasional.setText(wisata.getOperasional());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent moveWithDataIntent = new Intent(context, MoveDetailWisata.class);
                moveWithDataIntent.putExtra("poto", listWisata.get(position).getPoto());
                moveWithDataIntent.putExtra("nama", listWisata.get(position).getNama());
                moveWithDataIntent.putExtra("alamat", listWisata.get(position).getAlamat());
                moveWithDataIntent.putExtra("operasional", listWisata.get(position).getOperasional());
                moveWithDataIntent.putExtra("harga", listWisata.get(position).getHarga());
                moveWithDataIntent.putExtra("detail", listWisata.get(position).getDetail());
                context.startActivity(moveWithDataIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvAlamat, tvOperasional;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_wisata_poto);
            tvNama = itemView.findViewById(R.id.tv_wisata_nama);
            tvAlamat = itemView.findViewById(R.id.tv_wisata_alamat);
            tvOperasional = itemView.findViewById(R.id.tv_wisata_operasional);
        }
    }
}
