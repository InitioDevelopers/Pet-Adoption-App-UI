package com.example.petsadoption.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petsadoption.Adapter.CategoryAdapter;
import com.example.petsadoption.Adapter.RecommendAdapter;
import com.example.petsadoption.DataModel.CategoryDataModel;
import com.example.petsadoption.DataModel.RecommendDataModel;
import com.example.petsadoption.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recycleCategory, recycleRecommend;
    private final ArrayList<CategoryDataModel> arrayListBCategory = new ArrayList<>();
    private final ArrayList<RecommendDataModel> arrayListRecommend = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_home);
        recycleCategory = (RecyclerView) findViewById(R.id.recycleCategory);
        recycleRecommend = (RecyclerView) findViewById(R.id.recycleRecommended);
        addDataCategory();
        addDataRecommended();
    }

    private void addDataCategory() {
        arrayListBCategory.clear();
        CategoryDataModel CategoryDataModel1 = new CategoryDataModel();
        CategoryDataModel1.setId(1);
        CategoryDataModel1.setColor("#ff3b54");
        CategoryDataModel1.setPetName("Dog");
        CategoryDataModel1.setPetImage(R.drawable.dog);
        CategoryDataModel1.setPetInformation("It is a Coolest Dog ");
        arrayListBCategory.add(CategoryDataModel1);

        CategoryDataModel CategoryDataModel2 = new CategoryDataModel();
        CategoryDataModel2.setId(2);
        CategoryDataModel2.setPetName("Cat");
        CategoryDataModel2.setColor("#5f4fe4");
        CategoryDataModel2.setPetImage(R.drawable.cat);
        CategoryDataModel2.setPetInformation("it is a cutest Cat");
        arrayListBCategory.add(CategoryDataModel2);

        CategoryDataModel CategoryDataModel3 = new CategoryDataModel();
        CategoryDataModel3.setId(3);
        CategoryDataModel3.setPetName("Rabbit");
        CategoryDataModel3.setColor("#00e696");
        CategoryDataModel3.setPetInformation("it is a cutest Rabbit");
        CategoryDataModel3.setPetImage(R.drawable.rabbit);
        arrayListBCategory.add(CategoryDataModel3);
        CategoryAdapter adapterCategory = new CategoryAdapter(arrayListBCategory, HomeActivity.this);
        recycleCategory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recycleCategory.setAdapter(adapterCategory);
    }

    private void addDataRecommended() {
        arrayListRecommend.clear();
        RecommendDataModel RecommendDataModel1 = new RecommendDataModel();
        RecommendDataModel1.setId(1);
        RecommendDataModel1.setPetName("Tom Shelby");
        RecommendDataModel1.setPetImage(R.drawable.dogpic);
        RecommendDataModel1.setPetRate("9.5");
        RecommendDataModel1.setCategory("Dog");
        RecommendDataModel1.setLength("30CM");
        RecommendDataModel1.setPrice("$130");
        RecommendDataModel1.setWeight("10kg");
        RecommendDataModel1.setYear("1 year");
        RecommendDataModel1.setDiscription("dog is one ");
        arrayListRecommend.add(RecommendDataModel1);

        RecommendDataModel RecommendDataMode2 = new RecommendDataModel();
        RecommendDataMode2.setId(2);
        RecommendDataMode2.setPetName("Ivy Smith");
        RecommendDataMode2.setPetRate("7.6");
        RecommendDataMode2.setCategory("Cat");
        RecommendDataMode2.setLength("20CM");
        RecommendDataMode2.setPrice("$110");
        RecommendDataMode2.setWeight("7kg");
        RecommendDataMode2.setYear("6 months");
        RecommendDataMode2.setDiscription("cat is one ");
        RecommendDataMode2.setPetImage(R.drawable.catpic);
        arrayListRecommend.add(RecommendDataMode2);

        RecommendAdapter adapterTrending = new RecommendAdapter(arrayListRecommend, HomeActivity.this);
        recycleRecommend.setLayoutManager(new GridLayoutManager(this, 2));
        recycleRecommend.setNestedScrollingEnabled(false);
        recycleRecommend.setAdapter(adapterTrending);

    }


}