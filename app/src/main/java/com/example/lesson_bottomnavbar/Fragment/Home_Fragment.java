package com.example.lesson_bottomnavbar.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lesson_bottomnavbar.R;

import java.util.ArrayList;
import java.util.List;

public class Home_Fragment extends Fragment {
    View view;
    Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view= inflater.inflate(R.layout.fragment_home,container,false);
        ListView listView = view.findViewById(R.id.lvList);
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("Thắng");
        arrayList.add("Thắng");
        arrayList.add("Thắng");
        arrayList.add("Thắng");
        arrayList.add("Thắng");
        arrayList.add("Thắng");
        arrayList.add("Thắng");
        arrayList.add("Thắng");arrayList.add("Thắng1");arrayList.add("Thắng2");arrayList.add("Thắng3");arrayList.add("Thắng4");
        ArrayAdapter<String >adapter = new ArrayAdapter<String>(getActivity() , android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        return view;
    }



}
