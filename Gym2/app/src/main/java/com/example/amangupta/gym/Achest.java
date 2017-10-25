package com.example.amangupta.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Achest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achest);



        ArrayList<exersises> word=new ArrayList<exersises>();

        word.add(new exersises("Bench Press",R.drawable.benchpress1));
        word.add(new exersises("Incline press",R.drawable.incline));
        word.add(new exersises("Dumbbell Press",R.drawable.dumbell));
        word.add(new exersises("Dumble Flys",R.drawable.dumbbellflly));
        word.add(new exersises("Decline Press",R.drawable.decline));
        word.add(new exersises("Push-Ups",R.drawable.pushups1));

        Adapter adapter =new Adapter(this,word);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
