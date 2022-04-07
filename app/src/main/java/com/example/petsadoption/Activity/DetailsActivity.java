package com.example.petsadoption.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.petsadoption.R;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
     ImageView imageViewImage=findViewById(R.id.imageViewImage);
       ImageView imageViewBackbutton;
        imageViewBackbutton =findViewById(R.id.imageViewBackbutton);
        imageViewBackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(DetailsActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
        TextView textViewPetName,textViewPatDescription,textViewRating,textViewCategoryDetails,textViewWeight,textViewLength,textViewYear,textViewPrice;

        textViewCategoryDetails =findViewById(R.id.textViewCategoryDetails);
        textViewWeight =findViewById(R.id.textViewWeight);
        textViewLength =findViewById(R.id.textViewLength);
        textViewYear =findViewById(R.id.textViewYear);
        textViewPrice =findViewById(R.id.textViewPrice);
        textViewPetName =findViewById(R.id.textViewPetName);
        textViewPatDescription =findViewById(R.id.textViewPatDescription);
        textViewRating =findViewById(R.id.textViewRating);

        try {
            String name = getIntent().getExtras().getString("name");
            String category = getIntent().getExtras().getString("category");
            String length = getIntent().getExtras().getString("length");
            String price = getIntent().getExtras().getString("price");
            String weight = getIntent().getExtras().getString("weight");
            String year = getIntent().getExtras().getString("year");
            String itemRate = getIntent().getExtras().getString("itemRate");
            String Discription = getIntent().getExtras().getString("Discription");
            int itemImage = getIntent().getExtras().getInt("itemImage");
            textViewPetName.setText(name);
            textViewCategoryDetails.setText(category);
            textViewWeight.setText(weight);
            textViewLength.setText(length);
            textViewYear.setText(year);
            textViewPrice.setText(price);
            textViewPatDescription.setText(itemRate);
            textViewRating.setText(Discription);
            imageViewImage.setImageResource(itemImage);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}