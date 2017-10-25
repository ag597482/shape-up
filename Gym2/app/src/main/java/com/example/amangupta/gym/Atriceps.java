package com.example.amangupta.gym;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Atriceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atriceps);


        ArrayList<exersises> word=new ArrayList<exersises>();

        word.add(new exersises("Push-Downs",R.drawable.trpush));
        word.add(new exersises("Triceps Extension",R.drawable.trext));
        word.add(new exersises("Tricep KickBacks",R.drawable.trkick));
        word.add(new exersises("Chain Pull",R.drawable.trchain));
        word.add(new exersises("Triceps Dips",R.drawable.trdip));

        Adapter adapter =new Adapter(this,word);


        ListView listView = (ListView) findViewById(R.id.activity_atriceps);

        listView.setAdapter(adapter);


    }

}
