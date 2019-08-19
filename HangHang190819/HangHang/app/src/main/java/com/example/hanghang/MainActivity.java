package com.example.hanghang;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        initLayout();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initLayout() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);

        drawerLayout = (DrawerLayout) findViewById(R.id.dl_main_drawer_root);
        navigationView = (NavigationView) findViewById(R.id.nv_main_navigation_root);
        drawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.drawer_open,
                R.string.drawer_close
        );
        drawerLayout.addDrawerListener(drawerToggle);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.modify_cloth:
                Toast.makeText(this, "옷장 수정하기", Toast.LENGTH_SHORT).show();
                break;
            case R.id.manage_device:
                Toast.makeText(this, "디바이스 관리", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "설정", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }

    public void onButton1Clicked(View v) {
        Intent intent = new Intent(MainActivity.this, FindClothActivity.class);
        startActivity(intent);
    }

    public void onButton2Clicked(View v) {
        Intent intent = new Intent(MainActivity.this, CodyActivity.class);
        startActivity(intent);
    }

    public void onButton3Clicked(View v) {
        Intent intent = new Intent(MainActivity.this, HangActivity.class);
        startActivity(intent);
    }

    public void onButton4Clicked(View v) {
        Intent intent = new Intent(MainActivity.this, PhotoActivity.class);
        startActivity(intent);
    }

}
