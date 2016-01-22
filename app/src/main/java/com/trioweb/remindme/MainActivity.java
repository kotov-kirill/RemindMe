package com.trioweb.remindme;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public static final int TAB_NOTIFICATION = 1;

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initComponents();
    }

    private void initComponents(){
        this.initToolbar();
        this.initNavigationView();
        this.initTabs();
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

    private void initNavigationView() {
        this.drawerLayout = (DrawerLayout) this.findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, this.drawerLayout,
                this.toolbar, R.string.view_navigation_open, R.string.view_navigation_close);
        this.drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) this.findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()){
                    case R.id.action_notification:
                        showNotificationTab();
                        break;
                }
                return true;
            }
        });
    }

    private void initTabs() {
        this.viewPager = (ViewPager) this.findViewById(R.id.view_pager);
        this.viewPager.setAdapter(new CustomPagerAdapter(this, getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) this.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void showNotificationTab(){
        this.viewPager.setCurrentItem(TAB_NOTIFICATION);
    }
}
