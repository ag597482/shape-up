package com.example.amangupta.gym;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView chest=(TextView)findViewById(R.id.chest);
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ci = new Intent(MainActivity.this,Achest.class);
                startActivity(ci);
            }
        });



        TextView back=(TextView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bi = new Intent(MainActivity.this,Aback.class);
                startActivity(bi);
            }
        });



        TextView biceps=(TextView)findViewById(R.id.biceps);
        biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bii = new Intent(MainActivity.this,Abiceps.class);
                startActivity(bii);
            }
        });




        TextView triceps=(TextView)findViewById(R.id.triceps);
        triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ti = new Intent(MainActivity.this,Atriceps.class);
                startActivity(ti);
            }
        });

        TextView shoulder=(TextView)findViewById(R.id.shoulder);
        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent si = new Intent(MainActivity.this,Ashoulder.class);
                startActivity(si);
            }
        });

        TextView abs=(TextView)findViewById(R.id.abs1);
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ci = new Intent(MainActivity.this,Aabs.class);
                startActivity(ci);
            }
        });

    }

}
