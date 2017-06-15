package com.example.hanmo.gpsexam;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction mtrans = getSupportFragmentManager().beginTransaction();
        Map Map = new Map();
        mtrans.replace(R.id.map_container, Map);
        mtrans.commit();

    }


}