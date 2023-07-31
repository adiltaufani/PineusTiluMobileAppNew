package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class EntertainmentDetailActivity extends AppCompatActivity {

    TextView title,price,desc,facility;
    Button kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_detail);

        kembali=findViewById(R.id.btn_kembali);
        title = findViewById(R.id.header_dbd);
        price = findViewById(R.id.harga);
        desc = findViewById(R.id.deskripsi);
        facility = findViewById(R.id.fasilitas);

        showData();

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EntertainmentDetailActivity.this, EntertainmentActivity.class);
                startActivity(intent);

            }
        });

    }
    public void showData(){
        Intent intent= getIntent();
        String Titlesrc = intent.getStringExtra("Title");
        String Pricesrc = intent.getStringExtra("Price");
        String Descsrc = intent.getStringExtra("Desc");
        String Faciltysrc = intent.getStringExtra("Facility");


        facility.setText(Faciltysrc);
        desc.setText(Descsrc);
        title.setText(Titlesrc);
        price.setText(Pricesrc);

    }
    public void showPopupMenuEntertainDet(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.inflate(R.menu.popup_menu); // Menu yang ingin ditampilkan di PopupMenu
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                // Tambahkan logika untuk mengatasi setiap item yang dipilih dari menu dropdown
                switch (item.getItemId()) {
                    case R.id.menu_item_1:
                        // Aksi untuk menu item 1
                        return true;
                    case R.id.menu_item_2:
                        // Aksi untuk menu item 2
                        return true;
                    // Tambahkan lebih banyak case sesuai dengan kebutuhan Anda
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();
    }
}