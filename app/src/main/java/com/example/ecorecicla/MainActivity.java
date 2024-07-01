package com.example.ecorecicla;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Version> versionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        initializeData();
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        VersionAdapter versionAdapter = new VersionAdapter(versionList);
        recyclerView.setAdapter(versionAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initializeData() {
        versionList = new ArrayList<>();
        // Add versions to the list
        versionList.add(new Version("Android 10", "10", "API level 29", "Android 10 is the latest version"));
        versionList.add(new Version("Android 11", "11", "API level 30", "Android 11 is the latest version"));
        versionList.add(new Version("Android 12", "12", "API level 31", "Android 12 is the latest version"));
        versionList.add(new Version("Android 13", "13", "API level 32", "Android 13 is the latest version"));
    }
}
