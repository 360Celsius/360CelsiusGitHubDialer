package com.c360.celsius.trupka;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.c360.celsius.trupka.dbhelper.DatabaseHelper;
import com.c360.celsius.trupka.fragments.AllContactsFragment;
import com.c360.celsius.trupka.fragments.DialerFragment;
import com.c360.celsius.trupka.fragments.FavoriteContactsFragment;
import com.c360.celsius.trupka.fragments.HIstoryContactsFragment;
import com.c360.celsius.trupka.fragments.SettingsFragment;
import com.c360.celsius.trupka.viewhelpers.BottomNavigationViewHelper;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private RelativeLayout mainView;
    private BottomNavigationView bottomNavigationView;
    private BottomNavigationViewHelper bottomNavigationViewHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainView = (RelativeLayout) findViewById(R.id.main_view);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationViewHelper = new BottomNavigationViewHelper();

        //Buttom buttons navigation
        bottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
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

                                if(bottomNavigationViewHelper.getBadge() !=null && bottomNavigationViewHelper.getDialerBUtton() !=null )
                                    bottomNavigationViewHelper.setDialerImage(R.drawable.ic_dialpad_gray);

                                break;
                            case R.id.action_item2:
                                selectedFragment = new HIstoryContactsFragment();
                                selectedFragmentTag = HIstoryContactsFragment.TAG;

                                if(bottomNavigationViewHelper.getBadge() !=null && bottomNavigationViewHelper.getDialerBUtton() !=null )
                                    bottomNavigationViewHelper.setDialerImage(R.drawable.ic_dialpad_gray);

                                break;
                            case R.id.action_item3:
                                selectedFragment = new DialerFragment();
                                selectedFragmentTag = DialerFragment.TAG;

                                if(bottomNavigationViewHelper.getBadge() !=null && bottomNavigationViewHelper.getDialerBUtton() !=null )
                                    bottomNavigationViewHelper.setDialerImage(R.drawable.ic_dialpad);

                                break;
                            case R.id.action_item4:
                                selectedFragment = new AllContactsFragment();
                                selectedFragmentTag = AllContactsFragment.TAG;

                                if(bottomNavigationViewHelper.getBadge() !=null && bottomNavigationViewHelper.getDialerBUtton() !=null )
                                    bottomNavigationViewHelper.setDialerImage(R.drawable.ic_dialpad_gray);

                                break;
                            case R.id.action_item5:
                                selectedFragment = new SettingsFragment();
                                selectedFragmentTag = SettingsFragment.TAG;

                                if(bottomNavigationViewHelper.getBadge() !=null && bottomNavigationViewHelper.getDialerBUtton() !=null )
                                    bottomNavigationViewHelper.setDialerImage(R.drawable.ic_dialpad_gray);

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
