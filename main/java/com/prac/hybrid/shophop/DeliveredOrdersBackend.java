package com.prac.hybrid.shophop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DeliveredOrdersBackend extends AppCompatActivity {
    ListView listview;
    String[] orders={"abc,deliverd","def,deliverd","hij,deliverd","klm,delivered","nop,delivered"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivered_orders_frontend);
        listview=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,orders);
        listview.setAdapter(adapter);
    }
}
