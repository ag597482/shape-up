package com.example.amangupta.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Ashoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashoulder);
        ArrayList<exersises> word=new ArrayList<exersises>();

        word.add(new exersises("Shrugs",R.drawable.shrugf));
        word.add(new exersises("Seated Dumbbell Presses",R.drawable.seatf));
        word.add(new exersises("Front Raises",R.drawable.frontf));
        word.add(new exersises("Upright Rows",R.drawable.upritf));
        word.add(new exersises("Lateral Rises",R.drawable.latef));

        Adapter adapter =new Adapter(this,word);


        ListView listView = (ListView) findViewById(R.id.activity_ashoulder);

        listView.setAdapter(adapter);
    }
}
