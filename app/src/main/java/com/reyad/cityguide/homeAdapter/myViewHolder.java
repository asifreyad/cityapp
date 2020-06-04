package com.reyad.cityguide.homeAdapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.reyad.cityguide.R;

public class myViewHolder extends RecyclerView.ViewHolder {

    ImageView Image;
    TextView Title, Description;

    public myViewHolder(@NonNull View itemView) {
        super(itemView);

        Image = itemView.findViewById(R.id.featured_image);
        Title = itemView.findViewById(R.id.featured_title);
        Description = itemView.findViewById(R.id.featured_description);
    }
}
