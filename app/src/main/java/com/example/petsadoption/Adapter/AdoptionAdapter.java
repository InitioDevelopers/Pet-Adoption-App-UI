package com.example.petsadoption.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.petsadoption.Activity.AdoptionActivity;
import com.example.petsadoption.Activity.DetailsActivity;
import com.example.petsadoption.DataModel.AdoptionDataModel;
import com.example.petsadoption.R;

import java.util.ArrayList;

public class AdoptionAdapter extends RecyclerView.Adapter<AdoptionAdapter.ViewHolder> {
    private final ArrayList<AdoptionDataModel> mData;
    private final AdoptionActivity adapteractivity;

    // data is passed into the constructor
    public AdoptionAdapter(ArrayList<AdoptionDataModel> data, AdoptionActivity adapteractivity) {
        this.mData = data;
        this.adapteractivity = adapteractivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public AdoptionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.row_adoption, parent, false);
        AdoptionAdapter.ViewHolder viewHolder = new AdoptionAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(AdoptionAdapter.ViewHolder holder, int position) {
        AdoptionDataModel animal = mData.get(position);
        holder.textViewPetName.setText(animal.getPetName());
        holder.textViewPatDescription.setText(animal.getDiscription());
        holder.textViewRating.setText(animal.getPetRate());
        holder.imageViewpetImage.setImageResource(mData.get(position).getPetImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(adapteractivity, DetailsActivity.class);
                i.putExtra("name",animal.getPetName());
                i.putExtra("itemImage",animal.getPetImage());
                i.putExtra("itemRate",animal.getPetRate());
                i.putExtra("Discription",animal.getDiscription());
                adapteractivity.startActivity(i);
            }
        });

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewPetName, textViewPatDescription, textViewRating;
        ImageView imageViewpetImage;

        ViewHolder(View itemView) {
            super(itemView);
            textViewPetName = itemView.findViewById(R.id.textViewPetName);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPatDescription = itemView.findViewById(R.id.textViewPatDescription);
            imageViewpetImage = itemView.findViewById(R.id.imageViewpetImage);


        }
    }
}
