package com.example.petsadoption.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.petsadoption.Activity.DetailsActivity;
import com.example.petsadoption.Activity.HomeActivity;
import com.example.petsadoption.DataModel.RecommendDataModel;
import com.example.petsadoption.R;

import java.util.ArrayList;

public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.ViewHolder> {
    private HomeActivity homeActivity;
    private final ArrayList<RecommendDataModel> mData;

    // data is passed into the constructor
    public RecommendAdapter(ArrayList<RecommendDataModel> data, HomeActivity homeActivity) {
        this.mData = data;
        this.homeActivity=homeActivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public RecommendAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_pets_recommded, parent, false);
        RecommendAdapter.ViewHolder viewHolder = new RecommendAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(RecommendAdapter.ViewHolder holder, int position) {
        RecommendDataModel animal = mData.get(position);
        holder.textViewPetName.setText(animal.getPetName());
        holder.textViewRating.setText(animal.getPetRate());
        holder.textViewPatDescription.setText(animal.getDiscription());
        holder.imageViewpetImage.setImageResource(mData.get(position).getPetImage());
        //   holder.imageLogo.setImageResource(mData.get(position).getChefImagelogo());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(homeActivity, DetailsActivity.class);
                i.putExtra("name",animal.getPetName());
                i.putExtra("itemImage",animal.getPetImage());
                i.putExtra("itemRate",animal.getPetRate());
                i.putExtra("category",animal.getCategory());
                i.putExtra("length",animal.getLength());
                i.putExtra("price",animal.getPrice());
                i.putExtra("year",animal.getYear());
                i.putExtra("weight",animal.getWeight());
                i.putExtra("itemRate",animal.getPetRate());
                i.putExtra("Discription",animal.getDiscription());
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
        TextView textViewPetName,textViewRating,textViewPatDescription;
        ImageView imageViewpetImage;


        ViewHolder(View itemView) {
            super(itemView);
            textViewPetName = itemView.findViewById(R.id.textViewPetName);
            textViewRating=itemView.findViewById(R.id.textViewRating);
            textViewPatDescription=itemView.findViewById(R.id.textViewPatDescription);
            imageViewpetImage=itemView.findViewById(R.id.imageViewpetImage);


        }
    }
}
