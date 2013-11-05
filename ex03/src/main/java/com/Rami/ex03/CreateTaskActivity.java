package com.Rami.ex03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by pc on 05/11/13.
 */
public class CreateTaskActivity extends Activity
{
    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_task);
        Button createBtn = (Button) findViewById(R.id.create_Btn);
        createBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                startActivity(new Intent(CreateTaskActivity.this, TaskListActivity.class));
            }
        });
    }
}