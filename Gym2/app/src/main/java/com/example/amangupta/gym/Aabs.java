package com.example.amangupta.gym;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Aabs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aabs);
        MediaPlayer ring= MediaPlayer.create(Aabs.this,R.raw.ri);
        ring.start();
        ArrayList<exersises> word=new ArrayList<exersises>();

        word.add(new exersises("Incline Bench Sit-Ups",R.drawable.chin));
        word.add(new exersises("Hanging Leg Raises",R.drawable.chainpull));
        word.add(new exersises("Crunches",R.drawable.chin));
        word.add(new exersises("Sit-Ups",R.drawable.chainpull));
        word.add(new exersises("Planks",R.drawable.chin));

        Adapter adapter =new Adapter(this,word);


        ListView listView = (ListView) findViewById(R.id.activity_aabs);

        listView.setAdapter(adapter);
    }

}
