package com.Rami.ex03;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import static java.util.Arrays.asList;

public class TaskListActivity extends Activity
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final ListView listView = (ListView) findViewById(R.id.listV_main);
        listView.setAdapter(new ItemListBaseAdapter(this, getItems()));
        Button addBtn = (Button) findViewById(R.id.add_Btn);
        addBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                startActivity(new Intent(TaskListActivity.this, CreateTaskActivity.class));
            }
        });
    }

    private ArrayList<ItemDetails> getItems ()
    {
        ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
        //ArrayList<String> toDoListArr = new ArrayList<String>[]{"sss"};
        List<String> toDoListArr = asList("study for exam", "write research paper.", "Find a new dentist", "Learn Italian", "Learn Italian", "Mock task 1", "Upgrade website", "Pizza", "follow-up", "Mock task 2",
                "leave the office", "don't write down");

        ItemDetails itemDetails = null;

        for (String temp : toDoListArr)
        {
            itemDetails = new ItemDetails();
            itemDetails.setName(temp);
            itemDetails.setbtnText("Done");
            results.add(itemDetails);
        }
        for (String temp : toDoListArr)
        {
            itemDetails = new ItemDetails();
            itemDetails.setName(temp);
            itemDetails.setbtnText("Done");
            results.add(itemDetails);
        }

        return results;
    }
}