package com.example.lesson_bottomnavbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;



import com.example.jean.jcplayer.view.JcPlayerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationView;
    private ViewPager viewPager;
    JcPlayerView jcPlayerView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.bottomNav);
        viewPager = findViewById(R.id.viewPager);
         jcPlayerView = findViewById(R.id.jcplayer);
        jcPlayerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Đã click",Toast.LENGTH_SHORT).show();
            }
        });
        setupViewPager();
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.actionHome:
                        viewPager.setCurrentItem(0);
                        Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.actionSongs:
                        viewPager.setCurrentItem(1);
                        Toast.makeText(MainActivity.this,"Bài Hát",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.actionAlbums:
                        viewPager.setCurrentItem(2);
                        Toast.makeText(MainActivity.this,"Album",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.actionArists:
                        viewPager.setCurrentItem(3);
                        Toast.makeText(MainActivity.this,"Ca Sĩ",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.actionPlayList:
                        viewPager.setCurrentItem(4);
                        Toast.makeText(MainActivity.this,"Play List",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_top,menu);
        return super.onCreateOptionsMenu(menu);
    }

    private  void setupViewPager(){

        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0 :
                        navigationView.getMenu().findItem(R.id.actionHome).setChecked(true);
                        break;
                    case 1:
                        navigationView.getMenu().findItem(R.id.actionSongs).setChecked(true);
                            break;
                    case 2:
                        navigationView.getMenu().findItem(R.id.actionAlbums).setChecked(true);
                        break;
                    case 3:
                        navigationView.getMenu().findItem(R.id.actionArists).setChecked(true);
                        break;
                    case 4:
                        navigationView.getMenu().findItem(R.id.actionPlayList).setChecked(true);
                        break;
                    default:
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}