package com.example.amangupta.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Aback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aback);
        ArrayList<exersises> word=new ArrayList<exersises>();

        word.add(new exersises("Chin-Ups",R.drawable.chin));
        word.add(new exersises("Lat Pull-Downs",R.drawable.latpull));
        word.add(new exersises("Seated Rows",R.drawable.chainpull));
        word.add(new exersises("One Arm Dumbell Rows",R.drawable.onehand));
        word.add(new exersises("Deadlifts",R.drawable.deadlift));

        Adapter adapter =new Adapter(this,word);


        ListView listView = (ListView) findViewById(R.id.activity_aback);

        listView.setAdapter(adapter);
    }
}
