package com.example.aplikasi_pembelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class materi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
