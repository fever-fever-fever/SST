package com.example.stt;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

public class itemActivity extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;
    private itemActivity binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_photo);


    }
}