package com.Rami.ex03;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by pc on 05/11/13.
 */
public class ItemListBaseAdapter extends BaseAdapter
{
    private static ArrayList<ItemDetails> itemDetailsrrayList;
    private  Context context;
    private LayoutInflater l_Inflater;

    public ItemListBaseAdapter (Context context, ArrayList<ItemDetails> results)
    {
        itemDetailsrrayList = results;
        l_Inflater = LayoutInflater.from(context);
        this.context=context;

    }

    public int getCount ()
    {
        return itemDetailsrrayList.size();
    }

    public Object getItem (int position)
    {
        return itemDetailsrrayList.get(position);
    }

    public long getItemId (int position)
    {
        return position;
    }

    public View getView (int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;
        if (convertView == null)
        {
            convertView = l_Inflater.inflate(R.layout.item_details_view, null);
            holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.name);
            holder.tvbtnText = (Button) convertView.findViewById(R.id.Done_Btn);

            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvbtnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Toast.makeText( context,"ss",10 ).show();
            }
        });
        holder.tvName.setText(itemDetailsrrayList.get(position).getName());
//        holder.tvbtnText.setText(R.id.Done_Btn);
        holder.tvbtnText.setText(itemDetailsrrayList.get(position).getbtnText());

        return convertView;
    }

    private static class ViewHolder
    {
        TextView tvName;
        Button tvbtnText;

    }
}