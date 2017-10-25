package com.example.amangupta.gym;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AmanGupta on 03-10-2017.
 */

public class Adapter extends ArrayAdapter<exersises> {
    public Adapter(Activity context, ArrayList<exersises> e) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, e);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        exersises currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.exname);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.getExersise());


        ImageView imageView1 = (ImageView) listItemView.findViewById(R.id.img12);
        // Set the ImageView to the image resource specified in the current Word
        imageView1.setImageResource(currentAndroidFlavor.getImage1ResourceId());





        return listItemView;




    }
}
