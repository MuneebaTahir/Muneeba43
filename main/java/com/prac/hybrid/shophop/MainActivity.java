package com.prac.hybrid.shophop;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
   //TextView profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //doing on my own
       /*profile=(TextView) findViewById(R.id.profile) ;
       profile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent it0 = new Intent(MainActivity.this,VendorIDbackend.class);
               startActivity(it0);
           }
       });*/
       //did on my own
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_logout) {
            Intent it1 = new Intent(MainActivity.this, Backend.class);
            startActivity(it1);
            // Handle the camera action
        } else if (id == R.id.nav_reviews) {
            Intent it2 = new Intent(MainActivity.this, ReviewsBackend.class);
            startActivity(it2);

        } else if (id == R.id.nav_notifications) {
            Intent it3 = new Intent(MainActivity.this, DeliveredOrdersBackend.class);
            startActivity(it3);


        }  else if (id == R.id.nav_share) {

        }  else if (id == R.id.nav_send) {

        }  else if( id == R.id.nav_orders){
            Intent it9 = new Intent(MainActivity.this,ViewOrdersbackend.class);
            startActivity(it9);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void shoes(View view)
    {
        Intent it11 = new Intent(MainActivity.this, Shoesbackend.class);
        startActivity(it11);
    }
    public void jewlery(View view)
    {
        Intent it10 = new Intent(MainActivity.this,Jewlbackend.class);
        startActivity(it10);
    }

    public void clothes(View view)
    {
        Intent it6 = new Intent(MainActivity.this,Clothesbackend.class);
        startActivity(it6);
    }
    public void ZaiFashion(View view)
    {
        Toast.makeText(getApplicationContext(),"Zai Fashion",Toast.LENGTH_SHORT).show();
    }
    public void GO(View view){
        Intent it6 = new Intent(MainActivity.this,Clothesbackend.class);
        startActivity(it6);
    }
}
