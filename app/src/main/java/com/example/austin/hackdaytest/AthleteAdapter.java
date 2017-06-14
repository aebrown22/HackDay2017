package com.example.austin.hackdaytest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Austin on 6/11/17.
 */

public class AthleteAdapter extends ArrayAdapter<Athlete> {

    Context mContext;
    int mLayoutResourceId;
    Athlete[] mData;

    public AthleteAdapter(Context mContext, int mLayoutResourceId, Athlete[] mData){
        super(mContext,mLayoutResourceId,mData);
        this.mContext=mContext;
        this.mLayoutResourceId=mLayoutResourceId;
        this.mData=mData;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        row = inflater.inflate(mLayoutResourceId,parent,false);

        ImageView icon = (ImageView) row.findViewById(R.id.imageView);
        TextView athleteName = (TextView) row.findViewById(R.id.playerName);
        TextView sportName = (TextView) row.findViewById(R.id.sport);

        Athlete currAthlete = mData[position];

        athleteName.setText(currAthlete.getName());
        sportName.setText(currAthlete.getSport());

        int iconId = mContext.getResources().getIdentifier(currAthlete.getNameOfPic(),"mipmap",mContext.getPackageName());
        icon.setImageResource(iconId);

        return row;



    }
}
