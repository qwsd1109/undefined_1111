package com.example.dsm2018.home_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        ArrayList<RecyclerItem> contents = new ArrayList<>();
        Recycler recyclerAdapter=new Recycler(contents);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        contents.add(new RecyclerItem(R.drawable.ic_home,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며....","sopia"));
        contents.add(new RecyclerItem(R.drawable.ic_home,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며....","sopia"));
        contents.add(new RecyclerItem(R.drawable.ic_home,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며....","sopia"));
        contents.add(new RecyclerItem(R.drawable.ic_home,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며....","sopia"));
        contents.add(new RecyclerItem(R.drawable.ic_home,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며....","sopia"));
        contents.add(new RecyclerItem(R.drawable.ic_home,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며....","sopia"));
        contents.add(new RecyclerItem(R.drawable.ic_home,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며....","sopia"));
        contents.add(new RecyclerItem(R.drawable.ic_home,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며....","sopia"));

    }
}
