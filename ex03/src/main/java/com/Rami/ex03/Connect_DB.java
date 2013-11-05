package com.Rami.ex03;

import android.content.Context;

/**
 * Created by pc on 05/11/13.
 */
public class Connect_DB
{
    private static Connect_DB ourInstance = null;
    private Context context;

    private Connect_DB (Context context)
    {
        this.context = context;
    }

    public static synchronized Connect_DB getInstance (Context context)
    {
        if(ourInstance==null)
            ourInstance=new Connect_DB(context);
        return ourInstance;
    }

}
