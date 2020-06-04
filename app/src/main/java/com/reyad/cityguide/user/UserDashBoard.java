package com.reyad.cityguide.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.reyad.cityguide.R;
import com.reyad.cityguide.common.loginsignup.StartUp;
import com.reyad.cityguide.homeAdapter.MyItem;
import com.reyad.cityguide.homeAdapter.myAdapter;

import java.util.ArrayList;

public class UserDashBoard extends AppCompatActivity {

    RecyclerView FeaturedRecycler;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

        FeaturedRecycler = findViewById(R.id.featured_recycler);

        Recycler();
    }

    //
    private void Recycler() {
        FeaturedRecycler.setHasFixedSize(true);
        FeaturedRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<MyItem>listItems = new ArrayList<>();
        listItems.add(new MyItem(R.drawable.ic_person_24dp,"RFL","Every product have its own Branding & always provide best quality.. "));
        listItems.add(new MyItem(R.drawable.ic_person_24dp,"NASIR","Every product have its own Branding & always provide best quality.. "));
        listItems.add(new MyItem(R.drawable.ic_person_24dp,"KIAM","Every product have its own Branding & always provide best quality.. "));
        listItems.add(new MyItem(R.drawable.ic_person_24dp,"HOKINGS","Every product have its own Branding & always provide best quality.. "));
        listItems.add(new MyItem(R.drawable.ic_person_24dp,"CELLO","Every product have its own Branding & always provide best quality.. "));


        adapter = new myAdapter(listItems);
        FeaturedRecycler.setAdapter(adapter);
    }

    // call startup page
    public void Add(View view) {
        Intent intent = new Intent(UserDashBoard.this, StartUp.class);
        startActivity(intent);

    }

}