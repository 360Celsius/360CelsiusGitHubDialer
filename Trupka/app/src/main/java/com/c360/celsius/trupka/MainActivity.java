package com.c360.celsius.trupka;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.c360.celsius.trupka.fragments.AllContactsFragment;
import com.c360.celsius.trupka.fragments.DialerFragment;
import com.c360.celsius.trupka.fragments.FavoriteContactsFragment;
import com.c360.celsius.trupka.fragments.HIstoryContactsFragment;
import com.c360.celsius.trupka.fragments.SettingsFragment;
import com.c360.celsius.trupka.viewhelpers.BottomNavigationViewHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mainView;
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Window window = getWindow();

        // clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        // add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        // finally change the color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(ContextCompat.getColor(this,R.color.status_bar_color));
        }

        mainView = (RelativeLayout) findViewById(R.id.main_view);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        //Buttom buttons navigation
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        String selectedFragmentTag = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                selectedFragment = new FavoriteContactsFragment();
                                selectedFragmentTag = FavoriteContactsFragment.TAG;
                                break;
                            case R.id.action_item2:
                                selectedFragment = new HIstoryContactsFragment();
                                selectedFragmentTag = HIstoryContactsFragment.TAG;
                                break;
                            case R.id.action_item3:
                                selectedFragment = new DialerFragment();
                                selectedFragmentTag = DialerFragment.TAG;
                                break;
                            case R.id.action_item4:
                                selectedFragment = new AllContactsFragment();
                                selectedFragmentTag = AllContactsFragment.TAG;
                                break;
                            case R.id.action_item5:
                                selectedFragment = new SettingsFragment();
                                selectedFragmentTag = SettingsFragment.TAG;
                                break;
                        }
                        FragmentTransaction ft =   getSupportFragmentManager().beginTransaction();
                        if(getSupportFragmentManager().findFragmentById(R.id.list_view_placeholder) != null) {
                            ft.remove(getSupportFragmentManager().findFragmentById(R.id.list_view_placeholder));
                            ft.add(R.id.list_view_placeholder,selectedFragment,selectedFragmentTag);
                            ft.commit();
                        }else{
                            ft.add(R.id.list_view_placeholder, selectedFragment,selectedFragmentTag);
                            ft.commit();
                        }

                        return true;
                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        bottomNavigationView.setSelectedItemId(R.id.action_item3);
    }
}
