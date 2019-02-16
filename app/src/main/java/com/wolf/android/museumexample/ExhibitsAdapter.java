package com.wolf.android.museumexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExhibitsAdapter extends ArrayAdapter<Exhibit> {

    Context context;
    ArrayList<Exhibit> exhibitsList;

    public ExhibitsAdapter(Context context, ArrayList<Exhibit> exhibitsList) {
        super(context, 0, exhibitsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.exhibit_item, parent,
                false);
        Exhibit exhibitItem = getItem(position);
        ImageView exhibitPhoto = convertView.findViewById(R.id.exhibit_photo);
        exhibitPhoto.setImageResource(exhibitItem.getExhibitPhoto());
        TextView exhibitName = convertView.findViewById(R.id.exhibit_name);
        exhibitName.setText(exhibitItem.getExhibitName());
        return convertView;
    }


}
