package com.example.petsadoption.Adapter;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petsadoption.Activity.AdoptionActivity;
import com.example.petsadoption.Activity.HomeActivity;
import com.example.petsadoption.DataModel.CategoryDataModel;
import com.example.petsadoption.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private final ArrayList<CategoryDataModel> mData;
    private final HomeActivity homeActivity;

    // data is passed into the constructor
    public CategoryAdapter(ArrayList<CategoryDataModel> data, HomeActivity homeActivity) {
        this.mData = data;
        this.homeActivity = homeActivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.row_pets_category, parent, false);
        CategoryAdapter.ViewHolder viewHolder = new CategoryAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(CategoryAdapter.ViewHolder holder, int position) {
        CategoryDataModel animal = mData.get(position);
        holder.textViewName.setText(animal.getPetName());
        holder.textViewDiscription.setText(animal.getPetInformation());
        holder.cardViewCategory.setCardBackgroundColor((Color.parseColor(animal.getColor())));
        holder.imageViewPetImage.setImageResource(mData.get(position).getPetImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(homeActivity, AdoptionActivity.class);
                homeActivity.startActivity(i);
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
        TextView textViewName, textViewDiscription;
        ImageView imageViewPetImage;
        CardView cardViewCategory;


        ViewHolder(View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            cardViewCategory = itemView.findViewById(R.id.cardViewCategory);
            textViewDiscription = itemView.findViewById(R.id.textViewDiscription);
            imageViewPetImage = itemView.findViewById(R.id.imageViewPetImage);


        }
    }
}
