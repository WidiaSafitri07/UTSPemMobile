package com.example.aplikasi_pembelajaran;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class pemantik extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemantik);
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
