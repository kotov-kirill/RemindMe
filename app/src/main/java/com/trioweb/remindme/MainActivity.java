package com.trioweb.remindme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initComponents();
    }

    private void initComponents(){
        this.initToolbar();
    }
    private void initToolbar(){
        this.toolbar = (Toolbar) this.findViewById(R.id.toolbar);
        this.toolbar.setTitle(R.string.app_name);
        this.toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        this.toolbar.inflateMenu(R.menu.menu_main);
    }
}
