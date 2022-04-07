package com.example.petsadoption.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.petsadoption.Activity.AdoptionActivity;
import com.example.petsadoption.DataModel.AdoptionButtonDataModel;
import com.example.petsadoption.R;

import java.util.ArrayList;

public class AdoptionButtonAdapter extends RecyclerView.Adapter<AdoptionButtonAdapter.ViewHolder> {
    private final ArrayList<AdoptionButtonDataModel> mData;
    private final AdoptionActivity adapteractivity;

    // data is passed into the constructor
    public AdoptionButtonAdapter(ArrayList<AdoptionButtonDataModel> data, AdoptionActivity adapteractivity) {
      this.mData = data;
        this.adapteractivity = adapteractivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.row_button_adoption, parent, false);
        AdoptionButtonAdapter.ViewHolder viewHolder = new AdoptionButtonAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(AdoptionButtonAdapter.ViewHolder holder, int position) {
      //  AdoptionButtonDataModel animal = mData.get(position);
        holder.textViewButtonText.setText(mData.get(position).getTextButtonName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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
        TextView textViewButtonText;


        ViewHolder(View itemView) {
            super(itemView);
            textViewButtonText = itemView.findViewById(R.id.textViewButtonText);



        }
    }
}
