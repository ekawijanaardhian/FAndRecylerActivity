package com.example.fragmentactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    ArrayList<EntityNews> newsArrayList;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        preparedata();



    }

    public void preparedata(){
        newsArrayList = new ArrayList<>();
        newsArrayList.add(new EntityNews("PBO","damang","17-09-2022"));
        newsArrayList.add(new EntityNews("Alin","damang","18-09-2022"));
        newsArrayList.add(new EntityNews("TBO","damang","19-09-2022"));
        newsArrayList.add(new EntityNews("Mobile","damang","20-09-2022"));
        newsArrayList.add(new EntityNews("PKN","damang","21-09-2022"));
        CustomAdapter customAdapter = new CustomAdapter(newsArrayList, MainActivity.this);
        recyclerView.setAdapter(customAdapter);

    }
}