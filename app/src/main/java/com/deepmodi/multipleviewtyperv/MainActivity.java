package com.deepmodi.multipleviewtyperv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.deepmodi.multipleviewtyperv.adapters.DataAdapter;
import com.deepmodi.multipleviewtyperv.models.Ads;
import com.deepmodi.multipleviewtyperv.models.Data;
import com.deepmodi.multipleviewtyperv.models.Stories;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Data> dataList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList =  new ArrayList<>();
        recyclerView = findViewById(R.id.dataRecyclerView);

        // Prepare the dummy data.
        prepareData();

        // Setup the recyclerview
        setUpRecyclerView();


    }

    private void prepareData(){
        Ads ads1 = new Ads("Ad1","This is the AD1 heading","This is the AD1 link.");
        Ads ads2 = new Ads("Ad2","This is the AD2 heading","This is the AD2 link.");
        Ads ads3 = new Ads("Ad3","This is the AD3 heading","This is the AD3 link.");
        Ads ads4 = new Ads("Ad4","This is the AD4 heading","This is the AD4 link.");
        Ads ads5 = new Ads("Ad5","This is the AD5 heading","This is the AD5 link.");

        Stories stories1 = new Stories("Author1","Story 1 title","story 1 subtitle.");
        Stories stories2 = new Stories("Author1","Story 2 title","story 2 subtitle.");
        Stories stories3 = new Stories("Author1","Story 3 title","story 3 subtitle.");
        Stories stories4 = new Stories("Author1","Story 4 title","story 4 subtitle.");
        Stories stories5 = new Stories("Author1","Story 5 title","story 5 subtitle.");
        Stories stories6 = new Stories("Author1","Story 6 title","story 6 subtitle.");
        Stories stories7 = new Stories("Author1","Story 7 title","story 7 subtitle.");
        Stories stories8 = new Stories("Author1","Story 8 title","story 8 subtitle.");
        Stories stories9 = new Stories("Author1","Story 9 title","story 9 subtitle.");

        Data data1 = new Data("ad",ads1);
        Data data2 = new Data("story",stories1);
        Data data3 = new Data("story",stories2);
        Data data4 = new Data("story",stories3);
        Data data5 = new Data("ad",ads2);
        Data data6 = new Data("story",stories4);
        Data data7 = new Data("story",stories5);
        Data data8 = new Data("story",stories6);
        Data data9 = new Data("story",stories7);
        Data data10 = new Data("story",stories8);
        Data data11 = new Data("ad",ads3);
        Data data12 = new Data("ad",ads4);
        Data data13 = new Data("story",stories9);
        Data data14 = new Data("ad",ads5);

        dataList.add(data1);
        dataList.add(data2);
        dataList.add(data3);
        dataList.add(data4);
        dataList.add(data5);
        dataList.add(data6);
        dataList.add(data7);
        dataList.add(data8);
        dataList.add(data9);
        dataList.add(data10);
        dataList.add(data11);
        dataList.add(data12);
        dataList.add(data13);
        dataList.add(data14);
    }

    private void setUpRecyclerView(){
        DataAdapter adapter = new DataAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}