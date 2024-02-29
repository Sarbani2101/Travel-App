package com.example.tourismapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tourismapp.Adapter.CategoryAdapter;
import com.example.tourismapp.Adapter.PopularAdapter;
import com.example.tourismapp.Domain.CategoryDomain;
import com.example.tourismapp.Domain.PopularDomain;
import com.example.tourismapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPopular, adapterCat;
    private RecyclerView recyclerViewPopular, recyclerViewCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain>items=new ArrayList<>();
        items.add(new PopularDomain("Mar Caible,Avendia Lago","Miami Beach","This 2 bed /1 bath home boasts an enormous," +
                "open-living plan, accented by striking" +
                " architectural features and high end finishes." +
                "Feel inspired by open sight lines that" +
                "embrace the outdoors, crowned by stunning" +
                "coffered ceilings.",2,true,4.8,"pic1",true,1000));
        items.add(new PopularDomain("Passo Rolle TN","Hawaii Beach","This 2 bed /1 bath home boasts an enormous," +
                "open-living plan, accented by striking" +
                " architectural features and high end finishes." +
                "Feel inspired by open sight lines that" +
                "embrace the outdoors, crowned by stunning" +
                "coffered ceilings.",1,false,5,"pic2",false,2500));
        items.add(new PopularDomain("Mar Caible,Avendia Lago","Miami Beach","This 2 bed /1 bath home boasts an enormous," +
                "open-living plan, accented by striking" +
                " architectural features and high end finishes." +
                "Feel inspired by open sight lines that" +
                "embrace the outdoors, crowned by stunning" +
                "coffered ceilings.",3,true,4.3,"pic3",true,3000));

        recyclerViewPopular = findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterPopular = new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);



        ArrayList<CategoryDomain>catsList=new ArrayList<>();
        catsList.add(new CategoryDomain("Beaches", "cat1"));
        catsList.add(new CategoryDomain("Camps", "cat2"));
        catsList.add(new CategoryDomain("Forests", "cat3"));
        catsList.add(new CategoryDomain("Desserts", "cat4"));
        catsList.add(new CategoryDomain("Mountains", "cat5"));


        recyclerViewCategory = findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterCat = new CategoryAdapter((catsList));
        recyclerViewCategory.setAdapter(adapterCat);


    }
}