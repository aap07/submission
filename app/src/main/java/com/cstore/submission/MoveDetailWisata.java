package com.cstore.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MoveDetailWisata extends AppCompatActivity {

    ImageView imgPhoto;
    TextView tvNama, tvAlamat, tvHarga, tvOperasional, tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_detail_wisata);

        int poto = getIntent().getIntExtra("poto",0);
        String name = getIntent().getStringExtra("nama");
        String alamat = getIntent().getStringExtra("alamat");
        String operasional = getIntent().getStringExtra("operasional");
        String detail = getIntent().getStringExtra("detail");
        String harga = getIntent().getStringExtra("harga");

        imgPhoto = findViewById(R.id.img_detail_item_photo);
        tvNama = findViewById(R.id.tv_detail_item_name);
        tvAlamat = findViewById(R.id.tv_detail_item_lokasi);
        tvHarga = findViewById(R.id.tv_detail_item_harga);
        tvOperasional = findViewById(R.id.tv_detail_item_operasional);
        tvDetail = findViewById(R.id.tv_detail_item_detail);

        imgPhoto.setImageResource(poto);
        tvNama.setText(name);
        tvOperasional.setText(operasional);
        tvDetail.setText(detail);
        tvAlamat.setText(alamat);
        tvHarga.setText(harga);
    }
}
