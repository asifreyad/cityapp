package com.reyad.cityguide.homeAdapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.reyad.cityguide.R;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {

    ArrayList<MyItem>listItems;
    Context context;

    public myAdapter(ArrayList<MyItem> listItems) {
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
      //b ring from array
        MyItem itemPosition = listItems.get(position);
      //use getter data
        holder.Image.setImageResource(itemPosition.Featured_image);
        holder.Title.setText(itemPosition.Featured_title);
        holder.Description.setText(itemPosition.Featured_Description);

    }

    @Override
    public int getItemCount() {

        return listItems.size();
    }
}
