package com.example.amangupta.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Abiceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abiceps);
        ArrayList<exersises> word=new ArrayList<exersises>();

        word.add(new exersises("Curls",R.drawable.curls));
        word.add(new exersises("Barbell Curls",R.drawable.barbellcurl));
        word.add(new exersises("Hammer Curls",R.drawable.hf));
        word.add(new exersises("Concentration Curls",R.drawable.concf));
        word.add(new exersises("Low Pulley Curls",R.drawable.lowpulley));

        Adapter adapter =new Adapter(this,word);


        ListView listView = (ListView) findViewById(R.id.activity_abiceps);

        listView.setAdapter(adapter);
    }
}
