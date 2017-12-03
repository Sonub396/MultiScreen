package com.example.sonu.multiscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.sonu.multiscreen.R.id.tab;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Intent numbersintent = getIntent();

        ArrayList<Table> tables = new ArrayList<Table>();

        //data for each table row added into the arraylist
        tables.add(new Table("1","Dal","","60",""));
        tables.add(new Table("2","Meri Dal","","70",""));
        tables.add(new Table("3","Teri Dal","","80",""));
        tables.add(new Table("4","Teri Meri Dal","","90",""));


        TableAdapter adapter = new TableAdapter(this, tables);

        ListView listView = (ListView)findViewById(R.id.tab);

        listView.setAdapter(adapter);

    }

}
