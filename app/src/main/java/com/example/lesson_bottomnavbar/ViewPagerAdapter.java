package com.example.lesson_bottomnavbar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.lesson_bottomnavbar.Fragment.Arist_Fragment;
import com.example.lesson_bottomnavbar.Fragment.Home_Fragment;
import com.example.lesson_bottomnavbar.Fragment.Mypage_Fragment;
import com.example.lesson_bottomnavbar.Fragment.Playlist_Fragment;
import com.example.lesson_bottomnavbar.Fragment.Songs_Fragment;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new Home_Fragment();
            case 1 :
                return new Songs_Fragment();
            case 2 :
                return new Mypage_Fragment();
            case 3 :
                return new Arist_Fragment();
            case 4 :
                return new Playlist_Fragment();
            default:
                return new Home_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
