package com.example.austin.hackdaytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Austin on 6/11/17.
 */

public class ListViewActivity extends Activity {

    private ListView myListView;
    private AthleteAdapter mAthleteAdapter;

    private Athlete[] athleteArray = new Athlete[]{
        new Athlete("Charlie Blackmon", "cb", "Baseball"),
        new Athlete("DJ Lemahieu", "dj", "Baseball"),
        new Athlete("Nolan Arenado", "na", "Baseball"),
        new Athlete("Greg Holland", "gh", "Baseball"),
        new Athlete("Trevor Story", "ts", "Baseball"),
        new Athlete("Mark Reynolds", "mr", "Baseball"),
        new Athlete("Nathan MacKinnnon", "nm", "Hockey"),
        new Athlete("Tyson Barrie", "tb", "Hockey"),
        new Athlete("Matt Duchene", "md", "Hockey"),

    };

//    private String[] myArray = new String[]{
//            "one",
//            "two",
//            "three",
//            "four",
//            "five"
//    };
////
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_test);

        myListView = (ListView) findViewById(R.id.mylistview);
        mAthleteAdapter = new AthleteAdapter(getApplicationContext(),R.layout.row,athleteArray);


        if(myListView != null){
            myListView.setAdapter(mAthleteAdapter);
        }

    }
//    @Override
//    public void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.list_view_test);
//
//        myListView = (ListView) findViewById(R.id.mylistview);
//
//        ArrayAdapter myAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, myArray);
//
//        if (myListView != null){
//            myListView.setAdapter(myAdapter);
//        }
//
//    }
}
