package com.heartandsoulcafe.heartandsoul;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * Created by quocnguyen on 03/08/2016.
 */
public class CustomListAdapter extends ArrayAdapter<Items> {

    ArrayList<Items> items;
    Context context;
    int resource;

    public CustomListAdapter(Context context, int resource, ArrayList<Items> items) {
        super(context, resource, items);
        this.items = items;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_layout, null, true);

        }
        Items item = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewItems);
        Picasso.with(context).load(item.getImage()).into(imageView);

        TextView txtName = (TextView) convertView.findViewById(R.id.txtItems);
        txtName.setText(item.getName());

        TextView txtPrice = (TextView) convertView.findViewById(R.id.txtPrice);
        txtPrice.setText(item.getPrice());

        return convertView;
    }
}
