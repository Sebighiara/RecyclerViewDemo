package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ListAdapter adapter = new ListAdapter();
        recyclerView.setAdapter(adapter);


        DataModel modelOne = new DataModel();
        modelOne.setTitleOne("Title one");
        modelOne.setTitleTwo("Title two");
        modelOne.setDeleteButton("Delete");
        adapter.addData(modelOne);

        DataModel modelTwo = new DataModel();
        modelTwo.setTitleOne("Title one");
        modelTwo.setTitleTwo("Title two");
        modelTwo.setDeleteButton("Delete");
        adapter.addData(modelTwo);

        DataModel modelThree = new DataModel();
        modelThree.setTitleOne("Title one");
        modelThree.setTitleTwo("Title two");
        modelThree.setDeleteButton("Delete");
        adapter.addData(modelThree);

        DataModel modelFour = new DataModel();
        modelFour.setTitleOne("Title one");
        modelFour.setTitleTwo("Title two");
        modelFour.setDeleteButton("Delete");
        adapter.addData(modelFour);

    }
}