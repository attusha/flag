package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) this.findViewById(R.id.listView);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russianRUB, R.string.stolR));
        list.add(new DataFlags(R.drawable.za, R.string.africa, R.string.africaZAR, R.string.stolA));
        list.add(new DataFlags(R.drawable.sg, R.string.singapore, R.string.singaporeSGD, R.string.stolS));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.turkishTRY, R.string.stolT));
        list.add(new DataFlags(R.drawable.us, R.string.america, R.string.americaVAL, R.string.stolAm));
        list.add(new DataFlags(R.drawable.mk, R.string.makedonia, R.string.makedoniaVAL, R.string.stolM));
        list.add(new DataFlags(R.drawable.kr, R.string.korea, R.string.koreaVAL, R.string.stolK));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }

}