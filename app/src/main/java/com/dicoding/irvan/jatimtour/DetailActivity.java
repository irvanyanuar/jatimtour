package com.dicoding.irvan.jatimtour;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_LOKASI = "extra_lokasi";
    public static final String EXTRA_JAM = "extra_jam";
    public static final String EXTRA_HARGA = "extra_harga";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle(" ");

        Bundle bundle = getIntent().getExtras();

        ImageView foto = findViewById(R.id.img_item_photo);
        TextView tvNama = findViewById(R.id.tv_item_name);
        TextView tvDetail = findViewById(R.id.tv_item_detail);
        TextView tvLokasi = findViewById(R.id.tv_lokasi);
        TextView tvJam = findViewById(R.id.tv_jam);
        TextView tvHarga = findViewById(R.id.tv_harga);
        Button btnSuka = findViewById(R.id.btn_suka);

        int img = bundle.getInt("image");
        foto.setImageResource(img);
        final String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String lokasi = getIntent().getStringExtra(EXTRA_LOKASI);
        String jam = getIntent().getStringExtra(EXTRA_JAM);
        String harga = getIntent().getStringExtra(EXTRA_HARGA);

        tvNama.setText(nama);
        tvDetail.setText(detail);
        tvLokasi.setText(lokasi);
        tvJam.setText(jam);
        tvHarga.setText(harga);

        btnSuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Anda menyukai "+nama, Toast.LENGTH_LONG).show();
            }
        });
    }

}
