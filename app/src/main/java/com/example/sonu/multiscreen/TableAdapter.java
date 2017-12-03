package com.example.sonu.multiscreen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sonu on 3/12/17.
 */

public class TableAdapter extends ArrayAdapter<Table> {
    public TableAdapter(@NonNull Context context, ArrayList<Table> tables) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for five TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0,tables);
    }
    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.table, parent, false);
        }


        Table currentTable = getItem(position);

        TextView snoTextView = (TextView) listItemView.findViewById(R.id.sno);
        snoTextView.setText(currentTable.getsno());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        snoTextView.setText(currentTable.getname());

        TextView itemTextView = (TextView) listItemView.findViewById(R.id.item);
        snoTextView.setText(currentTable.getitem());

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price);
        snoTextView.setText(currentTable.getprice());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.loc);
        snoTextView.setText(currentTable.getlocation());


        return listItemView;

    }
}
