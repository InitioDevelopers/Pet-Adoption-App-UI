package com.example.petsadoption.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.petsadoption.Adapter.AdoptionAdapter;
import com.example.petsadoption.Adapter.AdoptionButtonAdapter;
import com.example.petsadoption.Adapter.CategoryAdapter;
import com.example.petsadoption.DataModel.AdoptionButtonDataModel;
import com.example.petsadoption.DataModel.AdoptionDataModel;
import com.example.petsadoption.DataModel.AdoptionDataModel;
import com.example.petsadoption.DataModel.RecommendDataModel;
import com.example.petsadoption.R;

import java.util.ArrayList;

public class AdoptionActivity extends AppCompatActivity {
    RecyclerView recycleAdoption,recycleAdoptionButton;
    private ArrayList<AdoptionDataModel> arrayListAdoption = new ArrayList<>();
    private ArrayList<AdoptionButtonDataModel> arrayListAdoptionButton = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_adoption);
        ImageView imageViewFilter=findViewById(R.id.imageViewFilter);
        imageViewFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(AdoptionActivity.this,FilterActivity.class);
                startActivity(i);
            }
        });
        recycleAdoption = (RecyclerView) findViewById(R.id.recycleAdoption);
        recycleAdoptionButton = (RecyclerView) findViewById(R.id.recycleAdoptionButton);
        addDataCategory();
        addDataButtons();
    }

    private void addDataCategory() {
        arrayListAdoption.clear();
        AdoptionDataModel AdoptionDataModel1 = new AdoptionDataModel();
        AdoptionDataModel1.setId(1);
        AdoptionDataModel1.setPetName("Abby");
        AdoptionDataModel1.setPetImage(R.drawable.dogpic2);
        AdoptionDataModel1.setDiscription("It is a Coolest Dog ");
        AdoptionDataModel1.setPetRate("3.5");
        arrayListAdoption.add(AdoptionDataModel1);

        AdoptionDataModel AdoptionDataModel2 = new AdoptionDataModel();
        AdoptionDataModel2.setId(2);
        AdoptionDataModel2.setPetName("Georgia");
        AdoptionDataModel2.setPetImage(R.drawable.dogpic3);
        AdoptionDataModel2.setDiscription("it is a cutest Cat");
        AdoptionDataModel2.setPetRate("7.5");
        arrayListAdoption.add(AdoptionDataModel2);

        AdoptionDataModel AdoptionDataModel3 = new AdoptionDataModel();
        AdoptionDataModel3.setId(3);
        AdoptionDataModel3.setPetName("Tommy");
        AdoptionDataModel3.setDiscription("it is a cutest Rabbit");
        AdoptionDataModel3.setPetImage(R.drawable.dogpic4);
        AdoptionDataModel3.setPetRate("9.5");
        arrayListAdoption.add(AdoptionDataModel3);

        AdoptionDataModel AdoptionDataModel4 = new AdoptionDataModel();
        AdoptionDataModel4.setId(4);
        AdoptionDataModel4.setPetName("Mimmy");
        AdoptionDataModel4.setDiscription("it is a cutest Cat");
        AdoptionDataModel4.setPetImage(R.drawable.catpic2);
        AdoptionDataModel4.setPetRate("9.5");
        arrayListAdoption.add(AdoptionDataModel4);

        AdoptionDataModel AdoptionDataModel5 = new AdoptionDataModel();
        AdoptionDataModel5.setId(5);
        AdoptionDataModel5.setPetName("Alisa");
        AdoptionDataModel5.setDiscription("it is a cutest Cat");
        AdoptionDataModel5.setPetImage(R.drawable.catpic3);
        AdoptionDataModel5.setPetRate("5.5");
        arrayListAdoption.add(AdoptionDataModel5);

        AdoptionDataModel AdoptionDataModel6 = new AdoptionDataModel();
        AdoptionDataModel6.setId(6);
        AdoptionDataModel6.setPetName("Belly");
        AdoptionDataModel6.setDiscription("it is a cutest Cat");
        AdoptionDataModel6.setPetImage(R.drawable.catpic4);
        AdoptionDataModel6.setPetRate("4.5");
        arrayListAdoption.add(AdoptionDataModel6);
        AdoptionAdapter adapterCategory= new AdoptionAdapter(arrayListAdoption, AdoptionActivity.this);
        recycleAdoption.setLayoutManager(new GridLayoutManager(this, 2));
        recycleAdoption.setAdapter(adapterCategory);
    }
    private void addDataButtons() {
        arrayListAdoptionButton.clear();
        AdoptionButtonDataModel AdoptionButtonDataModel1 = new AdoptionButtonDataModel();
        AdoptionButtonDataModel1.setId(1);
        AdoptionButtonDataModel1.setTextButtonName("All");
        arrayListAdoptionButton.add(AdoptionButtonDataModel1);


        AdoptionButtonDataModel AdoptionButtonDataModel2 = new AdoptionButtonDataModel();
        AdoptionButtonDataModel2.setId(2);
        AdoptionButtonDataModel2.setTextButtonName("Meeting");
        arrayListAdoptionButton.add(AdoptionButtonDataModel2);


        AdoptionButtonDataModel AdoptionButtonDataModel3 = new AdoptionButtonDataModel();
        AdoptionButtonDataModel3.setId(3);
        AdoptionButtonDataModel3.setTextButtonName("Adoption");
        arrayListAdoptionButton.add(AdoptionButtonDataModel3);


        AdoptionButtonDataModel AdoptionButtonDataModel4 = new AdoptionButtonDataModel();
        AdoptionButtonDataModel4.setId(4);
        AdoptionButtonDataModel4.setTextButtonName("Donates");
        arrayListAdoptionButton.add(AdoptionButtonDataModel4);


        AdoptionButtonDataModel AdoptionButtonDataModel5 = new AdoptionButtonDataModel();
        AdoptionButtonDataModel5.setId(5);
        AdoptionButtonDataModel5.setTextButtonName("Favourite");
        arrayListAdoptionButton.add(AdoptionButtonDataModel5);

        AdoptionButtonAdapter adapterChefs = new AdoptionButtonAdapter(arrayListAdoptionButton, AdoptionActivity.this);
        recycleAdoptionButton.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recycleAdoptionButton.setAdapter(adapterChefs);
    }
}